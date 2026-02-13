---
title: "UT03 - TEST UNITARIOS CON JAVA Y MAVEN"  
date: 2026-02-06T00:01:30-01:00  
author: "Joaquin Rios"
categories:
  - UT05  
tags: 
  - test, tests unitarios
---

## 1.MARCO TEÓRICO
Las Pruebas de Caja Negra, constituyen una técnica de pruebas de software en para comprobar y verificar la funcionalidad de una aplicación sin tener en cuenta la implementación o estructura interna de código, así como los escenarios de ejecución (donde se va a ejecutar).

En estas pruebas, no hace falta conocer la estructura interna del programa ni su funcionamiento. Su busca la obtención de casos de prueba que demuestren que las salidas que devuelve la aplicación son las esperadas en función de las entradas que se proporcionen.

![caja_negra.jpg](/assets/images/caja_negra.jpg)

A este tipo de pruebas también se les llama prueba de comportamiento.

Con ellas intentamos encontrar errores de las siguientes categorías: 

- Funcionalidades incorrectas o ausentes. 
- Errores de interfaz. 
- Errores en estructuras de datos o en accesos a bases de datos externas.
- Errores de rendimiento. 
- Errores de inicialización y finalización. 

## 2. INTODUCCIÓN A LOS TEST UNITARIOS

Las pruebas o tests unitarios buscan verificar el comportamiento de una unidad específica, como una **función** o un **método** de clase, de forma aislada de otras partes del sistema. El objetivo es validar que cada unidad del software funciona según lo diseñado. Esto se hace proporcionando entradas conocidas a la unidad y comprobando que se reciben las salidas esperadas.

Algunas de las principales ventajas de las pruebas unitarias son

- Detectar errores en una fase temprana del ciclo de desarrollo, lo que reduce el coste de su corrección.
- Garantizar que el código funciona según lo previsto a medida que se realizan cambios.
- Proporcionar documentación viva sobre el funcionamiento del código.
- Ayudar a escribir código más modular y fácil de mantener.
- Mejorar la calidad del código y reducir la deuda técnica a lo largo del tiempo.

Algunas de las características que debemos tener en cuenta para elaborar unas pruebas unitarias de calidad, sería acosejable seguir estas buenas prácticas:

- Tratar de  conseguir pruebas legibles y fáciles de mantener. Las pruebas poco claras son casi tan malas como la ausencia de pruebas.
- Las pruebas deben ser pequeñas y específicas. Cada prueba debe verificar un comportamiento.
- Las pruebas deben estar aisladas. Evite las dependencias entre pruebas.
- Las pruebas deben ser deterministas. Ejecutar una prueba con los mismos datos debe devolver siempre el mismo resultado.
- Debemos usar nombres claros y descriptivos para los métodos de prueba. Los nombres de las pruebas deben describir el escenario que se está probando.
- Es aconsejable separar las pruebas del código de producción para mantener la modularidad del código.
- Deberíamos ejecutar las pruebas con frecuencia, idealmente cada vez que hagamos cambios en el código.

Para hacer nuestros test unitarios, podemos usar las librerías integradas que vienen por defecto en los IDE o bien importar nuestras propias librerías para realizar los test.

### 2.1. CARACTERÍSTICAS DE LOS TEST

Para probar nuestra aplicación, debemos crear tantos test como métodos tenga la clase a probar, con las siguientes características:

- Los métodos son públicos, no devuelven nada y no reciben ningún argumento.
- El nombre de cada método es recomendable que se llame de la misma manera que el original o bien que vaya precedido de la palabra test (ej: testSuma(), testResta(), testMultiplica(), testDivide()) . 
- Encima de cada uno de los métodos aparece la anotación ```@Test``` que indica al compilador que es un método de prueba.
- Para los test parametrizados, incluiremos las anotaciones pertinentes.

Dentro de cada método de test, debemos seguir siempre el mismo procedimiento:
- Creamos una instancia de la clase con los valores que nos interese.
- Invocamos al método que queremos testar. 
- Comprobamos que el valor obtenido coincide con el valor deseado. Para ello hacemos uso de los métodos que nos ofrece la Librería JUnit, vistos en el apartado anterior.


