FROM app-jdk
MAINTAINER i@guiyunweb.com
# 添加docker-compose-wait插件
ADD https://github.guiyun.plus/ufoscout/docker-compose-wait/releases/download/2.9.0/wait /wait
RUN chmod +x /wait

# 运行
ARG JAR_FILE=build/libs/app-sample-server.jar
RUN mkdir /opt/shareclasses
RUN mkdir /opt/app
COPY ${JAR_FILE} /opt/app/japp.jar
CMD /wait &&  java -Xshareclasses:cacheDir=/opt/shareclasses -jar /opt/app/japp.jar