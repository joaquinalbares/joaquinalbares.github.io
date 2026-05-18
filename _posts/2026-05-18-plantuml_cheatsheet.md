---
title: "UT06 - EJERCICIOS UML Y DIAGRAMAS DE CLASES"
date: 2026-05-18T00:03:30-01:00
categories:
  - UT06
tags:
  - UML
  - Ejercicios
---


Para elaborar diagramas de clases y objetos, vamos a ahacer uso de la herramient PlantUML, de la que podemos consultar la documentación en la [página oficial](https://plantuml.com). Es una herramienta muy básica para la visualización de diagramas UML.
Podemos usarla on-line o bien descargarnos el archivo .jar y ejecutarlo localmente.

## PlantUML — Apuntes rápidos (cheatsheet)

### 1) Estructura básica
- Todo diagrama empieza y termina con @startuml / @enduml. [plantuml](https://plantuml.com)
- Se puede añadir comentarios con ' (apóstrofo) o // para líneas. [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)

### 2) Diagrama de clases — sintaxis esencial
- Declarar clase simple:
  ```text
  class Nombre { 
    - atributoPrivado: Tipo
    + metodoPublico(param: Tipo): Retorno
  } 
  ```
  [plantuml](https://plantuml.com/class-diagram)

- Visibilidades: + público, - privado, # protegido, ~ package (por defecto). [plantuml](https://plantuml.com/class-diagram)

- Atributos estáticos y abstractos:
  {static} contador: int, {abstract} metodo(): void. [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)
- Relaciones comunes:
  - Herencia: A <|-- B  (B extiende A).  [plantuml](https://plantuml.com/class-diagram)
  - Realización (interfaz): A <|.. B.  [plantuml](https://plantuml.com/class-diagram)
  - Composición (todo/parte, vida ligada): A *-- B. [plantuml](https://plantuml.com/es-dark/object-diagram)
  - Agregación (parte independiente): A o-- B. [plantuml](https://plantuml.com/es-dark/object-diagram)
  - Asociación: A -- B : etiqueta. [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)
  - Dependencia: A ..> B. [plantuml](https://plantuml.com/es-dark/object-diagram)
- Cardinalidad / multiplicidad: usar comillas en la relación: "1" -- "0..*". [plantuml](https://plantuml.com/es-dark/object-diagram)
- Notas y etiquetas: añadir texto a una relación o clase con : o con note:
  class A
  note left of A : comentario. [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)

Ejemplo de clase con relación y multiplicidad
  ```text
  @startuml
  class Gym { -nombre: String }
  class Socio { -id: String }
  class Actividad { -nombre: String }
  Socio "1" -- "0..*" Actividad : inscritoEn
  Gym *-- Actividad
  @enduml
  ```
  (El ejemplo anterior muestra composición Gym *-- Actividad y multiplicidad.) [plantuml](https://plantuml.com/class-diagram)

### 3) Diagrama de objetos — sintaxis esencial
- Declarar objeto (instancia):
  object "NombreInstancia" as idInst {
    atributo = "valor"
    otro = 123
  } [plantuml](https://plantuml.com/object-diagram)
- Relaciones entre objetos: usar flechas normales --> o -- y etiquetarlas:
  obj1 --> obj2 : "relación". [plantuml](https://plantuml.com/object-diagram)
- Mostrar snapshot con valores concretos para explicar casos de uso o tests. [plantuml](https://plantuml.com/object-diagram)

Ejemplo de objeto
  ```text
  @startuml
  object "Socio_S01" as S01 {
    id = "S01"
    nombre = "Ana"
    tipo = "mensual"
  }
  object "Actividad_A1" as A1 {
    id = "A1"
    nombre = "Zumba"
  }
  S01 --> A1 : inscrito
  @enduml
  ```
  (Ejemplo que representa una instancia concreta del modelo.) [plantuml](https://plantuml.com/object-diagram)

### 4) Comandos y configuraciones útiles
- Encabezados y pies: header, footer, title. [plantuml](https://plantuml.com/commons)
- skinparam para estilo (colores, fuentes, bordes):
  skinparam classBackgroundColor #FEFECE
  skinparam ArrowColor red [blog.anoff](https://blog.anoff.io/puml-cheatsheet.pdf)
- Agrupación / paquetes:
  package "Módulo" {
    class A
    class B
  } [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)
- Incluir librerías y sprites:
  !include <url> o !include common/icon.puml para iconos. [blog.anoff](https://blog.anoff.io/puml-cheatsheet.pdf)

### 5) Flechas y estilos (resumen)
- -- simple line, .. dotted line. [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)
- <|-- herencia, *-- composición, o-- agregación, ..> dependencia.  [plantuml](https://plantuml.com/es-dark/object-diagram)
- Se puede invertir, añadir multiplicidad y etiquetas: A "1" -- "0..*" B : contiene. [plantuml](https://plantuml.com/es-dark/object-diagram)

### 6) Buenas prácticas para clase/objeto en aula
- Mantener las clases pequeñas: máximo 6–8 atributos visibles en ejemplos de clase; el resto en notas. [gist.github](https://gist.github.com/jacobh/e4f49c01ebc465483fcce7187c06e114)
- Se pueden usar objetos con valores realistas (fechas, booleanos) para el diagrama de objetos; facilita la comprensión. [plantuml](https://plantuml.com/object-diagram)
- Indicar claramente qué relaciones son composición (parte muere con el todo) y cuáles agregación. Añadir una nota si es necesario. [plantuml](https://plantuml.com/es-dark/object-diagram)
- Añadir métodos relevantes en la clase que muestren la operativa (crear, inscribir, confirmar). [plantuml](https://plantuml.com/class-diagram)

### 7) Ejemplos rápidos útiles en clase
  ```text
  - Crear clase con métodos y visibilidad:
  @startuml
  class Socio {
    - id: String
    + inscribir(a: Actividad): boolean
    + confirmar(asistenciaId: String): void
  }
  @enduml 
  ```
  [plantuml](https://plantuml.com/class-diagram)
  
  - Objeto con asociación y valor booleano:
  ```text 
  @startuml
  object Socio_S1 { id="S1" nombre="Luis" }
  object Asis_1 { id="A1" fecha="2026-05-18" confirmado=true }
  Socio_S1 --> Asis_1 : "asistió"
  @enduml
  ```
  [plantuml](https://plantuml.com/object-diagram)

### 8) Recursos y referencias rápidas
- Documentación oficial PlantUML (clases y objetos): PlantUML website. [plantuml](https://plantuml.com)
- Cheatsheets y guías cortas: Devhints, Gist con ejemplos. [devhints](https://devhints.io/plantuml)
- Sintaxis en español (diagrama de objetos y tablas de símbolos): plantuml.com/es-dark/object-diagram. [plantuml](https://plantuml.com/es-dark/object-diagram)
