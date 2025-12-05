---
title: "UT04 - DOCUMENTACIÓN"
date: 2025-03-05T00:01:30-01:00
categories:
  - UT04
tags:
  - DOCUMENTACIÓN
---

# Documentación en Java
Ningún desarrollador puede considerarse bueno si no le da la importancia que corresponde a la documentación. Recuérdese que un programa poco o mal documentado es un mal producto.

Antes de entrar en detalles, algunas frases a tener en cuenta:

> "If your program isn't worth documenting, it probably isn't worth running" (Si su programa no merece la pena documentarlo, probablemente no merece la pena ejecutarlo). J. Nagler. 1995.

> "Do not document bad code - rewrite it" (No documentar código malo—reescribirlo). R. Caron. 2000.

> "Write the documentation before you write the code." (Escribe la documentación antes de escribir el código). S.W. Ambler. 2000.

La documentación en Java es esencial para mantener el código legible, comprensible y mantenible. Java utiliza **Javadoc**, una herramienta estándar para generar documentación a partir de comentarios en el código, además de comentarios en línea para explicar lógica interna. A continuación, se explican las mejores prácticas y ejemplos prácticos.

## 1. ¿Qué es Javadoc?

Javadoc es una herramienta incluida en el JDK que genera documentación en formato HTML a partir de comentarios especiales en el código fuente. Estos comentarios comienzan con `/**` y terminan con `*/`. Se usan para documentar clases, métodos, campos y paquetes.

### Características principales:
- **Uso de etiquetas (tags):** Como `@param`, `@return`, `@author`, etc., para estructurar la información.
- **Generación automática:** Ejecutando `javadoc` se crea documentación navegable.
- **Integración con IDEs:** Herramientas como IntelliJ o Eclipse muestran la documentación al pasar el cursor sobre elementos.

## 2. Tipos de comentarios en Java

### 2.1. Comentarios Javadoc
- Usados para documentar elementos públicos o protegidos (clases, métodos, campos).
- Formato: `/** Descripción aquí */`.
- Ejemplo:
  ```java
  /**
   * Calcula el área de un rectángulo dado su ancho y alto.
   * @param ancho El ancho del rectángulo en metros.
   * @param alto El alto del rectángulo en metros.
   * @return El área del rectángulo en metros cuadrados.
   * @throws IllegalArgumentException Si ancho o alto son negativos.
   */
  public double calcularArea(double ancho, double alto) {
      if (ancho < 0 || alto < 0) {
          throw new IllegalArgumentException("Ancho y alto deben ser no negativos.");
      }
      return ancho * alto;
  }
  ```

### 2.2. Comentarios de una línea
- Usados para explicar una línea específica de código.
- Formato: `// Comentario`.
- Ejemplo:
  ```java
  // Incrementa el contador de intentos
  intentos++;
  ```

### 2.3. Comentarios de bloque
- Usados para explicar bloques de código o secciones complejas.
- Formato: `/* Comentario */` o `/* Comentario multilínea */`.
- Ejemplo:
  ```java
  /*
   * Este bloque verifica si el usuario está autenticado
   * antes de permitir el acceso al recurso.
   */
  if (!usuario.isAutenticado()) {
      return false;
  }
  ```

## 3. Etiquetas Javadoc más comunes

| Etiqueta               | Descripción                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| `@author`             | Indica el autor del código (opcional, usado en proyectos colaborativos).    |
| `@param`              | Describe un parámetro del método.                                           |
| `@return`             | Describe el valor retornado por el método.                                  |
| `@throws` / `@exception` | Describe las excepciones que el método puede lanzar.                     |
| `@since`              | Indica desde qué versión del software está disponible el elemento.          |
| `@see`                | Proporciona un enlace o referencia a otro elemento (clase, método, etc.).   |
| `@deprecated`         | Marca un elemento como obsoleto y sugiere alternativas.                    |

### Ejemplo con etiquetas:
```java
/**
* <h2>Clase Empleado, se utiliza para crear y leer empleados de una BD</h2>
* Busca información de javadoc en <a href="http://google.com">GOOGLE</a>
* @see <a href="http://www.google.com">Google</a>
* @author JRV
* @since 1.0 */
public class Empleado {
  /** Atributo Nombre del empleado */
  private String nombre;
  /** Atributo apellido del empleado */
  private String apellido;
  /** Edad del empleado */
  private double salario;

  /**
  * Constructor con 3 parámetros.
  * Crea objetos empleado, con nombre, apellido y salario.
  * @param nombre Nombre d e l empleado
  * @param apellido Apellido del empleado
  * @param salario Salario del empleado */
  public Empleado(String nombre, String apellido, double salario).{
    this.nombre=nombre;
    this.apellido=apellido;
    this.salario=salario;
  }

  //Métodos públicos
  /**
  * Sube el salario al empleado. * @see Empleado
  * @param subida
  *
  */
  public void subidasalario (double subida) {
    salario=salario + subida;
  }

  //Métodos privados
  /**
  * Comprueba que e l nombre no este vacío
  * @return <ul>
  *   <li>true: el nombre es una cadena vacía</li>
  *   <li>false: el nombre no es una cadena vacía</li>
  * </ul>
  */
  private boolean comprobar(){
    if(nombre.equals("")) {
	  return false;
	 }
	 return true;
  }
}
```

