package com.proginn.gitinn.grpc;

import java.util.logging.Logger;
import com.proginn.gitinn.protobuf.DependenceServiceGrpc;
import com.proginn.gitinn.protobuf.DependenceServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class JavaGrpcServer {
	
	private static final Logger logger = Logger.getLogger(JavaGrpcServer.class.getName());

	/* The port on which the server should run */
	private static int port = 50051;
	private static Server server;

	public static void start() throws Exception {
		server = ServerBuilder.forPort(port).addService(DependenceServiceGrpc.bindService(new DependenceServiceImpl()))
				.build().start();
		logger.info("Server started, listening on " + port);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its
				// JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				JavaGrpcServer.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	public static void stop() {// 关闭服务
		if (server != null) {
			server.shutdown();
		}
	}
	
	// block 一直到退出程序 
    public static void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
	
    //启动服务方法
	public static void main(String[] args) {
		
		try {
			//启动服务
			JavaGrpcServer.start();
			JavaGrpcServer.blockUntilShutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
