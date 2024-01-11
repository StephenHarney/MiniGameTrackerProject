FROM openjdk:21-jdk-slim
ENV PROFILE=docker

# Create a directory for your application
WORKDIR /app

# Copy the built JAR file from your local machine to the container
COPY target/MiniGameTrackerProject-0.0.1-SNAPSHOT.jar /app

# Expose the port that your service listens on
EXPOSE 8081

# Command to run your service when the container starts
CMD ["java", "-jar", "MiniGameTrackerProject-0.0.1-SNAPSHOT.jar","--spring.profiles.active=docker"]