FROM ubuntu:latest

RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install -y git

RUN apt-get clean \
    && rm -rf /var/lib/apt/lists/

RUN git clone https://github.com/Fhederica/Esame.git

WORKDIR /Progetto Esame

RUN mvn package

CMD [ "java", "-jar", "target/progetto-1.0-SNAPSHOT.jar" ]