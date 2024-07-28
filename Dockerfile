# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /TaxiBooking

# Copy the packaged jar file into the container
COPY target/TaxiBooking-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]