FROM openjdk:11
ADD target/student-docker-postgresql.jar student-docker-postgresql.jar
ENTRYPOINT ["java", "-jar","student-docker-postgresql.jar"]
EXPOSE 8080