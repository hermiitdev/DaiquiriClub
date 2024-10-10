# Usar una imagen base de Eclipse Temurin para Java 17
FROM eclipse-temurin:17-jdk-alpine

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo pom.xml y la carpeta src al contenedor
COPY . /app

# Exponer el puerto 8080 (el puerto donde Spring Boot suele correr)
EXPOSE 8080

# Comando para ejecutar la aplicación usando Maven
CMD ["./mvnw", "spring-boot:run"]
