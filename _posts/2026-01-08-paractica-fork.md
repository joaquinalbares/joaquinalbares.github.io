---
title: "UT05 - P04 - PRÁCTICA DE FORK Y PULL REQUEST"
date: 2026-01-08T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - evaluación
---
## RESUMEN DE LA PRÁCTICA A REALIZAR
La práctica consiste en realizar un fork de un repositorio y realizar un pull request para fusionar los cambios en el repositorio original. Para ello cada alumno debe hacer fork de los repositorios de los demás miembros del equipo y hacer un **pull request** para cada uno.

### Desarrollo de la práctica

### Pasos previos: Creación de equipos y repositorios.
Crearemos equipos de tres alumnos en nuestra organización:

[https://github.com/orgs/ies-los-albares/teams](https://github.com/orgs/ies-los-albares/teams)

Cada alumno debe crear un repositorio propio en GitHub, con el nombre `<NRE>_UT05_P04`. (Ej: 111222_UT05_P05) que contenga un archivo `README.MD` con el nombre completo y el NRE del alumno que lo ha creado.

Una vez creado el repositorio, debe asignar como colaboradores al equipo al que pertenece. Esto se hace en `Settings`, apartado `Collaborators and teams`, y seleccionando el equipo.

#### Paso 1: Crear un fork del repositorio
 Cada uno de vosotros debe realizar un **fork** de ls dos repositorios del resto de compañeros del equipo en su cuenta de GitHub. Esto generará una nueva URL que será la que useis para vuestro trabajo. La llamaremos `<NRE_ORIGINAL>_UT05_P05_FORK_<NRE>`, donde `<NRE_ORIGINAL>` es el número de NRE del alumno que ha creado el repositorio original y `<NRE>` es el número de NRE del alumno que está forkeando.

Se hace pulsando el botón fork que está en la parte superior derecha del repositorio:

![botón FORK](/assets/images/2026-01-08-01.png)

#### Paso 2: Clonar los repositorios forkeados
Cada alumno debe clonar sus dos repositorios forkeados a su ordenador local usando:

```bash
git clone <NRE_ORIGINAL>_UT05_P05_FORK_<NRE>
```

o bien directamente desde VSCode.

#### Paso 3: Asignación de tareas individuales
Los equipos se organizarán de la siguiente manera:
- Se ordenarán por NRE de forma ascendete.
- El alumno 1 creará un fork del repositorio del alumno 2  y creará a carpeta `HTML`, con un archivo HTML.
- El alumno 1 creará un fork del repositorio del alumno 3  y creará a carpeta `CSS`, con un archivo CSS.
- El alumno 2 creará un fork del repositorio del alumno 3  y creará a carpeta `HTML`, con un archivo HTML.
- El alumno 2 creará un fork del repositorio del alumno 1  y creará a carpeta `CSS`, con un archivo CSS.
- El alumno 3 creará un fork del repositorio del alumno 1  y creará a carpeta `HTML`, con un archivo HTML.
- El alumno 3 creará un fork del repositorio del alumno 1  y creará a carpeta `CSS`, con un archivo CSS.

#### Paso 4: Realizar cambios y commits
Cada uno de vosotros trabajará en su carpeta en local y hará el commit con el siguiente mensaje descriptivo `El alumno <NRE> ha añadido un archivo HTML`.

```bash
git commit -m "El alumno <NRE> ha añadido un archivo HTML"
```

#### Paso 5: Subir los cambios a GitHub
1. Cada uno de vosotros debe hacer un **push** con sus cambios a su repositorio forkeado:

```bash
git push origin main
```

o bien desde VSCode.

#### Paso 6: Abrir una pull request
Cada uno de vosotros abrirá una **pull request** desde su repositorio forkeado hacia los dos repositorios principales de los  compañeros.

#### Paso 7: Aprobar una pull request
Cada  alumno aprobará las **pull request** de cada alumno y se dará por finalizada la práctica.

---

### DOCUMENTACIÓN A ENTREGAR

Capturas de pantalla de cada uno de los pasos en la carpeta `UT05/P04` del repositorio de cada alumno.
