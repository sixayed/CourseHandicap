FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY build/libs/CourseHandicap-0.0.1-SNAPSHOT.jar CourseHandicap-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/CourseHandicap-0.0.1.jar"]