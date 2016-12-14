ENV JAVA_VERSION 8u31
ENV BUILD_VERSION b13

# Upgrading system
RUN yum -y upgrade
RUN yum -y install wget

EXPOSE 8080

#install Spring Boot artifact
FROM java:8
VOLUME /tmp
ADD /target/springrediscloud.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]