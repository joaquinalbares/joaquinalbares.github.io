---
title: "UT04 - REFACTORIZACIÓN"
date: 2026-03-10T00:01:30-01:00
categories:
  - UT04
tags:
  - REFACTORIZACIÓN
---

## 1. REFACTORIZACIÓN

Una de las destrezas básicas para convertirse en un buen programador consiste en saber optimizar código. Inicialmente, cuando somos profesores novatos, hacemos los programas de la única forma que sabemos, pero, cuando adquirimos experiencia y somos capaces de generar varias, hay que elegir entre todas las posibles soluciones la más eficiente, efectiva, ... En resumen, la óptima. De eso se trata la optimización.

Técnicamente, podemos decir que optimización o refactorización es el proceso de cambiar la estructura interna de un software sin alterar su comportamiento externo y se realiza para mejorar la calidad del código, aumentar su legibilidad y mantenibilidad.

Algunas de las características más importantes son:

1. Se puede hacer a medida que se desarrolla el software o después de que está completado.
2. Algunas técnicas de refactorización incluyen la reestructuración de código, la eliminación de duplicados y la creación de métodos reutilizables.
3. Es importante realizar pruebas después de cualquier refactorización para asegurarse de que el comportamiento del software sigue siendo el esperado.
4. La refactorización puede ser una parte valiosa del ciclo de desarrollo de software para asegurar un código limpio y eficiente.

**¿Cuándo refactorizar?**

Algunos autores han identificado algunos indicadores que nos van a decir que nuestro código es susceptible de ser refactorizado. Algunos de los más importantes son los siguientes:

- **Código duplicado (Duplicated code)**. Es la principal razón para refactorizar. Si se detecta el mismo código en más de un lugar, se debe buscar la forma de extraerlo y unificarlo.
- **Métodos muy largos (Long method)**. Cuanto más largo es un método más dificil es de entender. Un método muy largo normalmente está realizando tareas que deberían ser responsabilidad de otros. Se deben identificar y descomponer el método en otros más pequeños. En la programación orientada a objetos cuanto más corto es un método más fácil es reutilizarlo.
- **Clases muy grandes (Large class)**. Si una clase intenta resolver muchos problemas, tendremos una clase con demasiados métodos, atributos o incluso instancias. La clase está asumiendo demasiadas responsabilidades. Hay que intentar hacer clases más pequeñas, de forma que cada una trate con un conjunto pequeño de responsabilidades bien delimitadas.
- **Lista de parámetros extensa (Long parameter list)**. En la programación orientada a objetos no se suelen pasar muchos parámetros a los métodos, sino solo aquellos mínimamente necesarios para que el objeto involucrado consiga lo necesario. Tener demasiados parámetros puede estar indicando un problema de encapsulación de datos o la necesidad de crear una clase de objetos a partir de varios de esos parámetros, y pasar ese objeto como argumento en vez de todos los parámetros. Especialmente si esos parámetros suelen tener que ver unos con otros y suelen ir juntos siempre.

### 1.1. Patrones de refactorización

1. Son soluciones comunes y probadas a problemas específicos en el código.
2. Ayudan a mejorar la estructura y calidad del código de forma sistemática y repetitiva.
3. Algunos patrones de refactorización comunes incluyen: Extracción de método, Reemplazo de condicional con polimorfismo, Inversión de dependencias y Extracción de clase.
4. Cada patrón tiene un propósito específico, como reducir la complejidad, aumentar la legibilidad o mejorar la escalabilidad.
5. Utilizar patrones de refactorización es una buena práctica para mantener un código sólido y fácil de mantener.
6. Es importante conocer los patrones de refactorización y elegir el adecuado para cada situación, para lograr una solución eficiente y sostenible a largo plazo.

#### Algunos patrones:

En el proceso de refactorización, se siguen una serie de patrones preestablecidos, los más comunes son los siguientes:

- **Renombrado (rename)**: este patrón nos indica que debemos cambiar el nombre de un paquete, clase, método o campo, por un nombre más significativo.
- **Sustituir bloques de código por un método**: este patrón nos aconseja sustituir un bloque de código, por un método. De esta forma, cada vez que queramos acceder a ese bloque de código, bastaría con invocar al método.
- **Campos encapsulados**: se aconseja crear métodos getter y setter, (de asignación y de consulta) para cada campo que se defina en una clase. Cuando sea necesario acceder o modificar el valor de un campo, basta con invocar al método getter o setter según convenga.
- **Organizar las clases por paquetes (packages)**: si es necesario, se puede mover una clase de un paquete a otro, o de un proyecto a otro. La idea es no duplicar código que ya se haya generado. Esto impone la actualización en todo el código fuente de las referencias a la clase en su nueva localización.
- **Cambiar los parámetros del proyecto**: nos permite añadir nuevos parámetros a un método y cambiar los modificadores de acceso.