### 2.3. Preparar Visual Studio Code para Java y JUnit

Para trabajar con Java y pruebas unitarias en VS Code, es necesario instalar algunas extensiones en VS. Las recomendaddas son:

  - “Extension Pack for Java” (incluye soporte de lenguaje, depuración, etc.).
  - “Test Runner for Java” o “Java Test Runner” para ejecutar pruebas JUnit.


Tras instalar, reiniciar VS Code; veréis un icono de Testing (probablemente un símbolo de tubo de ensayo) en la barra lateral.


## 3. JUNIT

JUnit es una librería oframework creado para realizar pruebas unitarias automatizadas. Está integrada en Eclipse y Visual Studio Code, por lo que no es necesario descargarse ningún paquete para poder usarla.

Hay problemas con su integración en Netbeans, pero hay soluciones no oficiales por internet.
 
La versión actual es la 5 (JUPITER) y tiene algunos cambios respecto a las versiones anteriores, por lo que es recomendable que todo el mundo use esta versión, si no, habrá problemas a la hora de corregir los ejercicios y/o exámenes.

Para encontrar más información sobre las novedades de JUNIT 5, lo mejor es visitar la web oficial:

[Junit 5](https://junit.org/junit5/)

### 3.1. MÉTODOS DE JUNIT PARA EJECUTAR TEST

Para realizar pruebas, debemos crear Una clase de prueba , que no es nim más ni menos que una clase Java normal anotada con `@Test` en sus métodos.


Para efectuar los test, usaremos las **aserciones** para comparar el resultado esperado con el resultado real. Algunas de las aserciones que nos sirven para probar nuestras aplicaciones son las siguientes:

- ```assertEquals(String mensaje, valorEsperado, valorReal)```: Comprueba que el valorEsperado sea igual al valorReal. Si no son iguales y se incluye el String, entonces se lanzará el mensaje. ValorEsperado y valorReal pueden ser de diferentes tipos.

- ```assertTrue(String mensaje, boolean expresión)```: Comprueba que la expresión se evalúe a true. Si no es true y se incluye el String, al producirse error se lanzará el mensaje.

- ```assertFalse(String mensaje, boolean expresión)```: Comprueba que la expresión se evalúe a false. Si no es false y se incluye el String, al producirse error se lanzará el mensaje.

- ```assertNull(String mensaje, Object objeto)```: Comprueba que el objeto sea null. Si no es null y se incluye el String, al producirse error se lanzará el mensaje.

- ```assertNotNull(String mensaje, Object objeto)```: Comprueba que el objeto no sea null. Si es null y se incluye el String, al producirse error se lanzará el mensaje.

- ```assertSame(String mensaje, Object objetoEsperado, Object objetoReal)```: Comprueba que objetoEsperado y objetoReal sean el mismo objeto. Si no son el mismo y se incluye el String, al producirse error se lanzará el mensaje.

- ```assertNotSame(String mensaje, Object objetoEsperado, Object objetoReal)```: Comprueba que objetoEsperado y objetoReal no sean el mismo objeto. Si son el mismo y se incluye el String, al producirse error se lanzará el mensaje.

- ```fail(String mensaje)```: Hace que la prueba falle. Si se incluye un String la prueba falla lanzando el mensaje.

### 3.2. ANOTACIONES

Por último, debemos conocer un concepto que vamos a utilizar durante el desarrollo de nuestras pruebas: las anotaciones.

Las anotaciones son, según la wikipedia, son ***una forma de añadir metadatos al código fuente Java, y se pueden añadir a los elementos de programa tales como clases, métodos, metadatos, campos, parámetros, variables locales, y paquetes***.

Para una información más detallada, podéis leer este útil enlace:

https://jarroba.com/annotations-anotaciones-en-java/

Junit, en su versión 5 (Jupiter) dispone de una serie de anotaciones que permiten complementar y ofrecer más información sobre las pruebas, asi como ejecutar código antes y después de las pruebas. Algunas de las más usadas son: 

- `@BeforeEach`: si anotamos un método con esta etiqueta, el código será ejecutado antes de cualquier método de prueba. Podemos usarlo, por ejemplo, en una aplicación de acceso a base de datos para preparar la base de datos. 

- `@AfterEach`: Se pone en métodos cuyo código será ejecutado después de la ejecución de cada uno de los métodos de prueba. Se puede utilizar para limpiar datos. Puede haber varios métodos en la clase de prueba con estas dos anotaciones. 

Existe otras anotaciones que permiten ejecutar código y afectan a la clase en sí. Veamos:
 
- `@BeforeAll`: El método marcado con esta anotación es invocado una vez al principio del lanzamiento de todas las pruebas. Se suele utilizar para inicializar atributos comunes a todas las pruebas o para realizar acciones que tardan un tiempo considerable en ejecutarse. Tanto los atributos modificados como la clase se deben definir como `static`.

- `@Afterall`: Este método será invocado cuando finalicen todas las pruebas. Se puede utilizar para limpiar los atributos de la clase u otras tareas finales. 

Solamente puede haber un método en la clase de prueba con estas dos anotaciones. 


## 4. CREANDO NUESTRO PRIMER TEST

### 4.1. CREACIÓN DE LA CLASE A TESTEAR

Para comenzar nuestro ejemplo, en primer lugar debemos crear nuestra clase sobre la que vamos a realizar los test.

Para este ejemplo básico, hemos creado esta clase calculadora que incluye cuatro métodos y el constructor, que recibe dos números como entrada.  

La clase calculadora queda así:

```java
package es.ieslosalbares.pruebas;

public class Calculadora {

    private final int num1;
    private final int num2;

    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int suma() {
        int resul = num1 + num2;
        return resul;
    }

    public int resta() {
        int resul = num1 - num2;
        return resul;
    }

    public int multiplica() {
        int resul = num1 * num2;
        return resul;
    }

    public int divide() {
        int resul;
        if (num2== 0) {
            resul = 0;
        }
        else resul = num1 / num2; 
        return resul;
    }
}

```

### 4.2. CREANDO EL TEST
Ahora vamos a crear una clase de prueba para verificar nuestra calculadora. En genera podremos crear la plantilla del test desde el menú de nuestro IDE o bien hacerlo desde cero.

En primer lugar, debemos habilitar los test para nuestro proyecto. Desde VSCode podemos pinchar en la parte izquierda, el icono de los test 

![ut03_test.png](/assets/images/ut03_test.png)

Y luego en la parte superior derecha, el icono de "Enable Java Test":

![ut03_enable java.png](/assets/images/ut03_enable java.png)

Debemos elegir la opción `JUNIT Jupiter` Lo que nos descarga la librería de JUnit y nos crea la carpeta "test" dentro de nuestro proyecto, donde se guardarán los test que creemos.

Una vez que hemos habilitado la creación de tests, podemos crear la clase de test para nuestra clase Calculadora. Para ello, podemos usar el menú de nuestro IDE o bien crear la clase de test desde cero.
Si optamos por crearlos de manera automatizada, para el caso de VSCode, hacemos clic con el encima de la clase a probar y seleccionamos "Source Actions -> Generate Test":

![95df7702484d259ec464ec1f013cd476.png](/assets/images/95df7702484d259ec464ec1f013cd476.png)

Por defecto nos sale el archivo sobre el que estamos trabajando, pero podemos escribir otro diferente.

En la parte izquierda elegimos los tipos de métodos sobre los que queremos generar los test y pulsamos  "OK"  

![c016f9fed0bd01ee119d204a794218c8.png](/assets/images/c016f9fed0bd01ee119d204a794218c8.png)

Lo que nos genera un nuevo archivo que se ubicará en la carpeta "test" de nuestro proyecto y que tendrá la siguiente estructura:

```java
package es.ieslosalbares.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
    }

    @Test
    public void testResta() {
    }

    @Test
    public void testMultiplica() {
    }

    @Test
    public void testDivide() {
    }
    
}
```
 
 Vemos una estructura similar a una clase Java ordinaria.

Como muestra vamos a comenzar creando el test para el método ```suma()```. Debemos crear un objeto de la clase Calculadora y luego llamar al método ```suma()```. Luego comprobamos que el valor devuelto coincide con el valor esperado.  Se ha incluido la anotación `DisplayName` que muestra el mensaje del método al realizar el test. Para poder incluir esa anotación, debemos importar la librería ```DisplayName```.

```import org.junit.jupiter.api.DisplayName;```

y creamos el test mediante el procedimiento explicado anteriormente:

```java
@Test
@DisplayName("1 + 1 = 2")
void sumarDosNumeros() {
  Calculadora calculadora = new Calculadora(1, 1);
	assertEquals(2, calculadora.suma(), "1 + 1 debe ser igual a 2");
}
```

El procedimiento sería similar para el resto.

Para pasar el test, hacemos clic encima del triángulo derecho que está a la izquierda test que queremos ejecutar:

![7775bed4acf6bc5d428963e9e0a87422.png](/assets/images/7775bed4acf6bc5d428963e9e0a87422.png)

y en la ventana de resultados podemos ver que el test se pasa satisfactoriamente si aparece el círculo verde a la izquierda del test.

Ahora podemos crear una batería de pruebas para probar otro método de esta clase. Para ello vamos usar la anotación @ParameterizedTest para indicar que es un test con parámetros. Al usar este tipo de test, debemos incluir una segunda anotación para indicar de dónde vamos a obtener los valores que vamos a pasar al método. Existen muchas formas de generar valores, y dependerá del método a probar su elección. Aqui hemos optado por una serie de valores CSV (Valores Separados por Coma), que es la mas sencilla de manejar.

El código quedaría así:

```java
@ParameterizedTest(name = "{0} + {1} = {2}")
@CsvSource({
    "0,    1,   -1",
    "2,    1,   1",
    "237,  22, 215",
    "1,  100, -99"
})
void resta(int num1, int num2, int resultadoEsperado) {
    Calculadora calculadora = new Calculadora(num1 , num2);
    assertEquals(resultadoEsperado, calculadora.resta(),
            () -> num1 + " - " + num2 + " debe ser igual a " + resultadoEsperado);
}
```

Podéis ver un interesante tutorial sobre test parametrizados en los siguientes enlaces:

- [](https://blog.codefx.org/libraries/junit-5-parameterized-tests/)
- [](https://www.geeksforgeeks.org/junit-5-how-to-write-parameterized-tests/)

Si completamos los demás métodos, el test final quedaría así:

```java
package es.ieslosalbares.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest {


    @Test
    @DisplayName("1 + 1 = 2")
    void sumarDosNumeros() {
        Calculadora calculadora = new Calculadora(1, 1);
        assertEquals(2, calculadora.suma(), "1 + 1 debe ser igual a 2");
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
        "0,    1,   -1",
        "2,    1,   1",
        "237,  22, 215",
        "1,  100, -99"
    })
    void resta(int num1, int num2, int resultadoEsperado) {
        Calculadora calculadora = new Calculadora(num1 , num2);
        assertEquals(resultadoEsperado, calculadora.resta(),
                () -> num1 + " - " + num2 + " debe ser igual a " + resultadoEsperado);
    }


    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
        "0,    1,   0",
        "2,    1,   2",
        "10,  22, 220",
        "12,  11, 132"
    })
    public void multiplica(int num1, int num2, int resultadoEsperado) {
        Calculadora calculadora = new Calculadora(num1 , num2);
        assertEquals(resultadoEsperado, calculadora.multiplica(),
                () -> num1 + " * " + num2 + " debe ser igual a " + resultadoEsperado);
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
        "0,   1,  0",
        "2,   1,  2",
        "24,  6,  4",
        "111, 10, 11"
    })
    public void divide(int num1, int num2, int resultadoEsperado) {
        Calculadora calculadora = new Calculadora(num1 , num2);
        assertEquals(resultadoEsperado, calculadora.divide(),
                () -> num1 + " / " + num2 + " debe ser igual a " + resultadoEsperado);
    }

}
```

Al ejecutar el test, vemos que todas las pruebas pasan correctamente.


## 5. TEST UNITARIOS EN PROYECTOS MAVEN

Maven es una herramienta de gestión y construcción de proyectos para Java. Su propósito principal es facilitar la gestión de dependencias, la compilación, la ejecución de pruebas y la creación de paquetes de manera eficiente y estandarizada.

### 5.1 Características principales

- **Gestión de dependencias**: Permite incluir fácilmente bibliotecas externas sin necesidad de descargarlas manualmente.
- **Estructura estandarizada de proyectos**: Define una organización común para los proyectos Java.
- **Automatización de procesos**: Facilita la compilación, pruebas y empaquetado de aplicaciones.
- **Repositorio central**: Almacena las bibliotecas y plugins utilizados en el proyecto.
- **Uso de archivos POM (Project Object Model)**: Define la configuración del proyecto en un archivo XML.

### 5.2. Estructura de un proyecto Maven

Maven organiza los proyectos de una manera particular. Para generar un proyecto Maven debemos ejecutar en la paleta de comandos

`Maven: New Project`

Y elegir "maven-archetype-quickstart":

![elegimos maven quickstart](/assets/images/ee6942572fd6f1b56dcf32f9e8d715c7.png)

Dentro las versiones, elegimos la última estable (a día de hoy, la 1.4) y damos nombre al ```group-id``` que desarrolla el proyecto, que suele ser la URL de la empresa en notación inversa:

![d7ec695a066df06dd8fe29340ffe7fd5.png](/assets/images/d7ec695a066df06dd8fe29340ffe7fd5.png)

Ahora damos nombre al ```artifact``` a desarrollar, esto es, el nombre del proyecto:

![d70a5d8e63bf1adea9a68f8c8e2d4ab2.png](/assets/images/d70a5d8e63bf1adea9a68f8c8e2d4ab2.png)

Y elegimos la carpeta donde se guardará.

Ahora Visual Studio Code ejecuta una serie de comandos que se descargan las librerías necesarias y nos hace una serie de preguntas para configurar el proyecto.
Esto se puede ver en la parte inferior del proyecto:

![9edcebd9be45ece22b89436fed3174ef.png](/assets/images/9edcebd9be45ece22b89436fed3174ef.png)

Podemos pulsar Intro para aceptar los valores por defecto.

Estos comando generará una estructura de proyecto con las siguientes carpetas:

```
|-- pom.xml (Archivo de configuración de Maven)
|-- src (Código fuente)
|   |-- main  
|   |   `-- java
|   |       `-- com
|   |           `-- mycompany
|   |               `-- app
|   |                   `-- App.java 
|   `-- test (Pruebas unitarias)
|       `-- java
|           `-- com
|               `-- mycompany
|                   `-- app
|                       `-- AppTest.java
`-- target (Carpeta de clases compiladas)
```

### 5.3 Archivo `pom.xml`

El archivo `pom.xml` es el núcleo de un proyecto Maven. Contiene información como:

- Nombre y versión del proyecto.
- Dependencias necesarias.
- Configuración de compilación y empaquetado.

Ejemplo de `pom.xml` básico:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ejemplo</groupId>
    <artifactId>mi-proyecto</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

</project>
```

Dentro de las etiquetas de ```<project>```, debemos  insertar las dependencias necesarias. Para nuestros test serán las siguientes:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.11.4</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.11.4</version>
        <scope>test</scope>
    </dependency>
	<dependency>
	    <groupId>org.junit.jupiter</groupId>
	    <artifactId>junit-jupiter-params</artifactId>
	    <version>5.11.4</version>
	</dependency>
	
</dependencies>
```

Hemos optado por crear un proyecto **Maven** para que el proceso instalar las dependencias necesarias para realizar los test sea  independiente del IDE y el sistema operativo que usemos.

Para conocer mas sobre los proyectos Maven también podemos visitar la página web de Apache, el creador oficial de la herramienta:

https://maven.apache.org/guides/getting-started/

### 5.4 DEPENDENCIAS

Aparte de las librerías para realizar los test, Maven permite instalar multitud de librerías a través de las dependencias. Podemos encontrar las dependencias necesarias en los dos repositorios más famosos:

- [REPOSOTORIO SONATYPE](https://central.sonatype.com/search?namespace=org.junit.jupiter). Es el repositorio recomendado por el desarrollador oficial, con las últimas actualizaciones del plugin.

- [REPOSOTORIO MAVEN](https://mvnrepository.com/). Es el repositorio de Maven creado por un desarrollador particular con una gran cantidad de plugins.
