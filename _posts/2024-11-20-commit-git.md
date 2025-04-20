---
title: "PRÁCTICA COMMITS DE GIT"
date: 2024-11-20T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

### **Ejercicio 1: Añadir archivos y realizar un commit inicial**
1. **Objetivo:** Practicar los comandos `add` y `commit`.
2. **Instrucciones:**
   - Crea una carpeta llamada `proyecto_git`.
   - Accede a la carpeta desde la terminal y ejecuta el comando para inicializar un repositorio Git.
   - Dentro de la carpeta `proyecto_git`, crea los siguientes archivos:
     - `index.html`
     - `style.css`
     - `README.md` (con una breve descripción del proyecto).
   - Añade todos los archivos al área de preparación (staging area).
   - Realiza un commit con el mensaje: `"Commit inicial: estructura del proyecto"`.
   - Verifica el estado del repositorio después del commit con `git status`.

3. **Entrega: Pantallazo de los siguientes comandos ejecutados** 
   - Lista de archivos añadidos (`git ls-files`).
   - Historial del repositorio (`git log`).

---

### **Ejercicio 2: Ignorar archivos innecesarios con .gitignore**
1. **Objetivo:** Configurar un archivo `.gitignore`.
2. **Instrucciones:**
   - Crea un archivo `.gitignore` en la raíz del proyecto.
   - Añade las siguientes reglas al archivo `.gitignore`:
     - Ignorar todos los archivos con extensión `.log`.
     - Ignorar la carpeta `node_modules/`.
     - Ignorar archivos temporales del sistema, como `*.tmp`.
   - Crea archivos de prueba (`error.log`, `prueba.tmp`, y una carpeta `node_modules` con un archivo ficticio dentro).
   - Verifica que los archivos ignorados no se añaden al área de preparación usando `git add .`.

3. **Entrega: Pantallazo de los siguientes comandos ejecutados** 
   - Contenido del archivo `.gitignore`.
   - Captura de pantalla del comando `git status` mostrando los archivos ignorados.

---

### **Ejercicio 3: Eliminar archivos del repositorio**
1. **Objetivo:** Practicar el comando `rm` en Git.
2. **Instrucciones:**
   - Crea un archivo llamado `archivo_a_eliminar.txt` y añádelo al repositorio.
   - Realiza un commit con el mensaje: `"Se añadió archivo_a_eliminar.txt"`.
   - Usa el comando `git rm` para eliminar el archivo del repositorio y realiza un nuevo commit con el mensaje: `"Se eliminó archivo_a_eliminar.txt"`.
   - Verifica el estado del repositorio después de eliminar el archivo.

3.  **Entrega: Pantallazo de los siguientes comandos ejecutados** 
   - Historial del repositorio mostrando los commits relacionados con la eliminación del archivo.
   - Captura de pantalla del estado del repositorio (`git status`).

---

### **Ejercicio 4: Modificación y commit selectivo**
1. **Objetivo:** Practicar la preparación selectiva de archivos.
2. **Instrucciones:**
   - Modifica el archivo `README.md` para añadir más información.
   - Crea un archivo `nueva_funcionalidad.js` con un comentario inicial.
   - Usa el comando `git add` para preparar solo `README.md` y realiza un commit con el mensaje: `"Actualización de README"`.
   - Realiza otro commit con el mensaje: `"Se añadió nueva funcionalidad"` para incluir `nueva_funcionalidad.js`.

3. **Entrega:** 
   - Historial del repositorio (`git log --oneline`).
   - Comandos utilizados para añadir y commitear selectivamente.

---
