---
title: "PASOS INICIALES: INSTALACIÓN DE JAVA"
date: 2024-09-26T15:34:30-04:00
categories:
  - clases
tags:
  - java
  - temurin
---

En primer lugar, debemos de tener claro que para comenzar a desarrollar, debemos preparar un entorno adecuado que incluya todas las herramientas necesarias.

En nuestro caso, asumimos que ya tenemos instalada la máquina virtual con la que vamos a trabajar.

Ahora vamos a instalar java en nuestra máquina.

Hemos elegido [JAVA Temurin](https://adoptium.net/es/temurin/releases/) como plataforma de instalación, ya que ofrece estabilidad y actualizaciones periódicas.

Hemos seguido paso a paso el [tutorial oficial](https://adoptium.net/es/installation/linux/), que funciona correctamente.

> IMPORTANTE: En este caso, es recomendable ejecutar todos los comandos con privilegios de administrador, por lo que debemos escrbir ```sudo su```.

Los pasos son los siguientes:

0. Actualizar el sistema

  ```
  apt update && apt upgrade
  ```

1. Instalamos paquetes necesarios.

  Necesitamos instalar las herramientas necesarias para cada uno de los pasos, por lo que escribimos:

  ```
  apt-get install -y wget apt-transport-https gnupg
  ```

2.  Descargamos la clave gpg para verificar la integridad y el origen del paquete. 

  ```
  wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null
  ```
 
3. Añadimos el repositorio ofical de Eclipse Temurin.

  ```
  echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^UBUNTU_CODENAME/{print$2}' /etc/os-release) main" | tee /etc/apt/sources.list.d/adoptium.list 
  ```
  > AL SER UNA VERSION BASADA EN UBUNTU, HEMOS HECHO LA MODIFICACIÓN SUGERIDA EN EL REPOSITORIO.

4. Actualizamos el sistema de nuevo para que cargue los nuevos repositorios

  ```
  apt update
  ```

5. Instalamos JAVA.

  ```
  apt install temurin-21-jdk
  ```  
  
6. Comprobamos la instalación.

  ```
  java -version
  ```    

