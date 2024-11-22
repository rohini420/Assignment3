# Use an official OpenJDK image as a base
FROM openjdk:17-jdk-slim

# Expose the port Spring Boot is running on
EXPOSE 8080

# Copy the built JAR file into the container
COPY target/SurveyApp-0.0.1-SNAPSHOT.jar SurveyApp-0.0.1-SNAPSHOT.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "/SurveyApp-0.0.1-SNAPSHOT.jar"]
