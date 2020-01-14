FROM java:8
ADD target/microserver-0.0.1-SNAPSHOT.jar microserver.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","microserver.jar"]