## 4. Buenas prácticas para documentar

1. **Sé claro y conciso:** Evita redundancias. Describe lo que hace el código, no cómo lo hace (a menos que sea necesario).
   - Mal: `// Este método multiplica ancho por alto para obtener el área`.
   - Bien: `// Calcula el área de un rectángulo`.

2. **Documenta todos los elementos públicos:** Clases, métodos y campos públicos deben tener comentarios Javadoc.

3. **Usa un estilo consistente:** Mantén el mismo formato y nivel de detalle en todo el proyecto.

4. **Actualiza la documentación:** Si cambias el código, actualiza los comentarios para evitar información obsoleta.

5. **Evita comentarios innecesarios:** No comentes cosas obvias, como `// Declara una variable`.

6. **Incluye ejemplos cuando sea útil:** Por ejemplo, en métodos complejos, muestra cómo usarlos.

### Ejemplo de método complejo con explicación:
```java
/**
 * Convierte una cadena en formato CSV a una lista de enteros.
 * <p>
 * Ejemplo de uso:
 * <pre>
 * String csv = "1,2,3,4";
 * List<Integer> resultado = parseCsvToIntegers(csv);
 * // resultado contiene [1, 2, 3, 4]
 * </pre>
 * @param csv Cadena en formato CSV (valores separados por comas).
 * @return Lista de enteros parseados.
 * @throws NumberFormatException Si algún valor no es un entero válido.
 * @throws IllegalArgumentException Si la cadena está vacía o es null.
 */
public List<Integer> parseCsvToIntegers(String csv) {
    if (csv == null || csv.isEmpty()) {
        throw new IllegalArgumentException("La cadena CSV no puede ser null o vacía.");
    }
    List<Integer> numeros = new ArrayList<>();
    String[] valores = csv.split(",");
    for (String valor : valores) {
        numeros.add(Integer.parseInt(valor.trim()));
    }
    return numeros;
}
```

## 5. Generación de documentación con Javadoc

Para generar la documentación en HTML:
1. Asegúrate de que tu código tenga comentarios Javadoc.
2. Ejecuta el comando:
   ```bash
   javadoc -d docs -sourcepath src -subpackages com.ejemplo
   ```
   - `-d docs`: Directorio donde se guardará la documentación.
   - `-sourcepath src`: Ruta al código fuente.
   - `-subpackages com.ejemplo`: Paquetes a documentar.

3. Abre el archivo `index.html` generado en el directorio `docs` para ver la documentación.

## 6. Ejemplo completo: Clase documentada

A continuación, un ejemplo de una clase completamente documentada:

```java
/**
 * Representa un rectángulo con ancho y alto.
 * @author Ana García
 * @since 1.0
 */
public class Rectangulo {
    private double ancho;
    private double alto;

    /**
     * Crea un rectángulo con las dimensiones especificadas.
     * @param ancho El ancho del rectángulo en metros.
     * @param alto El alto del rectángulo en metros.
     * @throws IllegalArgumentException Si ancho o alto son negativos.
     */
    public Rectangulo(double ancho, double alto) {
        if (ancho < 0 || alto < 0) {
            throw new IllegalArgumentException("Ancho y alto deben ser no negativos.");
        }
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Calcula el área del rectángulo.
     * @return El área en metros cuadrados.
     */
    public double getArea() {
        return ancho * alto;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * @return El perímetro en metros.
     */
    public double getPerimetro() {
        return 2 * (ancho + alto);
    }

    /**
     * Obtiene el ancho del rectángulo.
     * @return El ancho en metros.
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Obtiene el alto del rectángulo.
     * @return El alto en metros.
     */
    public double getAlto() {
        return alto;
    }
}
```

## 7. Conclusión

La documentación en Java, especialmente con Javadoc, es una práctica esencial para proyectos de cualquier tamaño. Al seguir las mejores prácticas y proporcionar ejemplos claros, facilitas la colaboración, el mantenimiento y la comprensión del código. Usa Javadoc para elementos públicos, comentarios en línea para lógica interna y asegúrate de mantener la documentación actualizada.
