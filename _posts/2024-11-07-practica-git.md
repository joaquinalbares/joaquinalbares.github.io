---
title: "CONFIGURACIÓN INICIAL GIT"
date: 2024-11-07T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

## **PRÁCTICA INICIAL DE GIT**


#### 1. **Creación de un Repositorio y Comandos Básicos**

   **Comandos: `git init`, `git status`**

- **Paso 1**: 
Crea una carpeta de llamada UT05_P01 y abre la terminal en esa ubicación.

- **Paso 2**: 
Inicializa el repositorio en esa carpeta:

     ```bash
     git init
     ```

- **Paso 3**: 
Verificar que la carpeta actual ya es un repositorio de GIT comprobando su estado:

     ```bash
     git status
     ```


#### 2. **Añadir Archivos y Crear el Primer Commit**

   **Comandos: `git add`, `git commit -m`, `git log`**

- **Paso 1**: 
Crear un archivo de prueba, por ejemplo, un archivo `README.md` y otro llamado `minombre.txt`.

- **Paso 2**: 
Añade ambos archivos al área de preparación:

     ```bash
     git add README.md
	 git add minombre.txt
     ```

- **Paso 3**: 
Verificar que los archivos están en area de staging del repositorio de GIT comprobando su estado:
     ```bash
     git status
     ```

- **Paso 4**: 
Crear el primer commit:

     ```bash
     git commit -m "Primer commit: Añadidos README.md y minombre.txt"
     ```

- **Paso 5**: 
Revisar el historial de commits:
     ```bash
     git log
     ```



#### 3. **Modificar Archivos y Hacer Nuevos Commits**

   **Comandos: `git diff`, `git add`, `git commit`**

- **Paso 1**: 
Modifica el archivo `README.md` e incluye texto en markdown que describa lo que estamos haciendo y la fecha actual.

- **Paso 2**: 
Usa `git diff` para ver los cambios realizados antes de hacer el siguiente commit:

     ```bash
     git diff
     ```

- **Paso 3**: 
Añade los cambios y haz un segundo commit:

     ```bash
     git add README.md
     git commit -m "Actualizo README.md con nueva información"
     ```