A continuación, se describen los más comunes con ejemplos prácticos:

- **Código duplicado (Duplicated code)**: Código repetido en varios lugares es un signo de mala práctica. Unificarlo reduce errores y mejora la mantenibilidad.

  **Ejemplo antes:**
  ```java
  public void printUserDetails(User user) {
      System.out.println("Name: " + user.getName());
      System.out.println("Age: " + user.getAge());
      System.out.println("Email: " + user.getEmail());
  }

  public void logUserDetails(User user) {
      System.out.println("Name: " + user.getName());
      System.out.println("Age: " + user.getAge());
      System.out.println("Email: " + user.getEmail());
  }
  ```

  **Ejemplo después (refactorizado):**
  ```java
  public void displayUserDetails(User user) {
      System.out.println("Name: " + user.getName());
      System.out.println("Age: " + user.getAge());
      System.out.println("Email: " + user.getEmail());
  }

  public void printUserDetails(User user) {
      displayUserDetails(user);
  }

  public void logUserDetails(User user) {
      displayUserDetails(user);
  }
  ```

  Aquí, el código duplicado se extrajo a un método reutilizable `displayUserDetails`.

- **Métodos muy largos (Long method)**: Un método extenso es difícil de entender y suele realizar múltiples tareas. Dividirlo en métodos más pequeños mejora la claridad y reutilización.

  **Ejemplo antes:**
  ```java
  public void processOrder(Order order) {
      // Validar orden
      if (order == null || order.getItems().isEmpty()) {
          throw new IllegalArgumentException("Invalid order");
      }
      // Calcular total
      double total = 0;
      for (Item item : order.getItems()) {
          total += item.getPrice() * item.getQuantity();
      }
      // Aplicar descuento
      if (total > 100) {
          total *= 0.9; // 10% descuento
      }
      // Guardar orden
      saveOrder(order, total);
  }
  ```

  **Ejemplo después (refactorizado):**
  ```java
  public void processOrder(Order order) {
      validateOrder(order);
      double total = calculateTotal(order);
      total = applyDiscount(total);
      saveOrder(order, total);
  }

  private void validateOrder(Order order) {
      if (order == null || order.getItems().isEmpty()) {
          throw new IllegalArgumentException("Invalid order");
      }
  }

  private double calculateTotal(Order order) {
      double total = 0;
      for (Item item : order.getItems()) {
          total += item.getPrice() * item.getQuantity();
      }
      return total;
  }

  private double applyDiscount(double total) {
      return total > 100 ? total * 0.9 : total;
  }
  ```

  Cada tarea se separó en un método específico, haciendo el código más legible y reutilizable.

- **Clases muy grandes (Large class)**: Una clase con demasiadas responsabilidades debe dividirse en clases más pequeñas y enfocadas.

  **Ejemplo antes:**
  ```java
  public class OrderManager {
      private List<Order> orders;

      // Gestión de órdenes
      public void addOrder(Order order) { ... }
      public void removeOrder(Order order) { ... }

      // Cálculo de precios
      public double calculateTotal(Order order) { ... }
      public double applyDiscount(double total) { ... }

      // Persistencia
      public void saveOrder(Order order) { ... }
  }
  ```

  **Ejemplo después (refactorizado):**
  ```java
  public class OrderManager {
      private List<Order> orders;
      public void addOrder(Order order) { ... }
      public void removeOrder(Order order) { ... }
  }

  public class OrderCalculator {
      public double calculateTotal(Order order) { ... }
      public double applyDiscount(double total) { ... }
  }

  public class OrderRepository {
      public void saveOrder(Order order) { ... }
  }
  ```

  Las responsabilidades se distribuyen en clases específicas, siguiendo el principio de responsabilidad única.

- **Lista de parámetros extensa (Long parameter list)**: Métodos con muchos parámetros pueden indicar problemas de diseño. Agrupar parámetros relacionados en objetos mejora la encapsulación.

  **Ejemplo antes:**
  ```java
  public void createUser(String name, int age, String email, String address, String phone) {
      User user = new User(name, age, email, address, phone);
      // Lógica adicional
  }
  ```

  **Ejemplo después (refactorizado):**
  ```java
  public class UserData {
      private String name;
      private int age;
      private String email;
      private String address;
      private String phone;

      // Constructor y getters/setters
  }

  public void createUser(UserData userData) {
      User user = new User(userData);
      // Lógica adicional
  }
  ```

  Los parámetros se agrupan en una clase `UserData`, reduciendo la complejidad.

