---
title: "CONECTAR UN REPOSITORIO DE GIT CON GITHUB"
date: 2024-11-13T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

<script src="/assets/scripts/copyCode.js"></script>

## **CONECTAR UN REPOSITORIO DE GIT CON GITHUB**

Damos por hecho que Git estás instalado y configurado correctamente, y que el repositorio está iniciado. Si no es asi, haz estos pasos:

1. Crea un nuevo repositorio en GitHub o utiliza uno existente. En este tutorial, crearemos uno nuevo. Ve a [GitHub](https://github.com/) y haz clic en **New repository**. Dale un nombre y configura otros detalles según lo necesites.

2. En la terminal, navega al directorio de tu proyecto local o crea un nuevo repositorio de Git con los siguientes comandos:

    ```bash
    mkdir mi-proyecto
    cd mi-proyecto
    git init
    ```


### Paso 1: Crear una clave SSH

Lo más comodo para autenticarte en GitHub sin tener que introducir tu usuario y contraseña cada vez, es generar una clave SSH y añadirla a tu cuenta de GitHub.

Para ello, vamos a ejecutar las siguientes instrucciones en la carpeta de nuestro reporsitorio, aunque se puede hacer desde cualquier ruta.
0.  Antes de empezar, debemos comrpobar si se ha creado previamente una claves SSH:

```bash
ls -al ~/.ssh
```

1. En la terminal, ejecuta el siguiente comando para generar una clave SSH:

  {% include codeHeader.html %}
  ```bash
  ssh-keygen -t ed25519 -f ~/.ssh/id_ed25519_github -C "NRE@alu365.murciaeduca.es"
  ```

   Este comando genera una clave SSH usando el tipo de encriptación ED25519, que es más seguro que RSA.

   Ahora podemos poner una "passphrase" o contraseña para mayor seguridad (esto es opcional pero recomendable). Si no queremos contraseña, **pulsamos Intro**.

2. Una vez que la clave esté generada, verás una salida similar a esta:

    ```
    Your identification has been saved in /home/********/.ssh/id_ed25519
    ```

3. Ahora, iniciamo el agente SSH :

    ```bash
    eval "$(ssh-agent -s)"
    ```
4. Y añadimos la clave:
    ssh-add ~/.ssh/id_ed25519_github
    ```

---

### Paso 2: Configurar SSH para que se añada la clave automáticamente

Edita (o cre) tu propio archivo de configuración SSH:

```bash
code ~/.ssh/config
```

Si no lo están, añade las siguientes lineas:

```bash
Host github.com
  IdentityFile ~/.ssh/id_ed25519_github
  AddKeysToAgent yes
```

De esta manera nos aseguramos que la clase SHH va a estar disponible cuando la necesitemos usar para subir los archivos a remoto.


### Paso 3: Agregar la clave SSH a tu cuenta de GitHub

1. Copia la clave pública generada en tu sistema con el siguiente comando:

    ```bash
    cat ~/.ssh/id_ed25519_github.pub
    ```

   Copia el texto de la clave que aparece en la terminal.

2. Ahora, abre tu navegador y ve a [GitHub](https://github.com/), luego inicia sesión en tu cuenta.

3. En GitHub, ve a **Settings** (Configuración) > **SSH and GPG keys** > **New SSH key**.

4. Introduce un nombre para la clave (por ejemplo, “ENTORNOS”) en el campo **Title** y pega la clave en el campo **Key**. Luego, haz clic en **Add SSH key**.

---

### Paso 4: Probar la conexión SSH

Para asegurarte de que la clave SSH está correctamente configurada, ejecuta el siguiente comando en la terminal:

```bash
ssh -T git@github.com
```

Es posible que en algunos casos aparezca el siguiente mensaje:

```bash
This key is not known by any other names.
Are you sure you want to continue connecting (yes/no/[fingerprint])?
```
escribimos ```yes``` y pulsamos **Intro** para seguir.

Si todo está configurado correctamente, verás un mensaje de bienvenida como el siguiente:

```
Hi TuNombreDeUsuario! You've successfully authenticated, but GitHub does not provide shell access.
```

---

### Paso 5: Conectar un repositorio de Git con GitHub


1. Conecta el repositorio local con el repositorio remoto en GitHub utilizando el comando `git remote set-url origin` seguido de la URL SSH de tu repositorio de GitHub. La URL SSH estará en la página del repositorio de GitHub, bajo el botón **Code** (asegúrate de elegir la opción "SSH"):

    ```bash
    git remote add origin git@github.com:TuNombreDeUsuario/NombreDelRepositorio.git
    ```

	En caso de haber conficurado previamente el reposotiorio con https:, debemos cambiar la referencia

    ```bash
	   git remote set-url origin git@github.com:TuNombreDeUsuario/NombreDelRepositorio.git
	```

2. Para verificar que el repositorio remoto se agregó correctamente, puedes usar el siguiente comando:

    ```bash
    git remote -v
    ```

   Esto mostrará una lista de URLs de repositorios remotos, que debe incluir `origin` con la URL SSH de tu repositorio en GitHub.

---

### Paso 6: Hacer tu primer push

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
