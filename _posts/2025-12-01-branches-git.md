---
title: "UT05 - P02 - PRÁCTICA RAMAS Y CONFLICTOS EN GIT"
date: 2025-12-01T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

En esta práctica vamos a utilizar los comando de git, por lo que trabajaremos en la terminal

## Parte 1: Conexión a repositorio remoto a través de SSH

**Paso 1: Crear una clave SSH**

Para autenticarte en GitHub sin tener que introducir tu usuario y contraseña cada vez, genera una clave SSH y añádela a tu cuenta de GitHub.

1. En la terminal, ejecuta el siguiente comando para generar una clave SSH:

```bash
ssh-keygen -t ed25519 -C "111111@alu.murciaeduca.es"
```

> RECOMENDACIÓN:PON TU CORREO DE MURCIAEDUCA
  
Este comando genera una clave SSH usando el tipo de encriptación ED25519, que es más seguro que RSA.
  
Durante el proceso, el sistema te pedirá una ubicación para guardar la clave, podemos pultar 'Enter' para usar el valor predeterminado:

```
Enter file in which to save the key (/home/usuario/.ssh/id_ed25519):
```

y una contraseña para mayor seguridad. podemos pultar 'Enter' para olvidar la contraseña.

```
Enter passphrase for "/home/usuario/.ssh/id_ed25519" (empty for no passphrase):
```

2. Una vez que la clave esté generada, verás una salida similar a esta:

```
Your identification has been saved in /home/usuario/.ssh/id_ed25519
```

3. Ahora, carga tu clave SSH en el agente de autenticación SSH para gestionar las claves:

```bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_ed25519
```

---

**Paso 2: Agregar la clave SSH a tu cuenta de GitHub**

1. Copia la clave pública generada en tu sistema con el siguiente comando:

```bash
cat ~/.ssh/id_ed25519.pub
```

Copia el texto de la clave que aparece en la terminal.

2. Ahora, abre tu navegador y ve a [GitHub](https://github.com/), luego inicia sesión en tu cuenta.

3. En GitHub, ve a **Settings** (Configuración) > **SSH and GPG keys** > **New SSH key**.

4. Introduce un nombre para la clave (por ejemplo, “P02_github”) en el campo **Title** y pega la clave en el campo **Key**. Luego, haz clic en **Add SSH key**.

**Paso 3: Probar la conexión SSH**

Para asegurarte de que la clave SSH está correctamente configurada, ejecuta el siguiente comando en la terminal:

```bash
ssh -T git@github.com
```

Si todo está configurado correctamente, verás un mensaje de bienvenida como el siguiente:

```
Hi TuNombreDeUsuario! You've successfully authenticated, but GitHub does not provide shell access.
```

**Paso 4: Conéctate a tu repositorio vía SSH**  

En primer lugar, debemos verificar que el repositorio remoto está configurado correctamente usando el siguiente comando:

```bash
git remote -v
```

nos mostrará los repos remotos:

```bash
origin	https://github.com/usuario/12345667.git (fetch)
origin	https://github.com/usuario/12345667.git (push)
```

Ahora debemos añadir los repositorios SSH para poder conectarnos via terminal utilizando el comando `git remote set-url origin` seguido de la URL SSH de tu repositorio de GitHub. La URL SSH estará en la página del repositorio de GitHub, bajo el botón **Code** (asegúrate de elegir la opción "SSH"):

```bash
git remote set-url origin git@github.com:TuNombreDeUsuario/NombreDelRepositorio.git
```

---

## Parte 2: Trabajo con ramas

1. **Crea una nueva rama:**  

Desde la terminal, crea y cámbiate a una nueva rama llamada `caracteristica1`:  
```bash
git checkout -b caracteristica1
```

2. **Haz cambios en la nueva rama:**  
Entra en la carpeta `UT05` (créala si no exite) y dentro crea una carpeta llamada `P02`. Crea y abre el archivo `README.md` y añade una línea con el siguiente texto:  

```
Trabajando en la rama caracteristica1.
```

Guarda los cambios y haz un commit:

```bash
git add README.md
git commit -m "Añadida una línea desde caracteristica1"
```

3. **Cambia a la rama principal (`main`) y haz otros cambios:**  

Vuelve a la rama `main`:

```bash
git checkout main
```
	 
Haz el mismo proceso de antes y escribe una línea diferente al archivo `README.md`, por ejemplo:

```
Actualizando desde la rama principal.
```
	 
Haz un commit de estos cambios:
     
```bash
git add README.md
git commit -m "Actualización desde la rama principal"
```

---

## Parte 3: Fusión y resolución de conflictos

1. Comprueba en que rama estas

```bash
git status
```

Deberias estar en la rama `main`. Si no es así, cambia a esa rama: 

```bash
git checkout main
```


2. **Intenta fusionar `caracteristica1` con `main`:**  
   - Vuelve a la rama principal y fusiona `caracteristica1`:  
     ```bash
     git merge caracteristica1
     ```

3. **Resuelve el conflicto:**  
   - La fusión generará un conflicto porque ambas ramas modificaron la misma línea en `README.md`.
   - Abre el archivo `README.md` en tu editor de texto.  
   - Verás algo como esto:  
   
```plaintext
<<<<<<< HEAD
Actualizando desde la rama principal.
=======
Trabajando en la rama caracteristica1.
>>>>>>> caracteristica1
```
La parte supuerior indica lo que hay en remoto y la parte infrerior indica los cambios en tu rama. Ahora decide cómo combinar los cambios. Por ejemplo puedes dejar el archivo con el siguiente contenido:

```
Actualizando desde la rama principal y trabajando en la rama caracteristica1.
```

   - Guarda el archivo y finaliza la resolución del conflicto:  
```bash
git add README.md
git commit -m "Resuelto conflicto entre main y caracteristica1"
```

Finalmente, envía los cambios al repositorio remoto en GitHub:

```bash
git push
```

> **NOTA**: La primera vez que uses esrte comando, es posible que necesites especificar la rama (`-u origin main` en este caso). Después, solo `git push` bastará.
