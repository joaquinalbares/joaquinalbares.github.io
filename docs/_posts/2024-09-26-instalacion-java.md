---
title: "Entornos de desarrollo"
date: 2023-10-18T15:34:30-04:00
categories:
  - clases
tags:
  - java
  - temurin
---

# PASOS INICIALES PARA DESARROLLO

En primer lugar, debemos de tener claro que para comenzar a desarrollar, debemos preparar un entorno adecuado que incluya todas las herramientas necesarias.

En nuestro caso, asumimos que ya tenemos instalada la máquina virtual con la que vamos a trabajar.

Ahora vamos a instalar java en nuestra máquina.

Hemos elegido [JAVA Temurin](https://adoptium.net/es/temurin/releases/) como plataforma de instalación, ya que ofrece estabilidad y actualizaciones periódicas.

Hemos seguido paso a paso el [tutorial oficial](https://adoptium.net/es/installation/linux/), que funciona correctamente.

> PASO 0: En este caso, es recomendable ejecutar todos los comandos como su, por lo que debemos escrbir ```sudo su```

Los pasos son los siguientes:

1. Instalar paquetes necesarios

  ```java
  apt-get install -y wget apt-transport-https gnupg
  ```



