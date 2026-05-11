---
title: "UT06 - UML Y DIAGRAMAS DE CLASES"
date: 2026-05-10T00:03:30-01:00
categories:
  - UT06
tags:
  - UML
  - Ejercicios
---



## Ejercicio 1. Gestión de biblioteca

### Enunciado

Una biblioteca gestiona libros, autores, ejemplares y lectores. Cada libro tiene título, género, editorial y año de publicación. Un libro puede tener uno o varios autores. Cada ejemplar posee un código identificador único y puede encontrarse disponible, prestado, reservado o en reparación. Los lectores pueden realizar préstamos, con un máximo de tres ejemplares simultáneos.


### Tareas

- Elaborar el diagrama de clases.
- Indicar atributos y métodos principales.
- Añadir multiplicidades en las asociaciones.
- Crear un diagrama de objetos con un lector y dos ejemplares prestados.

### Criterios de evaluación

- Identifica correctamente las clases fundamentales.
- Diferencia entre libro y ejemplar.
- Modela de forma adecuada las restricciones del préstamo.
- Utiliza la notación UML con claridad.

## Ejercicio 2. Red informática

### Enunciado

Una red está formada por servidores, ordenadores personales, impresoras, hubs y cables de red. Los PCs se conectan a un único hub, mientras que los servidores pueden conectarse a uno o varios. Los hubs disponen de un número determinado de puertos. Los servidores y PCs pueden enviar mensajes. Las impresoras pueden sufrir averías.

### Tareas

- Diseñar el diagrama de clases.
- Indicar qué clases comparten comportamiento.
- Especificar las multiplicidades de las conexiones.
- Proponer atributos y métodos relacionados con envío de mensajes y estado de avería.

### Criterios de evaluación

- Diferencia correctamente los distintos tipos de dispositivo.
- Representa de forma adecuada las conexiones de red.
- Usa herencia o abstracción de manera razonada.
- Incluye métodos coherentes con el problema.

## Ejercicio 3. Empresa y personal

### Enunciado

Una empresa gestiona empleados, directivos y clientes. Tanto empleados como clientes tienen nombre, edad y dirección. Los empleados poseen sueldo bruto. Los directivos tienen una categoría profesional y gestionan un conjunto de empleados subordinados. Los clientes disponen además de teléfono y correo electrónico.

### Tareas

- Crear el diagrama de clases.
- Señalar las relaciones de herencia existentes.
- Representar la relación entre directivo y subordinados.
- Añadir un diagrama de objetos con un directivo y dos empleados.

### Criterios de evaluación

- Organiza correctamente la generalización y especialización.
- Evita duplicidad innecesaria de atributos.
- Modela bien la jerarquía interna de la empresa.
- Presenta un diagrama legible y consistente.

## Ejercicio 4. Videoclub

### Enunciado

Un videoclub gestiona películas, socios y alquileres. Cada película tiene título, duración, género y clasificación por edad. Cada socio puede alquilar varias películas, pero no superar el plazo establecido. El alquiler guarda la fecha de inicio, la fecha prevista de devolución y la fecha real de entrega.

### Tareas

- Elaborar el diagrama de clases.
- Incluir la clase alquiler con sus atributos.
- Definir métodos principales del proceso.
- Crear un diagrama de objetos con un alquiler activo.

### Criterios de evaluación

- Introduce correctamente la clase asociativa o intermedia.
- Distingue entre película, socio y alquiler.
- Añade operaciones funcionales y realistas.
- Refleja adecuadamente las cardinalidades.

## Ejercicio 5. Instituto

### Enunciado

Un instituto gestiona profesores, alumnos, módulos y grupos. Cada alumno pertenece a un grupo. Un alumno puede estar matriculado en varios módulos. Cada módulo es impartido por un profesor. Cada grupo tiene un tutor, un curso y un conjunto de alumnos.

### Tareas

- Diseñar el diagrama de clases.
- Incorporar las asociaciones con multiplicidades.
- Justificar si existen clases abstractas o no.
- Crear un ejemplo de diagrama de objetos con un grupo y tres alumnos.

