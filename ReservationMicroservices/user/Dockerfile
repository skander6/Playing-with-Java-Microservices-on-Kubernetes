FROM openjdk:8
ADD target/user-0.0.1-SNAPSHOT.jar user.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","user.jar"]