### 1.1. Patrones de refactorización

Los patrones de refactorización son soluciones estandarizadas a problemas comunes en el código. A continuación, se describen algunos con ejemplos en Java:

- **Renombrado (Rename)**: Cambiar nombres de variables, métodos o clases por otros más descriptivos.

  **Ejemplo antes:**
  ```java
  public void calc(int x, int y) {
      int z = x + y;
      return z;
  }
  ```

  **Ejemplo después:**
  ```java
  public int calculateSum(int firstNumber, int secondNumber) {
      int sum = firstNumber + secondNumber;
      return sum;
  }
  ```

  Los nombres ahora reflejan claramente la intención del método.

- **Sustituir bloques de código por un método (Extract Method)**: Extraer un bloque de código a un método reutilizable.

  **Ejemplo antes:**
  ```java
  public void printInvoice(Order order) {
      System.out.println("Invoice for: " + order.getCustomer());
      double total = 0;
      for (Item item : order.getItems()) {
          total += item.getPrice() * item.getQuantity();
      }
      System.out.println("Total: " + total);
  }
  ```

  **Ejemplo después:**
  ```java
  public void printInvoice(Order order) {
      System.out.println("Invoice for: " + order.getCustomer());
      double total = calculateTotal(order);
      System.out.println("Total: " + total);
  }

  private double calculateTotal(Order order) {
      double total = 0;
      for (Item item : order.getItems()) {
          total += item.getPrice() * item.getQuantity();
      }
      return total;
  }
  ```

- **Campos encapsulados (Encapsulate Field)**: Usar getters y setters para acceder a campos privados.

  **Ejemplo antes:**
  ```java
  public class User {
      public String name;
  }
  ```

  **Ejemplo después:**
  ```java
  public class User {
      private String name;

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }
  }
  ```

- **Organizar las clases por paquetes (Packages)**: Mover clases a paquetes lógicos para evitar duplicación y mejorar la organización.

  **Ejemplo antes:**
  ```java
  // Todas las clases en el paquete raíz
  public class Order { ... }
  public class OrderCalculator { ... }
  ```

  **Ejemplo después:**
  ```java
  // Paquete: com.example.order
  package com.example.order;
  public class Order { ... }

  // Paquete: com.example.calculator
  package com.example.calculator;
  public class OrderCalculator { ... }
  ```

### Ejemplo completo de refactorización

A continuación, un ejemplo que combina varios problemas y cómo refactorizarlos:

**Código original (con problemas):**
```java
public class OrderProcessor {
    public void process(String customer, String[] items, double[] prices, int[] quantities) {
        // Imprimir detalles
        System.out.println("Customer: " + customer);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + ": " + prices[i] * quantities[i]);
        }
        // Calcular total
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += prices[i] * quantities[i];
        }
        // Aplicar descuento
        if (total > 100) {
            total = total * 0.9;
        }
        System.out.println("Total: " + total);
    }
}
```

**Problemas detectados:**
1. Lista de parámetros extensa (`customer`, `items`, `prices`, `quantities`).
2. Código duplicado (cálculo de total y lógica de impresión).
3. Método largo con múltiples responsabilidades.
4. Nombres poco descriptivos.

**Código refactorizado:**
```java
public class Order {
    private String customer;
    private List<Item> items;

    public Order(String customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }
}

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}

public class OrderProcessor {
    public void process(Order order) {
        printOrderDetails(order);
        double total = calculateTotal(order);
        total = applyDiscount(total);
        System.out.println("Total: " + total);
    }

    private void printOrderDetails(Order order) {
        System.out.println("Customer: " + order.getCustomer());
        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getSubtotal());
        }
    }

    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getSubtotal();
        }
        return total;
    }

    private double applyDiscount(double total) {
        return total > 100 ? total * 0.9 : total;
    }
}
```

**Mejoras aplicadas:**
1. **Lista de parámetros extensa**: Se creó una clase `Order` y `Item` para agrupar datos relacionados.
2. **Código duplicado**: El cálculo de subtotales se delegó a la clase `Item`.
3. **Método largo**: Se dividió `process` en métodos más pequeños (`printOrderDetails`, `calculateTotal`, `applyDiscount`).
4. **Encapsulación**: Los campos están protegidos con getters.
5. **Nombres descriptivos**: Los nombres de clases, métodos y variables son más claros.
