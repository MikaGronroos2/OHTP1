FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install

FROM openjdk:21-jdk
WORKDIR /app
COPY --from=build /app/target/Week5_lectureAssignment-1.0-SNAPSHOT.jar /app/Week5_lectureAssignment.jar
EXPOSE 8080
CMD ["java", "-jar", "Week5_lectureAssignment.jar"]