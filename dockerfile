FROM ubuntu:latest

RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install -y git

RUN apt-get clean \
    && rm -rf /var/lib/apt/lists/


RUN git clone https://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@github.com/Fhederica/Esame_Automated.git

WORKDIR /Esame_Automated

RUN mvn package

CMD [ "java", "-jar", "target/progetto-1.0-SNAPSHOT.jar" ]