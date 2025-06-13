# Dockerfile para la aplicación de la clínica veterinaria
# Utiliza una imagen base de OpenJDK 21 en versión slim para reducir el tamaño
FROM openjdk:21-jdk-slim

# Define un argumento para el nombre del archivo JAR a copiar
ARG JAR_FILE=target/clinica_veterinaria-0.0.1.jar

# Copia el archivo JAR generado por Maven al contenedor y lo renombra como app_veterinaria.jar
COPY ${JAR_FILE} app_veterinaria.jar

# Expone el puerto 8080 para que la aplicación sea accesible desde fuera del contenedor
EXPOSE 8080

# Define el comando de inicio para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]