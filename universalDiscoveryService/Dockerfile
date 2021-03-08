FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/universalDiscoveryService-1.0.0.jar universalDiscoveryService-1.0.0.jar
ENV JAVA_OPTS="-Xms128m -Xmx512m -XX:MaxPermSize=128m"
ENTRYPOINT exec java -jar /universalDiscoveryService-1.0.0.jar