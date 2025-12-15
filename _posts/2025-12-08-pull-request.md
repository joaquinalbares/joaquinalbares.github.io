---
title: "PRÁCTICA TRABAJO EN EQUIPO"
date: 2025-12-08T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

## 1) Preparación:
- Cada equipo clona su repositorio.
- Un miembro **crea** y trabaja en la rama feature-a y otro en feature-b.
- Ambos deben modificar exactamente la misma línea del archivo README.md con contenidos distintos (por ejemplo, cambiar la descripción de un apartado o añadir su nombre en la misma línea).

## 2) Primer conflicto (al hacer push):

- El primer estudiante:
  - Realiza commit en su rama con mensaje “Provocando conflicto”.
  - Intenta hacer git push.
  
- El segundo estudiante:
  - Intenta hacer push y encontrará un error, por lo que deberá:
    - Ejecutar git pull o git pull --rebase desde su rama.
    - Resolver el conflicto en el archivo README.md eliminando los marcadores de conflicto y dejando una versión combinada aceptable.
    - Hacer git add, git commit y git push.

## 3) Segundo conflicto (al hacer pull request):
- Uno de los estudiantes crea un pull request de su rama hacia main.
- Desde GitHub, modifica directamente la misma línea en main para generar un conflicto con la rama del pull request.
- El equipo debe:
  - Traer cambios de main a su rama (git checkout rama, git pull origin main o git merge main).
  - Resolver el conflicto localmente.
  - Subir los cambios y actualizar el pull request hasta que quede “mergeable”.

## 4) Entrega:
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