### Criterios de evaluación

- Identifica adecuadamente las entidades educativas.
- Representa bien la relación entre grupo, alumno y módulo.
- Usa cardinalidades correctas.
- Justifica con sentido las decisiones de diseño.

## Ejercicio 6. Tienda online

### Enunciado

Una tienda online vende productos organizados por categorías. Los clientes pueden realizar pedidos. Cada pedido contiene varias líneas de pedido, y cada línea almacena un producto, una cantidad y un precio. Los productos tienen nombre, descripción, stock y precio base.

### Tareas

- Realizar el diagrama de clases.
- Señalar la composición correspondiente.
- Añadir métodos para calcular total del pedido.
- Crear un diagrama de objetos con un pedido de tres líneas.

### Criterios de evaluación

- Distingue con claridad las clases del dominio.
- Aplica correctamente la composición.
- Define atributos útiles para la gestión del pedido.
- Mantiene coherencia entre clases y relaciones.

## Ejercicio 7. Hospital

### Enunciado

Un hospital administra pacientes, médicos, citas y tratamientos. Un paciente puede tener varias citas con distintos médicos. Cada cita tiene fecha, hora y motivo. Un tratamiento puede estar asociado a una o varias citas, según la evolución del paciente.

### Tareas

- Elaborar el diagrama de clases.
- Representar las asociaciones entre paciente, médico, cita y tratamiento.
- Añadir métodos para programar y cancelar citas.
- Crear un diagrama de objetos con un paciente y dos citas.

### Criterios de evaluación

- Modela de forma coherente el ámbito sanitario.
- Relaciona correctamente las clases principales.
- Propone métodos funcionales y bien nombrados.
- Utiliza UML de manera clara y ordenada.

## Ejercicio 8. Plataforma de cursos

### Enunciado

Una plataforma virtual ofrece cursos, módulos, profesores y estudiantes. Un curso está formado por varios módulos. Los estudiantes pueden inscribirse en varios cursos. Cada módulo puede contener vídeos, tareas y un examen final. Los profesores son responsables de uno o varios cursos.

### Tareas

- Diseñar el diagrama de clases.
- Indicar qué relaciones pueden modelarse como composición.
- Proponer métodos de inscripción y evaluación.
- Crear un diagrama de objetos con un estudiante inscrito en dos cursos.

### Criterios de evaluación

- Identifica correctamente la estructura de la plataforma.
- Modela de manera coherente cursos, módulos y estudiantes.
- Diferencia bien entre contención y asociación.
- Presenta un diagrama completo y limpio.

## Ejercicio 9. Parking inteligente

### Enunciado

Un parking inteligente dispone de plazas, vehículos, tickets y tarifas. Cuando un vehículo accede al parking ocupa una plaza. El ticket almacena la hora de entrada, la hora de salida y el coste calculado. Existen plazas normales, plazas para motos y plazas para vehículos eléctricos.

### Tareas

- Crear el diagrama de clases.
- Representar la especialización de plazas.
- Añadir métodos para registrar entrada, salida y cálculo de importe.
- Construir un diagrama de objetos con un vehículo estacionado.

### Criterios de evaluación

- Utiliza correctamente la generalización en el modelo.
- Representa de forma adecuada la ocupación de plazas.
- Incluye atributos y operaciones relevantes.
- Mantiene consistencia en el diseño.

## Ejercicio 10. Biblioteca musical

### Enunciado

Una biblioteca musical gestiona discos, canciones, artistas, usuarios y listas de reproducción. Un disco contiene varias canciones. Un artista puede participar en uno o varios discos. Los usuarios pueden crear listas de reproducción con canciones de distintos discos.

### Tareas

- Elaborar el diagrama de clases.
- Indicar relaciones, cardinalidades y posibles composiciones.
- Añadir métodos para crear listas y añadir canciones.
- Crear un diagrama de objetos con una lista de reproducción concreta.

### Criterios de evaluación

- Distingue correctamente catálogo, artista y usuario.
- Modela bien la relación entre disco y canción.
- Representa adecuadamente las listas de reproducción.
- Usa notación UML con precisión.
