---
title: "PASOS INICIALES: INSTALACIÓN DE VISUAL STUDIO CODE"
date: 2024-10-02T15:34:30-04:00
categories:
  - clases
tags:
  - java
  - Visual Studio Code
---

Ahora que ya tenemos JAVA en nuestro sistema, podemos pasar a instalar un IDE para comenzar a desarrollar. Hemos elegido Visual Studio Code por ser de los más sencillos de manejo inicial. Lo haremos desde la terminal, para poder tener mayor control sobre la instalación.

Hemos seguido el tutorial encontrado en [MEDIUM](https://medium.com/@GRajeevan/how-to-install-visual-studio-code-on-ubuntu-22-04-bfc87b52cc40), pero corrigiendo un pequeño error de sintaxis que hemos encotrado.

Los pasos son los siguientes:

0. Actualizamos el sistema.
  ```
  sudo apt update && sudo apt upgrade -y
  ```
1. Instalamos paquetes necesarios.
  Necesitamos instalar las herramientas necesarias para cada uno de los pasos, por lo que escribimos:
  ```
  sudo apt install software-properties-common apt-transport-https wget -y
  ```
2.  Descargamos la clave gpg para verificar la integridad y el origen del paquete. 
  ```
  wget -O- https://packages.microsoft.com/keys/microsoft.asc | sudo gpg --dearmor | sudo tee /usr/share/keyrings/vscode.gpg
  ```
3. Añadimos el repositorio ofical de Visual Studio Code.
  ```
  echo deb [arch=amd64 signed-by=/usr/share/keyrings/vscode.gpg] https://packages.microsoft.com/repos/vscode stable main | sudo tee /etc/apt/sources.list.d/vscode.list 
  ```
4. Actualizamos el sistema de nuevo para que cargue los nuevos repositorios
  ```
  apt update
  ```

5. Instalamos Visual Studio Code.
  ```
  sudo apt install code
  ```  
 
Una vez instalado Visual Studio Code, lo ejecutamos una primera vez para terminar de configurar algunos aspesctos (tema, idioma, ...) y pasamos a instalar el [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) desde el [marketplace](https://marketplace.visualstudio.com/), el lugar donde podemos encontrar multitud de aplicaciones para Visual Studio Code.

