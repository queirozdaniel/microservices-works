FROM openjdk:11
VOLUME /tmp
ADD ./hr-user/target/hr-user-0.0.1-SNAPSHOT.jar hr-user.jar
ENTRYPOINT ["java","-jar","/hr-user.jar"]