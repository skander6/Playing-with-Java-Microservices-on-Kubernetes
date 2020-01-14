FROM openjdk:8
ADD target/reservation-0.0.1-SNAPSHOT.jar reservation.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","reservation.jar"]