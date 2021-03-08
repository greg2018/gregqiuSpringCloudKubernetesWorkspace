FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/universalEcommerce-1.0.0.jar universalEcommerce-1.0.0.jar
ENV JAVA_OPTS="-Xms128m -Xmx512m -XX:MaxPermSize=128m"
ENTRYPOINT exec java -jar /universalEcommerce-1.0.0.jar