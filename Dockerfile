FROM openjdk:11
COPY "./target/yanki-0.0.1-SNAPSHOT.jar" "yanki-0.0.1-SNAPSHOT.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","yanki-0.0.1-SNAPSHOT.jar"]