---
title: "PASOS INICIALES: INSTALACIÓN DE JAVA"
date: 2025-09-26T15:34:30-04:00
categories:
  - clases
tags:
  - java
  - temurin
---

El primer paso para conficgurar nuestro entornos es configurar el lenguaje de programación.

En nuestro caso, vamos a instalar java en nuestra máquina, pues es el lengaje elegido en la asignatura de programación.

Para aquellos que quieran conocer algo más de Java, pueden echar mano de los infinitos tutoriales disponibles, entre ellos el siguiente:

[https://www.tutorialspoint.com/java/index.htm](https://www.tutorialspoint.com/java/index.htm)

Para configurar java es necesario instalar el JDK(Java Developer Kit), pues tiene todas las herramientas necesarias para nostros como programadores.

Podemos elegir la instalación oficial de Java [java.com](https://www.oracle.com/java/technologies/downloads/?er=221886), o podemos optar por una instalación basada en plataformas **open source**, que es lo que vamos a hacer nosotros.

Hemos elegido [JAVA Temurin](https://adoptium.net/es/temurin/releases/) como plataforma de instalación, ya que ofrece estabilidad y actualizaciones periódicas.

> ES IMPORTANTE ELEGIR UNA VERSIÓN DE LARGO SOPORTE (LTS) PARA GARANTIZAR LA ESTABILIDAD DE LA JVM A LO LARGO DEL TIEMPO. RECIENTEMENTE HA SALIDO LA VERISÓN 25 LTS, PERO NOSOTROS USAREMOS LA 21.

Hemos seguido paso a paso el [tutorial oficial](https://adoptium.net/es/installation/linux/), que funciona correctamente.

> IMPORTANTE: En este caso, es recomendable ejecutar todos los comandos con privilegios de administrador, por lo que debemos escrbir  y ejecutar el resto de comandos como administrador.

Los pasos son los siguientes:

1. Cambiamos a superadministrador para tener todos los permisos.
```
sudo su
```

2. Actualizamos el sistema.
  ```
  apt update && apt upgrade -y
  ```

3. Instalamos paquetes necesarios.
  Necesitamos instalar las herramientas necesarias para cada uno de los pasos, por lo que escribimos:
  ```
  apt-get install -y wget apt-transport-https gnupg
  ```

4.  Descargamos la clave gpg para verificar la integridad y el origen del paquete. 
  ```
  wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null
  ```

5. Añadimos el repositorio ofical de Eclipse Temurin.
  ```
  echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^UBUNTU_CODENAME/{print$2}' /etc/os-release) main" | tee /etc/apt/sources.list.d/adoptium.list 
  ```
  > AL SER UNA VERSION BASADA EN UBUNTU, HEMOS HECHO LA MODIFICACIÓN SUGERIDA EN LA WEB.

6. Actualizamos el sistema de nuevo para que cargue los nuevos repositorios
  ```
  apt update
  ```

7. Instalamos JAVA.
  ```
  apt install temurin-21-jdk
  ```  
 
8. Comprobamos la instalación.
  ```
  java -version
  ```    

