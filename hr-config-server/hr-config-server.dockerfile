FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./hr-config-server/target/hr-config-server-0.0.1-SNAPSHOT.jar hr-config-server.jar
ENTRYPOINT ["java","-jar","/hr-config-server.jar"]
