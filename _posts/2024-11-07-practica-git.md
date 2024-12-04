---
title: "PRÁCTICA INICIAL DE GIT"
date: 2024-11-07T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

## **PRÁCTICA INICIAL DE GIT**


### 1. **Creación de un Repositorio y Comandos Básicos**

   **Comandos: `git init`, `git status`**

- **Paso 1**: 
Crea una carpeta llamada UT05_P01 y abre la terminal en esa ubicación.

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


### 2. **Añadir Archivos y Crear el Primer Commit**

#### Explicación tórica
Tienes tu repositorio iniciado (o clonado) con una serie de archivos con los que empiezas a trabajar, creándolos, editándolos, modificándolos, etc.

Para que git sepa que tiene que empezar a tener en cuenta un archivo (a esto se le llama *preparar* un archivo), usamos la orden `git add` de este modo:

```
git add NOMBRE_DEL_ARCHIVO
```

Esto, como vimos antes, añadirá el archivo indicado con `NOMBRE_DEL_ARCHIVO` al Index. No lo archivará realmente en el sistema de control de versiones ni hará nada. Solo le informa de que debe tener en cuenta ese archivo para futuras instrucciones (que es, básicamente, en lo que consiste el Index).

Si intentas añadir al Index un archivo que no existe te dará un error.

También puedes usar *comodines*, con cosas como:

```bash
git add miarchivo.*
```

(que reconocería, por ejemplo "miarchivo.txt", "miarchivo.cosas" y "miarchivo.png")

o 

```
git add miarchivo?.txt
```

(que identificaría cosas como "miarchivo1.txt", "miarchivo2.txt" y "miarchivoZ.txt")

Y, en general, todos los comodines que permita usar tu sistema operativo.

Si, en lugar de un archivo, indicas un directorio, se agregarán al Index todos los archivos de ese directorio.

De este modo, la forma más fácil de agregar todos los archivos al
Index es mediante la orden: `git add .`, que añadirá el directorio en el que te encuentras y todo su contenido (incluyendo subdirectorios etc).

Un detalle importante es que, si mandas algo al Index con `git add` y luego lo modificas, no tendrás en Index la última versión, sino lo que hayas hecho hasta el momento del hacer el add.

Ahora vamos a ver una orden que será tu gran amiga:

```
git status
```

`git status` te da un resumen de cómo están las cosas ahora mismo respecto a la versión del repositorio (concretamente, respecto al HEAD): qué archivos has modificado, qué hay en el Index, etc. (también te cuenta cosas como en qué rama estás, pero eso lo veremos más adelante). Cada vez que no tengas muy claro qué has cambiado y qué no, consulta `git status`.

En principio, si no has modificado nada, el mensaje básico que te da `git status` es este:

```
## On branch master
nothing to commit (working directory clean)
```

Pero, y esa es una cosa que vas a ver a menudo en git, si hay algo que hacer te informa de las posibles acciones que puedes llevar a cabo dependiendo de las circunstancias actuales diciendo como, por ejemplo, `(use "git add <file>..." to update what will be committed)`.

Cuando ya has hecho los cambios que consideres necesarios y has puesto en el Index todo lo que quieras poner bajo el control de versiones, llega el momento de "hacer commit" (también se le llama "*confirmar*"). Esto significa mandar al HEAD los cambios que tenemos en el Index, y se hace de este modo:

```
git commit NOMBRE_DEL_ARCHIVO
```

Como te estarás imaginando, aquí también puedes usar comodines del mismo modo que vimos en `git add`. Además, si haces simplemente

```
git commit
```

Esto registrará todos los cambios que tengas en el Index.

Al hacer un `commit` se abre automáticamente el editor de texto que tengas por defecto en el sistema, para que puedas añadir un comentario a los cambios efectuados. Si no añades este comentario, recibirás un error y el commit no se enviará.

> Puedes cambiar el editor por otro de tu gusto con `git config --global core.editor EDITOR`, por ejemplo:
> `git config --global core.editor vim`

Si no quieres que se abra el editor puedes añadir el comentario en el mismo commit del siguiente modo:

```
git commit -m "Comentario al commit donde describo los cambios"
```

Recuerda lo que dijimos antes: si modificas un archivo después de haber hecho `git add`, esos cambios no estarán incluidos en tu `commit` (si quieres incluir la última versión, no tienes más que volver a hacer `git add` antes del `commit`).

Ahora nos puede surgir un problema: Si solo podemos confirmar con `commit` de un archivo que hayamos preparado con `add`, y solo podemos hacer `add` de un archivo que existe en nuestro directorio de trabajo, ¿cómo le decimos a git que elimine un archivo del repositorio? Para ello tenemos la orden:

```
git add -u
```

que agregará al Index la información de los archivos que deben ser borrados.

Muy similar a la anterior, `git add -A` sirve para hacer `git add -u` (preparar los archivos eliminados) y `git add .` (preparar todos los archivos modificados) en una sola orden.

Un efecto parecido se puede conseguir con

```
git commit -a
```

Esta orden sirve para confirmar todos los cambios que haya en el directorio de trabajo *aunque no hayan sido preparados* (es decir, aunque no hayas hecho `add`). Esto incluye tanto los ficheros modificados como los eliminados, con lo que sería equivalente a hacer un `git add -A` seguido de un `git commit`.

> Esta opción ahorra escribir órdenes, pero también te da más oportunidades de meter la pata. En general se recomienda usar por separado adds y commits, convenientemente salteados de `git status` para comprobar que todo va bien.


####Desarollo de la práctica

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

