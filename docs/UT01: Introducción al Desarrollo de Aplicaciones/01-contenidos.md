# CONTENIDOS TEÓRICOS

## 1. Orígenes y Concepto del Software

El término **informática** nace como un acrónimo derivado de la frase: **INFOR**mación de forma auto**MÁTICA**.

### Evolución Histórica

* **Charles Babbage (1791-1871):** Precursor del concepto de software. Durante el diseño de su máquina diferencial, planteó el uso de series de instrucciones leídas desde la memoria principal del sistema, refiriéndose a ellas de forma primitiva como software.
* **Ada Lovelace (1815-1852):** En 1843, tradujo y amplió de forma masiva las notas del ingeniero Luigi Menabrea sobre la máquina de Babbage. En su apéndice incluyó un algoritmo detallado para calcular los *Números de Bernoulli*, considerado de forma unánime como el **primer programa informático de la historia** y encumbrándola como la primera persona programadora.
* **Alan Turing (1912-1954):** Matemático y criptógrafo clave en el desciframiento de los códigos de la máquina *ENIGMA* en la Segunda Guerra Mundial. Diseñó el modelo teórico de la **Máquina de Turing** y desarrolló la teoría de la computación fundamental para la ciencia de la computación moderna.
* **John Wilder Tukey (1915-2000):** Empleó formalmente el término **"computer software"** por primera vez en un artículo publicado en 1958 en la revista *American Mathematical Monthly*. En él describió la capacidad de escribir conjuntos de instrucciones complejas que luego se traducirían para las máquinas, sentando las bases de los compiladores modernos. Adicionalmente, acuñó el término **bit** como contracción de *binary digit*.

!!! info "Nota histórica"
    Parte del cerebro de Charles Babbage se encuentra conservado en formol en el *Royal College of Surgeons* de Londres.

---

## 2. Arquitectura del Ordenador y Ejecución de Programas

### Datos e Instrucciones

Un **programa** consiste en una secuencia ordenada de **instrucciones** que permiten procesar **datos de entrada** con el fin de generar **datos de salida** útiles.

* **Los Datos:** Valores independientes del soporte físico que cumplen requisitos para ser representados e interpretados. Su unidad atómica son los caracteres (letras, dígitos, signos de puntuación y caracteres de control).
* **Las Instrucciones:** Acciones atómicas elementales con un significado concreto y una duración de ejecución limitada en el tiempo.

#### Codificación de Caracteres

Para que el hardware interprete los datos, los caracteres se transforman numéricamente mediante tablas de correspondencia. Para codificar un número $N$ de símbolos distintos se requiere una cantidad $x$ de bits, definida por la relación matemática:

$2^{x-1} < N \le 2^x$

* **ASCII:** Codificación basada en 7 bits.
* **ISO-8859:** Codificación basada en 8 bits.
* **Unicode:** Codificación basada en 32 bits. Dispone de esquemas de codificación como UTF-8, UTF-16 y UTF-32.

### La Arquitectura Von Neumann (1946)

Estableció la primera arquitectura con **programa almacenado**, unificando el espacio de memoria para datos e instrucciones.

* **Procesador (CPU):** Unidad encargada de ejecutar las instrucciones.
* *Unidad de Control (CU):* Dirige y controla el flujo de ejecución de las instrucciones.
* *Unidad Aritmético/Lógica (ALU):* Ejecuta operaciones matemáticas y lógicas sobre operandos binarios.
* *Registros:* Almacenamiento interno de alta velocidad para operandos y estados.
* *Buses:* Vías de comunicación de Control, Direcciones y Datos que interconectan el sistema.


* **Memoria Principal:** Almacenamiento que alberga los programas y los datos activos en formato binario (RAM y ROM).
* **Memoria Secundaria:** Sistemas de almacenamiento masivo, persistente y no volátil.
* **Dispositivos Periféricos:** Unidades encargadas de la Entrada y Salida de información con el entorno exterior.

### Tipos de Software

1. **Sistema Operativo:** Software base e indispensable que gestiona los recursos del hardware y hace de nexo con las aplicaciones (ej. Windows, Linux, macOS).
2. **Software de Programación:** Herramientas especializadas concebidas para que los profesionales desarrollen nuevos programas informáticos (compiladores, editores).
3. **Aplicación Informática:** Software en contacto directo con el usuario final para automatizar tareas específicas (procesadores de texto, hojas de cálculo, contabilidad).

!!! tip "El Firmware y la BIOS"
    La BIOS (*Basic Input-Output System*) es el software integrado en un chip de la placa base que chequea el hardware al encender el equipo y actúa de interfaz primaria entre el sistema operativo y los componentes. Este tipo de software con un alto acoplamiento físico se denomina **firmware**.

