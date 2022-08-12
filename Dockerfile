FROM azul/zulu-openjdk-alpine:17


ADD ./target/BookService-0.0.1-SNAPSHOT.jar      /opt/book_service_system/console/demo-0.0.1-SNAPSHOT.jar

WORKDIR /opt/book_service_system/console


# JVM 参数环境变量
ENV JVM_XMX 2048M
ENV JVM_XMS 512M

MAINTAINER Coding_lyl Rookie@fospot.cn

#CMD ["java","-jar","/opt/vscode_springboot_system/console/demo-0.0.1-SNAPSHOT.jar"]
#CMD java -server -Xmx$JVM_XMX -Xms$JVM_XMS -jar demo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/opt/book_service_system/console/demo-0.0.1-SNAPSHOT.jar"]