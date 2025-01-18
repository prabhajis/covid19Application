# Use an official OpenJDK runtime as a parent image
FROM java:8-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
# Replace 'your-app.jar' with the name of your JAR file
COPY target/covid19-0.0.1-SNAPSHOT.jar /app/covid19-0.0.1-SNAPSHOT.jar
# Expose any ports that your application uses
EXPOSE 8080

# Run the JAR file
# Replace 'your-app.jar' with your actual JAR file name
ENTRYPOINT ["java", "-jar", "/app/covid19-0.0.1-SNAPSHOT.jar"]
