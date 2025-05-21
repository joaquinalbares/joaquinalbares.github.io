---
title: "UT05 - DIAGRAMAS UML"
date: 2025-05-09T00:01:30-01:00
categories:
  - UT04
tags:
  - REFACTORIZACIÓN
---

# Introducción al Lenguaje Unificado de Modelado (UML)

## Características

UML (Unified Modeling Language) es un lenguaje de modelado estándar que permite especificar, visualizar, construir y documentar los artefactos de un sistema software. No es un lenguaje de programación, sino una herramienta para modelar sistemas orientados a objetos. Sus principales características son:

* Estándar abierto mantenido por la OMG (Object Management Group).
* Permite modelar distintos aspectos de un sistema desde diferentes perspectivas.
* Integra buenas prácticas de análisis y diseño orientado a objetos.
* Fácil de entender por desarrolladores, analistas y clientes.

## Versiones

Desde su creación, UML ha evolucionado con diferentes versiones. Las más importantes son:

* **UML 1.x**: Primeras versiones estándar, limitadas en extensibilidad.
* **UML 2.x**: Versión actual, rediseñada con una metamodelo más robusto y mayor capacidad de expresión.

## Diagramas UML

UML proporciona distintos tipos de diagramas, agrupados en dos categorías:

* **Diagramas estructurales**: describen la estructura estática del sistema (diagramas de clases, objetos, componentes, despliegue, etc.).
* **Diagramas de comportamiento**: describen la dinámica del sistema (diagramas de casos de uso, secuencia, actividades, estados, etc.).

## Utilización en metodologías de desarrollo orientado a objetos

UML es ampliamente utilizado en metodologías como:

* **RUP (Rational Unified Process)**
* **Scrum + UML para documentación**
* **XP (Extreme Programming)**, para documentar de forma ligera
* **Model Driven Architecture (MDA)**

## Herramientas CASE con soporte UML

Las herramientas CASE (Computer-Aided Software Engineering) permiten crear y gestionar modelos UML. Algunas populares:

* Enterprise Architect
* Visual Paradigm
* StarUML
* ArgoUML
* Lucidchart (basada en la web)
* [draw.io](https://draw.io) (basado en la web)

## Elaboración de diagramas de clases

Los diagramas de clases muestran las clases de un sistema y sus relaciones. Se construyen identificando:

* Clases principales
* Atributos y métodos
* Relaciones entre clases
* Visibilidad y herencia

## Notación de los diagramas de clases

La notación básica incluye:

* **Clases**: rectángulo dividido en tres partes (nombre, atributos, métodos).
* **Atributos**: `+nombre: tipo`, `-nombre: tipo`, `#nombre: tipo`.
* **Métodos**: `+operacion(param: tipo): tipoRetorno`.
* **Relaciones**: líneas y flechas con adornos para representar tipo de relación.

## Clases. Atributos, métodos y visibilidad

* **Atributos**: características de la clase.
* **Métodos**: comportamientos o funcionalidades.
* **Visibilidad**:

  * `+` Público
  * `-` Privado
  * `#` Protegido

  ![Ejemplo de clase](/assets/images/b7abc68c8724a2d69b953a2b7b5c7e19.png)

El símbolo delante del nombre del atributo o método indica su visibilidad - public (+), protected (#), private (-), derived (/) o package (~).

Al dibujar un elemento de clase en un diagrama de clases, debe utilizar el compartimento superior, y los dos compartimentos inferiores son opcionales. (Los dos inferiores serían innecesarios en un diagrama que represente un mayor nivel de detalle en el que el propósito sea mostrar sólo la relación entre los clasificadores).


## Objetos. "Instanciación"

Un objeto es una instancia concreta de una clase. En UML, los objetos se representan con su nombre subrayado (p. ej., `miObjeto:Clase`).

## Relaciones

### 1. **Asociación**: relación entre clases (uno a uno, uno a muchos, etc.).
Cuando existe un vínculo entre clases puedes indicarlo de varias maneras.

![Ejemplo de asociación](/assets/images/e946d542f26479db20f5df07ad170ab5.png)

#### A. **Agregación**: Relación débil de pertenencia (vida independiente).

Cuando una clase contiene varias instancias de otra clase, pero esas instancias siguen existiendo aunque se elimine la clase contenedora, eso es agregación. Utilice un rombo hueco para indicar la clase contenedora.

#### B. **Composición**: relación fuerte de pertenencia (vida compartida).

Es similar a la agregación, pero cuando se elimina la clase contenedora, también se eliminan las instancias de las otras clases. La clase contenedora está "compuesta" por instancias de las otras clases. Utilice un rombo sólido para indicar la clase contenedora.


#### C. **Dependencia**: una clase usa otra temporalmente.
Existen muchas otras formas de indicar asociaciones, como las clases de asociación, las asociaciones reflexivas, los paquetes, etc. Para una visión completa del modelado de clases en UML, IBM ha proporcionado un gran tutorial.

![Ejemplo composición y agregación](/assets/images/03fa5d0e325ca0445e258be820d2c7d0.png)


### 2. **Herencia (Generalización)**: una clase hereda atributos y métodos de otra.

Cuando una clase hija tiene las mismas operaciones y atributos que su clase padre, pero añade algunos extras propios, eso es herencia. La herencia es una característica esencial de la programación orientada a objetos. Puedes indicarlo en tu diagrama dibujando una flecha sin relleno desde la clase hija a la clase padre.


![Ejemplo de herencia](imagenes/46bbb4f2e053f9bdfca272cdcad45fd5.png)

Consejo: Las clases abstractas pueden indicarse poniendo en cursiva el nombre de la clase.

* **Navegabilidad**: indica dirección de la asociación.

## Clases abstractas. Interfaces

* **Clase abstracta**: clase que no se puede instanciar y contiene métodos abstractos.
* **Interface**: conjunto de operaciones sin implementación; las clases que la implementan deben definir esos métodos.

## Paquetes

Permiten agrupar clases relacionadas. Se representan con una carpeta. Facilitan modularidad y organización.

## Grado de detalle

Puede variar según la fase del desarrollo:

* Esbozo inicial (alto nivel)
* Diseño detallado (atributos, tipos, visibilidad, etc.)

## Utilización de herramientas CASE para elaborar diagramas de clases con UML

Estas herramientas facilitan:

* Creación visual de clases y relaciones
* Validación de la sintaxis
* Generación de documentación

## Módulos integrados en entornos de desarrollo para elaborar diagramas de clases

IDE como IntelliJ IDEA, Eclipse o Visual Studio cuentan con plugins o extensiones para:

* Dibujar diagramas de clases
* Navegar entre modelos y código
* Sincronizar cambios

## Creación de código a partir de diagramas de clases

Las herramientas CASE permiten generar código fuente automáticamente (Java, C#, etc.) a partir del diagrama.

## Generación de diagramas de clases a partir de código (ingeniería inversa)

Proceso que permite crear diagramas a partir del código existente. Útil para documentar sistemas legados o comprender código de terceros.
