---
title: "CONECTAR UN REPOSITORIO DE GIT CON GITHUB"
date: 2024-11-13T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

## **CONECTAR UN REPOSITORIO DE GIT CON GITHUB**

Damos por hecho que Git estás instalado y configurado correctamente, y que el repositorio está iniciado.


### Paso 1: Crear una clave SSH

Lo más comodo para autenticarte en GitHub sin tener que introducir tu usuario y contraseña cada vez, es generar una clave SSH y añadirla a tu cuenta de GitHub.

Para ello, vamos a ejecutar las siguientes instrucciones en la carpeta de nuestro reporsitorio, aunque se puede hacer desde cualquier ruta.

1. En la terminal, ejecuta el siguiente comando para generar una clave SSH:

    ```bash
    ssh-keygen -t ed25519 -C "NRE@alu365.murciaeduca.es"
    ```

   Este comando genera una clave SSH usando el tipo de encriptación ED25519, que es más seguro que RSA. Durante el proceso, el sistema te pedirá una ubicación para guardar la clave:
   ```bash
   Generating public/private ed25519 key pair.
   Enter file in which to save the key (/home/joaquin/.ssh/id_ed25519): 
   ```
   Pulsamos intro para que genere la carpeta.

   Ahora podemos poner una "passphrase" o contraseña para mayor seguridad (esto es opcional pero recomendable).

2. Una vez que la clave esté generada, verás una salida similar a esta:

    ```
    Your identification has been saved in /home/joaquin/.ssh/id_ed25519
    ```

3. Ahora, carga tu clave SSH en el agente de autenticación SSH para gestionar las claves:

    ```bash
    eval "$(ssh-agent -s)"
    ssh-add ~/.ssh/id_ed25519
    ```

---

### Paso 2: Agregar la clave SSH a tu cuenta de GitHub

1. Copia la clave pública generada en tu sistema con el siguiente comando:

    ```bash
    cat ~/.ssh/id_ed25519.pub
    ```

   Copia el texto de la clave que aparece en la terminal.

2. Ahora, abre tu navegador y ve a [GitHub](https://github.com/), luego inicia sesión en tu cuenta.

3. En GitHub, ve a **Settings** (Configuración) > **SSH and GPG keys** > **New SSH key**.

4. Introduce un nombre para la clave (por ejemplo, “ENTORNOS”) en el campo **Title** y pega la clave en el campo **Key**. Luego, haz clic en **Add SSH key**.

---

### Paso 5: Probar la conexión SSH

Para asegurarte de que la clave SSH está correctamente configurada, ejecuta el siguiente comando en la terminal:

```bash
ssh -T git@github.com
```

Si todo está configurado correctamente, verás un mensaje de bienvenida como el siguiente:

```
Hi TuNombreDeUsuario! You've successfully authenticated, but GitHub does not provide shell access.
```

---

### Paso 6: Conectar un repositorio de Git con GitHub

1. Crea un nuevo repositorio en GitHub o utiliza uno existente. En este tutorial, crearemos uno nuevo. Ve a [GitHub](https://github.com/) y haz clic en **New repository**. Dale un nombre y configura otros detalles según lo necesites.

2. En la terminal, navega al directorio de tu proyecto local o crea un nuevo repositorio de Git con los siguientes comandos:

    ```bash
    mkdir mi-proyecto
    cd mi-proyecto
    git init
    ```

3. Conecta el repositorio local con el repositorio remoto en GitHub utilizando el comando `git remote add origin` seguido de la URL SSH de tu repositorio de GitHub. La URL SSH estará en la página del repositorio de GitHub, bajo el botón **Code** (asegúrate de elegir la opción "SSH"):

    ```bash
    git remote add origin git@github.com:TuNombreDeUsuario/NombreDelRepositorio.git
    ```

4. Para verificar que el repositorio remoto se agregó correctamente, puedes usar el siguiente comando:

    ```bash
    git remote -v
    ```

   Esto mostrará una lista de URLs de repositorios remotos, que debe incluir `origin` con la URL SSH de tu repositorio en GitHub.

---

### Paso 7: Hacer tu primer push

Agrega un archivo al repositorio y realiza tu primer commit para probar la conexión. 

1. Crea un archivo de prueba, por ejemplo:

    ```bash
    echo "# Mi Proyecto" > README.md
    ```

2. Agrega el archivo al índice y realiza un commit:

    ```bash
    git add README.md
    git commit -m "Primer commit"
    ```

3. Finalmente, envía los cambios al repositorio remoto en GitHub:

    ```bash
    git push -u origin main
    ```

   La primera vez que uses `git push`, es posible que necesites especificar la rama (`main` en este caso). Después, solo `git push` bastará.