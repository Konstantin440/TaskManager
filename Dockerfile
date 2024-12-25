FROM openjdk:17-jdk-slim
# рабочая дерриктория
WORKDIR /app
# что копируется таргет копирует  джар и потом говорит куда копировать
COPY /target/*.jar /app/app.jar
# порт на котором работает
EXPOSE 8090
# команда для запуска джарника
ENTRYPOINT ["java","-jar","/app/app.jar"]