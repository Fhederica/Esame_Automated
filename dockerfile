#Usa l'immagine di Ubuntu più recente come base
FROM ubuntu:latest

#Aggiorna i pacchetti e installa Maven, Git e pulisce la cache degli apt
RUN apt-get update \
    && apt-get install -y maven git \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/

#Token di accesso Git
ARG GIT_TOKEN

#Clona il repository utilizzando il token di accesso Git
RUN apt-get update \
    && apt-get install -y git \
    && git clone https://${GIT_TOKEN}@github.com/Fhederica/Esame_Automated.git

#Imposta la directory di lavoro nel repository clonato
WORKDIR /Esame_Automated

#Compila il progetto Maven
RUN mvn package

#Eseguire il progetto
CMD [ "java", "-jar", "target/progetto-1.0-SNAPSHOT.jar" ]
