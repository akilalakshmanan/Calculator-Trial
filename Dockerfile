FROM openjdk:8
COPY ./target/Calculator_Trial-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator_Trial-1.0-SNAPSHOT-jar-with-dependencies.jar"]
