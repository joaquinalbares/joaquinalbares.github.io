---
title: "UT05 - EJERCICIO UML"
date: 2025-05-15T00:01:30-01:00
categories:
  - UT06
tags:
  - UML
---

## MATRICULAS
En el instituto, se quiere informatizar el procesor de matricula:
- Cuando un alumno venga a matricularse debe rellenar una ficha con sus datos: DNI, número de expediente, nombre, apellidos, domicilio, teléfono y e-mail
- El centro  almacena la información sobre todos los cursos que se imparten en el centro: un código, el nombre, aula donde se imparte y el horario.
- También se guarda información sobre todas las asignaturas de todos los cursos con el fin de conocer en que asignaturas se matricula cada alumno. De cada una guardaremos el nombre, el profesor que la imparte y el número de horas a la semana.
- Hay que tener en cuenta que todos los alumnos se matricularán al menos de una asignatura en algún curso
- Los profesores también están dentro de la Base de Datos, con la siguiente información: nombre, apellidos, domicilio y e-mail.
- Un profesor podrá impartir como máximo 6 asignaturas y deberá impartir al menos una. También habrá que almacenar el curso del que un profesor es tutor, teniendo en cuenta que puede que no sea tutor de ningún curso.
Hay que tener en cuenta que es importante almacenar las notas que cada alumno tiene en cada asignatura a lo largo del curso en las distintas evaluaciones, así como las observaciones que los profesores podrán anotar.
