# Use an official java runtime as base image
FROM eclipse-temurin:25-jdk

# Set working directory inside container
WORKDIR /app

# Copy jar file into the container
COPY target/userservice-0.0.1-SNAPSHOT.jar app.jar
# Expose the port this app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
