package com.proginn.gitinn.protobuf;

import java.util.List;

import com.proginn.gitinn.GitinnClone;
import com.proginn.gitinn.GitinnCmd;

import io.grpc.stub.StreamObserver;

public class DependenceServiceImpl implements DependenceServiceGrpc.DependenceService {

	@Override
	public void getDependenceList(JavaFrameworkRequest request, StreamObserver<JavaFrameworkReply> responseObserver) {
		
		//获取请求参数仓库地址，格式：https://github.com/linjuncun/*.git&username&password&projectKey
				String remotePathParame = request.getRemotePath();
				String[] split = remotePathParame.split("&");
				String remotePath = split[0];// 远程库路径
				String username = split[1];// 仓库登录名
				String password = split[2];// 仓库登录密码
				String projectKey = split[3];//仓库名
				
				try {
					//命令
					String cmd = GitinnClone.httpClone(projectKey,username, password, remotePath);
					//常用框架列表索引
					List<String> executeCmdGrpc = GitinnCmd.executeCmdGrpc(cmd);
//					int index = 0;
//					//遍历依赖列表，返回给grpc客户端
//					for(String str : executeCmdGrpc){
//					    responseObserver.onNext(JavaFrameworkReply.newBuilder().setDependence(index, str).build());
//					    index ++;
//					}
					JavaFrameworkReply build = JavaFrameworkReply.newBuilder().addAllDependence(executeCmdGrpc).build();
					responseObserver.onNext(build);
					responseObserver.onCompleted();
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
