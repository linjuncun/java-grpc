package com.proginn.gitinn.grpc;

import com.proginn.gitinn.protobuf.DependenceServiceGrpc;
import com.proginn.gitinn.protobuf.JavaFrameworkReply;
import com.proginn.gitinn.protobuf.JavaFrameworkRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class JavaGrpcClient {
	public static void serverStream(String remotePath) {

		final ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 50051).usePlaintext(true).build();
		// 定义同步阻塞的stub
		DependenceServiceGrpc.DependenceServiceBlockingStub blockingStub = DependenceServiceGrpc
				.newBlockingStub(channel);

		JavaFrameworkRequest request = JavaFrameworkRequest.newBuilder().setRemotePath(remotePath).build();
		// 调用grpc服务返回结果
		JavaFrameworkReply dependenceList = blockingStub.getDependenceList(request);
		//关闭
		channel.shutdown();
		System.out.println(dependenceList.toString());
	}

	public static void main(String[] args) {
		// 远程库路径
		String remotePath = "https://github.com/linjuncun/project47115.git&18372562349&18372562349ljc&project47115";
		serverStream(remotePath);
	}
}
