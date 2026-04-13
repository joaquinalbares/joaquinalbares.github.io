---
title: "UT04 - DOCUMENTACIÓN"
date: 2026-04-12T00:01:30-01:00
categories:
  - UT04
tags:
  - DOCUMENTACIÓN
---

## 1.1 DOCUMENTACIÓN

Por último, la documentación. Ningún desarrollador puede considerarse bueno si no le da la importancia que corresponde a la documentación. Recuérdese que un programa poco o mal documentado es un mal producto.

Antes de entrar en detalles, algunas frases a tener en cuenta:

> "If your program isn't worth documenting, it probably isn't worth running" (Si su programa no merece la pena documentarlo, probablemente no merece la pena ejecutarlo). J. Nagler. 1995.

> "Do not document bad code - rewrite it" (No documentar código malo—reescribirlo). R. Caron. 2000.

> "Write the documentation before you write the code." (Escribe la documentación antes de escribir el código). S.W. Ambler. 2000.

**JavaDoc** es la utilidad de Java para extraer y generar documentación directamente del código en formato HTML. Es muy recomendable escribir los comentarios del código de acuerdo a las recomendaciones de `Javadoc`, ya que es un estándar 'de facto' y así la documentación será útil. La documentación y el código se van a incluir dentro del mismo fichero. 

Los tipos de comentarios para generar la documentación son:

- Comentarios de línea: comienzan con los caracteres `//`  y terminan con la línea.
- Comentarios tipo C: comienzan con los caracteres `/*`, y terminan con los caracteres `*/`. Pueden agrupar a varias líneas.
- Parecidos a los anteriores, los comentarios de documentación `Javadoc` se colocan entre los delimitadores `/**` (dos Asteriscos en la primera línea) y  `*/` , agrupan varias líneas, y cada línea irá precedida por un `*` y deben colocarse:
  -  antes de la declaración de una clase.
  -  antes de un método o un constructor. 
  -  antes un campo o atributo (opcional)

Dentro de estos delimitadores se podrá escribir etiquetas HTML. Los comentarios Javadoc están formados por dos partes una descripción seguida de un bloque de tags.

> Los tags son etiquetas que describen una característica o propiedad de la documentación en java.

Los tags mas comunes son:

| Tag | Descripción | Uso | 
| -- | -- | -- |
| @author | Nombre del desarrollador. | nombre_autor |
| @version | Versión del método o clase. | versión |
| @param | Definición de un parámetro de un método, es requerido para todos los parámetros del método. 	| nombre_parametro descripción |
| @return | Informa de lo que devuelve el método, no se puede usar en constructores o métodos "void". | 	descripción |
| @throws | Excepción lanzada por el método, posee un sinónimo de nombre @exception | nombre_clase descripción | 
@see | Asocia con otro método o clase. | referencia (#método(); clase#método(); paquete.clase; paquete.clase#método()). | 
@since | Especifica la versión del producto | indicativo numerico 
@serial | Describe el significado del campo y sus valores aceptables. Otras formas válidas son @serialField y @serialData | campo_descripcion | 
@deprecated | Indica que el método o clase es antigua y que no se recomienda su uso porque posiblemente desaparecerá en versiones posteriores.| descripción | 

## 1.2. UN EJMPLO DE CLASE DOCUMENTADA.
Un ejemplo de documentación podría ser el siguiente:

```java
/**
 * Clase Calculadora para operaciones matemáticas básicas.
 * 
 * Esta clase proporciona métodos para sumar, restar y multiplicar números enteros.
 * 
 * @author Desarrollador
 * @version 1.0
 * @since 2026-04-13
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     * 
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param a Minuendo (número inicial).
     * @param b Sustraendo (número a restar).
     * @return La diferencia entre a y b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return El producto de a y b.
     * @throws ArithmeticException si algún parámetro es cero (ejemplo de manejo de excepciones).
     */
    public int multiplicar(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Multiplicación por cero no permitida");
        }
        return a * b;
    }
}
```

### GENERACIÓN DE LA DOCUMENTACIÓN

La herramienta de línea de comandos de `Javadoc` es muy poderosa pero tiene cierta complejidad.

Ejecutar el comando `javadoc` sin ninguna opción o parámetro dará como resultado un error y los parámetros de salida que espera.Tendremos que especificar al menos para qué paquete o clase queremos que se genere la documentación.

Para ello, abrimos una línea de comando y naveguamos al directorio del proyecto y ,asumiendo que las clases están todas en la carpeta `src` en el directorio del proyecto, dentro de `src` ejecutamos:

```cmd
javadoc -d doc src/*
```

Esto generará documentación en un directorio llamado doc como se especifica con el indicador `–d`. Con el `*` generamos la documentación de todo lo contanido en la carpeta `src`.

Utilizar un IDE con la funcionalidad integrada es, por supuesto, más fácil y generalmente recomendado.

[REFERENCIA OFICIAL](https://docs.oracle.com/en/java/javase/26/tools/javadoc.html)

### 2.3. EJERCICIO DE CLASE

[Documentación](/assets/EjercicioClase.zip)