---

## 3. Ingeniería del Software y Ciclo de Vida (SDLC)

La Ingeniería del Software aplica metodologías estructuradas para asegurar la construcción de programas correctos, fiables y modulares que faciliten el trabajo colaborativo y la evolución del código sin introducir errores.

### Fases del Desarrollo de Software

1. **Análisis / Factibilidad:** Fase inicial donde se evalúa la viabilidad temporal y económica del proyecto. El desarrollo de un software es pertinente únicamente si automatiza tareas muy repetitivas o resuelve un proceso de altísima complejidad técnica.
2. **Planificación / Requisitos:** Se definen formalmente las necesidades y funciones solicitadas por el usuario final. Esta fase concluye cuando el cliente valida y firma el documento de requisitos.
3. **Diseño:** Los analistas definen la arquitectura técnica. Se generan dos tipos de especificaciones: el *diseño genérico* (visión global del sistema) y el *diseño detallado* (especificación de cada módulo).
4. **Desarrollo (Codificación):** Escritura del código fuente del programa. Requiere la confección de documentación técnica interna exhaustiva (propósito, parámetros de entrada y salida de las funciones) para su posterior comprensión.
5. **Pruebas (Testing):** Garantizan que la aplicación cumple las especificaciones.
* *Funcionales:* Verifican que las funciones del programa se ajusten a lo acordado con el cliente.
* *Estructurales:* Pruebas técnicas que someten la aplicación a estrés, carga y rendimiento bajo condiciones reales.
6. **Explotación:** Instalación e implementación del software en el entorno operativo real (producción) para su uso cotidiano. Es la etapa más extensa del ciclo de vida.
7. **Mantenimiento:** Proceso continuo de actualización, corrección de incidencias, parches de seguridad y adaptaciones evolutivas. Exige que cada cambio sea rigurosamente documentado y validado por personal distinto al programador.
8. **Evaluación:** Revisión crítica del sistema orientada a la mejora continua, identificando actualizaciones o entrenamientos necesarios.
9. **Fin de Vida:** Planificación del cese de la aplicación, abarcando la recuperación y preservación segura de datos esenciales junto al desmantelamiento físico de los activos.

### Modelos de Proceso

* **Modelo en Cascada:** Estructura estrictamente secuencial donde cada etapa se ejecuta de manera sucesiva tras finalizar y validar por completo la anterior (criterio "gate"). Carece de flexibilidad al desaconsejar la revisión de fases ya cerradas.
* **Modelo en Espiral:** Diseñado por Barry Boehm en 1988. Su núcleo se fundamenta en la **gestión y análisis de riesgos de forma periódica** a lo largo de ciclos iterativos, ideal para sistemas complejos a gran escala.
* **Desarrollo Iterativo e Incremental:** Construcción del software en secciones funcionales reducidas que crecen de forma progresiva. Facilita la detección temprana de errores arquitectónicos y ayuda a moldear los objetivos en clientes con necesidades ambiguas.

### Metodologías Ágiles

* **Kanban:** Flujo de trabajo visual ideado por Toyota. Divide las tareas en fracciones mínimas y las organiza en un tablero por estados (*Pendiente*, *En Curso*, *Finalizado*) para optimizar el valor del producto.
* **Scrum:** Proceso incremental estructurado en bloques de tiempo cortos y fijos (de 2 a 4 semanas) denominados **Sprints**. Sigue un ciclo estricto: *Sprint Planning*, *Sprint (Ejecución)*, *Daily Meeting (Reunión diaria)* y *Sprint Review*.
* **Lean:** Centrado en la capacitación de equipos pequeños, la eliminación de procesos innecesarios (*desperdicios*), la reacción rápida y el aprendizaje continuo.
* **Programación Extrema (XP):** Metodología focalizada en la calidad del código y las relaciones del equipo. Se rige por 12 pilares básicos, entre los que destacan el diseño sencillo, las pruebas constantes, la **refactorización**, la **programación en parejas** y la integración continua.

### Herramientas CASE

Las herramientas **CASE** (*Computer Aided Software Engineering*) son aplicaciones informáticas orientadas a automatizar las tareas del ciclo de vida del desarrollo para reducir costes, tiempos y aumentar la fiabilidad. Se clasifican en:

* **U-CASE:** Soporte en la planificación inicial y análisis de requisitos.
* **M-CASE:** Soporte en las fases de análisis estructurado y diseño arquitectónico.
* **L-CASE:** Soporte en la codificación, depuración, pruebas automáticas y generación de la documentación técnica del proyecto.

---

## 4. Obtención de Código Ejecutable

