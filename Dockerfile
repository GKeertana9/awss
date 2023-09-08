FROM openjdk:17
EXPOSE 8082
ADD target/cloud--2-0.0.1-SNAPSHOT.jar cloud--2-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/cloud--2-0.0.1-SNAPSHOT.jar" ]
