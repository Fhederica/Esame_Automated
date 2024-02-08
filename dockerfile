#Usa l'immagine di Ubuntu più recente come base
FROM ubuntu:latest

#Aggiorna i pacchetti e installa Maven, Git e pulisce la cache degli apt
RUN apt-get update \
    && apt-get install -y maven git \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/

#Clona il repository
RUN apt-get update \
    && apt-get install -y git \
    && git clone https://github.com/Fhederica/Esame_Automated.git

#Imposta la directory di lavoro nel repository clonato
WORKDIR /Esame_Automated

#Compila il progetto Maven
RUN mvn package

#Esegue il progetto
CMD [ "java", "-jar", "target/progetto-1.0-SNAPSHOT.jar" ]