El proceso de transformación del software escrito por el desarrollador hasta ser comprendido por la máquina consta de tres etapas de abstracción de código:

### Niveles de Código

* **Código Fuente:** Instrucciones legibles de alto nivel escritas en editores o IDEs. Debe gestionarse bajo sistemas de **control de versiones** para evitar pérdidas accidentales y organizar el trabajo. Puede ser *Abierto* (disponible para modificación y estudio) o *Cerrado* (sin permisos de edición).
* **Código Objeto:** Código intermedio en formato binario o *bytecode* generado tras la traducción del código fuente. Se distribuye en múltiples archivos libres de errores sintácticos y semánticos, pero aún no es directamente ejecutable por la CPU.
* **Código Ejecutable:** El binario definitivo obtenido al enlazar todos los archivos de código objeto junto con las librerías nativas del sistema mediante un software **enlazador (linker)**. Es directamente inteligible por la computadora.

### Métodos de Traducción

| Método | Funcionamiento | Ventajas / Desventajas |
| --- | --- | --- |
| **Compilación** | El **compilador** traduce la totalidad del código fuente de una sola vez, generando el archivo objeto independiente. | Ofrece velocidades de ejecución nativas óptimas (ej. C, C++). |
| **Interpretación** | El **intérprete** traduce y ejecuta el código fuente en tiempo real, línea a línea, sin generar código objeto intermedio. | Es más lento en su ejecución, pero ofrece un detalle minucioso en la detección y depuración de errores. |
| **Máquinas Virtuales** | El compilador traduce el código fuente a un lenguaje intermedio estándar conocido como **bytecode**. Una máquina virtual nativa lo interpreta o compila en la plataforma destino. | Ofrece una portabilidad multiplataforma absoluta a cambio de una velocidad ligeramente inferior (ej. Java). |

---

## 5. Clasificación de los Lenguajes de Programación

1. **Lenguaje Máquina:** Instrucciones complejas e ininteligibles estructuradas puramente en cadenas de unos y ceros ($0$ y $1$). Es el único lenguaje que el procesador entiende de forma directa sin traducción, pero carece de portabilidad al cambiar según el modelo de CPU.
2. **Lenguaje de Medio Nivel (Ensamblador):** Sustituto directo del lenguaje máquina para facilitar la labor de desarrollo. Sigue ligado estrechamente al hardware, pero emplea instrucciones codificadas en términos **mnemotécnicos** (ej. abreviaciones legibles) y trabaja con los registros de la CPU. Requiere compilarse a código máquina.
3. **Lenguaje de Alto Nivel:** Los lenguajes modernos mayoritarios. Presentan una sintaxis intuitiva cercana al lenguaje humano, manejan altos niveles de abstracción, encapsulamiento y orientación a objetos, e incorporan extensas librerías prediseñadas para agilizar la codificación.

---

## 6. Gestión de Errores y Reutilización de Código

### Errores Comunes en el Desarrollo

* **Mala estimación de tiempos:** Errar en el cálculo de costes y plazos debido a la carencia de técnicas de cotización rigurosas.
* **Deficiente gestión de riesgos:** Falta de previsión ante eventos inciertos. Pueden ser riesgos del *usuario* (falta de compromiso directivo), del *líder* (mal cálculo del alcance) o de *ejecución* (personal inapropiado o fallas metodológicas).
* **Escatimar en el control de calidad (QA):** Reducir de forma imprudente el periodo de pruebas del software, impidiendo la validación de fallos de quiebre operativos.
* **Diseño inadecuado:** Desarrollar una arquitectura de software deficiente o frágil a pesar de poseer un excelente análisis previo.
* **Dependencia de tecnologías inexploradas:** Confiar la infraestructura central en herramientas o frameworks novedosos cuya curva de aprendizaje o madurez no ha sido contrastada por el equipo.
* **Añadir personal a proyectos retrasados:** Práctica contraproducente que incrementa el retraso del proyecto debido a la sobrecarga de comunicación y acoplamiento técnico (Ley de Brooks).

!!! tip "Importancia de la Reutilización"
    La reutilización de software consiste en el empleo estratégico de activos preexistentes (módulos, especificaciones de análisis, pruebas) para optimizar la eficiencia y rapidez del desarrollo.

* **Indicador de Comunalidad:** Entre el **40% y el 60%** de los componentes de una aplicación estándar son completamente reutilizables en otros sistemas.
* **Funciones Estándar:** Aproximadamente el **75%** de las funciones operativas analizadas en el software comercial son comunes entre múltiples programas.
* **Innovación Real:** En promedio, solo el **15%** del código fuente escrito para una aplicación nueva representa una lógica algorítmica totalmente única o novedosa.
