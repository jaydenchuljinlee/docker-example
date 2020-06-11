FROM openjdk:8-jdk
# 어떤 이미지로부터 새로운 이미지를 생성할 지 지정. 플랫폼 : 버전 형태로 작성
MAINTAINER cheoljin <asddqe111@gmail.com>
# Dockerfile을 생성-관리하는 사람
VOLUME /tmp
# 호스트의 directory를 docker 컨테이너에 연결. 즉 소스코드나 외부 설정파일을 커밋하지 않고 docker container에서 사용가능하도록 함
RUN mkdir -p /app/
# 도커 이미지 생성시 실행

ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} to-do-springboot.jar
# 파일이나 디렉토리를 docker image로 복사
EXPOSE 8080
# 외부에 노출할 포트 지정
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/to-do-springboot.jar"]
# docker image가 실행될 때 기본으로 실행될 command
