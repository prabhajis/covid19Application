# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
# Replace 'your-app.jar' with the name of your JAR file
COPY target/Covid19Application.jar /app/Covid19Application.jar

# Expose any ports that your application uses
EXPOSE 8080

# Run the JAR file
# Replace 'your-app.jar' with your actual JAR file name
ENTRYPOINT ["java", "-jar", "/app/Covid19Application.jar"]