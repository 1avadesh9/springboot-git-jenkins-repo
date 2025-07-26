# Use an OpenJDK 21 base image with HotSpot
FROM eclipse-temurin:21-jdk

# Set environment variables
#ENV JAVA_OPTS=""

# Create app directory
#WORKDIR /app

# Copy the WAR file into the container
#COPY springboot-git-jenkins-deployment.war /app/springboot-git-jenkins-deployment.war
ADD target/springboot-git-jenkins-deployment.war springboot-git-jenkins-deployment.war

# Expose port 8080
EXPOSE 8080

# Run the WAR file using java command
#CMD ["java", "-jar", "springboot-git-jenkins-deployment.war"]
ENTRYPOINT ["java", "-jar", "springboot-git-jenkins-deployment.war"]