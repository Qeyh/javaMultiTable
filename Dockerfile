FROM openjdk:latest
WORKDIR /usr/src/app
COPY table.java .
RUN javac table.java
CMD ["java", "table"]