Java项目框架检测

代码运行环境：jdk 1.8 与 maven

如果要检测的项目在本地仓库没有，根据远程仓库地址先将项目克隆到本地，普通项目使用jdk1.8新特性jdeps得到该项目的依赖树，再与框架进行匹配，如果是maven项目，使用mvn dependency:list来分析项目依赖树，最后使用Runtime.getRuntime().exec(cmd)来执行命令获取输出流即可。

最后封装成grpc服务，供其它客户端程序调用。