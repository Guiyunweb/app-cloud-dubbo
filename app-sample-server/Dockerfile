FROM ibmjava:jre
MAINTAINER i@guiyunweb.com
ARG JAR_FILE=build/libs/app-sample-server.jar
RUN mkdir /opt/shareclasses
RUN mkdir /opt/app
COPY ${JAR_FILE} /opt/app/japp.jar
CMD ["java", "-Xshareclasses:cacheDir=/opt/shareclasses", "-jar", "/opt/app/japp.jar"]
