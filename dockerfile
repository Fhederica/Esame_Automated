FROM ubuntu:latest

RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install -y git

RUN apt-get clean \
    && rm -rf /var/lib/apt/lists/


ARG GIT_TOKEN
RUN apt-get update \
    && apt-get install -y git \
    && git clone https://${GIT_TOKEN}@github.com/Fhederica/Esame_Automated.git


WORKDIR /Esame_Automated

RUN mvn package

CMD [ "java", "-jar", "target/progetto-1.0-SNAPSHOT.jar" ]