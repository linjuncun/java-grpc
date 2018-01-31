package com.proginn.gitinn;

import java.util.Set;

public class GitinnMain {
	public static void main(String[] args) {

		String remotePath = "https://github.com/linjuncun/project47115.git";// 远程库路径
		String username = "18372562349";// 仓库登录名
		String password = "18372562349ljc";// 仓库登录密码
		String projectKey = "project47115";//项目标识符
		
		try {
			//命令
			String cmd = GitinnClone.httpClone(projectKey,username, password, remotePath);
			//常用框架列表索引
			Set<Integer> result = GitinnCmd.executeCmd(cmd);
			System.out.println("该项目用到的框架技术有:");
			for (int i : result) {
				System.out.println(FrameworkList.javaFrameList[i]);// 输出常用框架
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
