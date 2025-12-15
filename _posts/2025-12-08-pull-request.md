---
title: "PRÁCTICA TRABAJO EN EQUIPO"
date: 2025-12-08T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---
#### Paso 1: Crear un fork del repositorio
1. Cada alumno debe realizar un **fork** del repositorio creado para la práctica desde la web de GitHub.

![Imagen](assets/images/2025-12-15 123815.png)

#### Paso 2: Clonar el repositorio forkeado
1. Cada alumno debe clonar su repositorio forkeado a su ordenador local usando:
   ```bash
   git clone URL_DEL_FORK
   ```

#### Paso 3: Asignación de tareas individuales
1. Dividan el grupo de tres alumnos en los siguientes roles:
   - **Alumno 1:** Encargado del diseño HTML.
   - **Alumno 2:** Encargado del estilo CSS.
   - **Alumno 3:** Encargado de los scripts básicos en JavaScript.
   
2. Cada estudiante debe crear una carpeta en el proyecto local siguiendo esta estructura:
   ```
   /src
       /html
       /css
       /js
   ```

#### Paso 4: Realizar cambios y commits
1. Cada estudiante trabajará en su sección del proyecto y realizará al menos dos commits locales significativos con mensajes descriptivos:
   ```bash
   git commit -m "Añadido archivo base HTML"
   git commit -m "Agregado estilo CSS para el encabezado"
   ```

#### Paso 5: Subir los cambios a GitHub
1. Cada alumno debe **push** sus cambios a su repositorio forkeado:
   ```bash
   git push origin main
   ```

#### Paso 6: Abrir una pull request
1. Cada estudiante abrirá una **pull request** desde su repositorio forkeado hacia el repositorio principal del profesor.
2. Incluyan una descripción clara de los cambios realizados.

#### Paso 7: Revisar y fusionar pull requests
1. Un miembro del equipo (designado como "líder del proyecto") debe revisar las pull requests de los demás utilizando la funcionalidad de comentarios de GitHub.
2. Una vez aprobadas las pull requests, el líder del proyecto las fusionará con el repositorio principal usando:
   ```bash
   git merge NOMBRE_DE_LA_RAMIFICACIÓN
   ```

#### Paso 8: Sincronizar los cambios locales
1. Cada alumno debe sincronizar su repositorio local con los cambios del repositorio principal utilizando:
   ```bash
   git pull upstream main
   ```

## Entrega:
- Cada estudiante deberá entregar pantallazos de los siguientes pasos:
  - Historial con los commits “Provocando conflicto” y uno de “Arreglando conflicto” o similar.
  - Un pull request fusionado a main.
  - Un breve archivo conflictos.md donde describan:
    - Cómo se produjo cada conflicto.
    - Qué comandos usaron para resolverlo.
    - Qué versión final de la línea decidieron mantener y por qué.

## Criterios de evaluación
- Correcta configuración de ramas y uso de git clone, checkout, pull, merge/pull --rebase, add, commit y push.
- Capacidad de provocar el conflicto exactamente donde se indica.
- Resolución correcta de los conflictos (sin marcadores de conflicto en los archivos finales).
- Pull request limpio y fusionado en main.
- Explicación clara en conflictos.md de los pasos seguidos y dificultades encontradas.
