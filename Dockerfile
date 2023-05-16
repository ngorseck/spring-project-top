FROM openjdk:13-jdk-alpine

# Définition des variables d'environnement
ENV APP_HOME /app
ENV APP_VERSION 1.0.0-SNAPSHOT
ENV APP_NAME j2ee_application_cv

# Installation de Maven
RUN apk add --no-cache maven

# Création du répertoire de l'application
RUN mkdir -p ${APP_HOME}/logs ${APP_HOME}/config

# Copie du code source dans l'image Docker
COPY . ${APP_HOME}

# Compilation et packaging de l'application
WORKDIR ${APP_HOME}
RUN mvn clean package -DskipTests

# Définition du point d'entrée de l'application
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/target/j2ee_application_cv.jar"]


