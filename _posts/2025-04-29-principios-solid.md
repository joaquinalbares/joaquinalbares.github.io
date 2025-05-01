---
title: "UT04 - DOCUMENTACIÓN Y PRUEBAS: PRINCIPIOS SOLID"
date: 2025-03-02T00:01:30-01:00
categories:
  - UT04
tags:
  - PRINCIPIOS SOLID
---

Robert C. Martin introdujo estos principios en su artículo de 2000 ["Design Patterns and Design Principles"](https://staff.cs.utu.fi/~jounsmed/doos_06/material/DesignPrinciplesAndPatterns.pdf).
Michael Feathers desarrolló posteriormente estos conceptos y nos presentó el acrónimo **SOLID**.

En los últimos 20 años, estos cinco principios han revolucionado el mundo de la programación orientada a objetos y han cambiado la forma en que se desarrolla el software. En pocas palabras, los principios de diseño de Martin y Feathers nos animan a crear software más fácil de mantener, comprensible y flexible.
En consecuencia, a medida que nuestras aplicaciones crecen, podemos reducir su complejidad y ahorrarnos muchos dolores de cabeza en el futuro.

Los cinco conceptos siguientes conforman los principios SOLID:

1. **S**ingle Responsibility.
2. **O**pen/Closed.
3. **L**iskov Substitution.
4. **I**nterface Segregation
5. **D**ependency Inversion


Aunque estos conceptos pueden parecer complicados, pueden comprenderse fácilmente con algunos ejemplos de código sencillos.

### 1. Single Responsibility (esponsabilidad única).

Este principio establece que una clase sólo debe tener una responsabilidad. Además, sólo debe tener una razón para cambiar.

¿Cómo nos ayuda este principio a construir mejor software? Veamos algunos de sus beneficios:

- **Pruebas** - Una clase con una sola responsabilidad tendrá muchos menos casos de prueba.
- **Menor acoplamiento** - Menos funcionalidad en una sola clase tendrá menos dependencias.
- **Organización** - Las clases más pequeñas y bien organizadas son más fáciles de buscar que las monolíticas.

Veamos un ejemplo con una clase que gestiona cuentas bancarias. Inicialmente, la clase tiene múltiples responsabilidades (generar el informe y enviarlo por correo).

```java
package srp;

public class cuentaBancaria {
    private double balance;

    public void ingresar(double cantidad) {
        balance = (balance + cantidad);
    }

    public void retirar(double cantidad) {
        if (balance >= cantidad) {
            balance = balance - cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

}
```

En este caso encontramos que la clase tiene dos funciones que actúan sobre la cuenta, pero una de ellas además muestra un mensaje por pantalla, con lo que esa función extra rompe el principio. Se recomienda en este caso dejar que otra clase o bien el programa principal se encargue de mostrar por pantalla el resultado. Además, la variable __balance__ no están encapsulada. Hechos los cambios pertinentes, el código final quedaría de la siguiente forma:


```java
package srp;

public class cuentaBancaria {
    private double saldo;

    public double ingresar(double cantidad) {
        setSaldo(getSaldo() + cantidad);
        return getSaldo();
    }

    public double retirar(double cantidad) {
        if (getSaldo() >= cantidad) {
            setSaldo(getSaldo() - cantidad);
            return getSaldo();
        } else {
            return -1.0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
```

Ahora deberíamos crear una seguda clase para mostrar los mensajes por pantalla.

```java
package srp;

public class servicioCuentaBancaria {
    private cuentaBancaria miCuenta;

    public servicioCuentaBancaria(cuentaBancaria miCuenta) {
        this.miCuenta = miCuenta;
        System.out.println("Cuentra creada. Saldo actual: " + miCuenta.getSaldo());
    }

    public void hacerIngreso(double cantidad) {
        System.out.println("Cantidad ingresada: " + cantidad);
        System.out.println("Saldo actual: " + miCuenta.ingresar(cantidad));
    }

    public void hacerRetirada(double cantidad) {
        if (miCuenta.getSaldo() <= cantidad) {
            System.out.println("Saldo Insuficiente");
        }
        else {
            System.out.println("Cantidad retirada: " + cantidad);
            System.out.println("Saldo actual: " + miCuenta.ingresar(cantidad));
        }

    }

    public void imprimirSaldo() {
        System.out.println("Saldo actual: " + miCuenta.getSaldo());
    }
}
```

y un ejemplo final que usa estas clases podría ser el siguiente:

```java
package srp;

public class App {
    public static void main(String[] args) {

        cuentaBancaria miCuenta = new cuentaBancaria();
        miCuenta.setSaldo(200.00);
        servicioCuentaBancaria miBanco = new servicioCuentaBancaria(miCuenta);
        miBanco.hacerIngreso(25.6);
        miBanco.hacerRetirada(2.5);
        miBanco.hacerRetirada(250.6);
    }
}
```

### 2. **O**pen/Closed.

Principio Abierto/Cerrado (OCP): Este principio establece que las clases deben estar abiertas a extensiones pero cerradas a modificaciones.

Es un patrón de comportamiento, no de escritura de código, que viene a decir que, una vez creada una clase y probada en producción, no se debe modificar el código existente salvo errores, porque podría provocar errores en cadena en clases que heredan.

En el siguiente ejemplo, creamos un sistema que calcula descuentos para diferentes tipos de clientes (regular, premium). Al crear el interfaz básico, permitimos su amplicación sin necesidad de tocar su código, asegurando  que el sistema sea extensible para nuevos tipos de clientes .

```java
interface Discount {
    double applyDiscount(double price);
}
```

Las clases que implementan el interfaz ya añaden las funcionalidades deseadas.

1. Para clientes normales
```java
class RegularDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% descuento
    }
}
```
2. Para clientes premium
```java
class PremiumDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% descuento
    }
}
```

y la clase que calcula el descuento:

```java
class DiscountCalculator {
    public double calculate(Discount discount, double price) {
        return discount.applyDiscount(price);
    }
}
```

Si queremos añadir un nuevo tipo de descuento (por ejemplo, VIPDiscount) sin modificar DiscountCalculator, basta con implementarlo en la clase heredada.

```java
class VIPDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.7; // 30% descuento
    }
}
```

Un ejemplo de App que implementa todo esto:

```java
class MainOCP {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();
        Discount vip = new VIPDiscount();

        double price = 100.0;
        System.out.println("Precio con descuento regular: " + calculator.calculate(regular, price));
        System.out.println("Precio con descuento premium: " + calculator.calculate(premium, price));
        System.out.println("Precio con descuento VIP: " + calculator.calculate(vip, price));
    }
}
```

### 3. **L**iskov Substitution.
El siguiente en nuestra lista es el principio de sustitución de Liskov, que es posiblemente el más complejo de los cinco. En pocas palabras, si la clase A es un subtipo de la clase B, debería ser posible sustituir B por A sin que se viera alterado el comportamiento del programa.

Nuestro ejemplo diseña una jerarquía de clases para representar formas geométricas. El código inicial,  violando LSP, da por hecho que un cuadrado es una especialización del rectángulo. El «es una especialización» nos lleva a modelar esto mediante la herencia. Sin embargo, si en el código en el que `Cuadrado` deriva de `Rectangulo` provoca comportamientos extraños.

```java
package lsp;

public class rectangulo {
    protected int _ancho;
    protected int _alto;

    public void setAncho(int ancho){
        _ancho = ancho;
    }

    public void setAlto(int alto) {
        _alto = alto;
    }

    public int getAncho(){
        return _ancho;
    }

    public int getAlto(){
        return _alto;
    }

    public int getArea(){
        return _ancho * _alto;
    }
}
```

```java
package lsp;

class cuadrado extends rectangulo {

    public void setAlto(int lado) {
        _alto = lado;
        _ancho = lado;
    }

    public void setAancho(int lado) {
        _alto = lado;
        _ancho = lado;
    }
}
```

```java
package lsp;

public class App {
    public static void main(String[] args) throws Exception {
        rectangulo r = new cuadrado();
        //lsp.rectangulo r = new lsp.rectangulo();
        //no funciona igual si r es un rectangulo o si es un cuadrado
        r.setAncho(5);
        r.setAlto(10);
        System.out.println(r.getArea());
    }
}
```

Al implementar los métodos `setAncho` y `setAlto` en la clase base `Rectangulo`, algo que parece lógico, provoca que los métodos heredados en `Cuadrado` no tengan sentido, ya que el establecimiento de uno cambiaría el otro para que los dos coincidan. En este caso, la prueba de sustitución de Liskov no se cumple al no poder intecarbiar las clases ya que se modificaría su comportamiento.


### 4. **I**nterface Segregation - Principio de Segregación de Interfaces.

Este principuo significa simplemente que las interfaces más grandes deben dividirse en otras más pequeñas, y no sobrecargar las clases base con métodos que las herederas no van a necesitar, De este modo, nos aseguramos de que las clases implementadoras sólo tengan que preocuparse de los métodos que les interesan.

En este ejemplo, hemos diseñadon un interfaz para un sistema de gestión de dispositivos electrónicos.

#### Código inicial (violando ISP)

```java
interface Aparato {
    void encender();
    void apagar();
    void imprimir();
}

class impresora implements Aparato {
    @Override
    public void encender() {
        System.out.println("Impresora encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Impresora apagada");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }
}

class Bombilla implements Aparato {
    @Override
    public void encender() {
        System.out.println("Lámpara encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Lámpara apagada");
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Las lámparas no imprimen");
    }
}
```

El colocar el método `imprimir` fuerza a todas las sublcases a implementarlo aunque no lo puedan hacer, generando problemas como lanzar excepciones, algo ciertamente a evitar.


La solución refactorizada podría quedar asi:

```java
interface Encendible {
    void encender();
    void apagar();
}

interface Imprimible {
    void imprimir();
}

class imprimirer implements Encendible, Imprimible {
    @Override
    public void encender() {
        System.out_Row$System.out.println("Impresora encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Impresora apagada");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }
}

class Bombilla implements Encendible {
    @Override
    public void encender() {
        System.out.println("Lámpara encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Lámpara apagada");
    }
}
```

Ahora podemos añadir un nuevo dispositivo (por ejemplo, Scanner) que implemente solo las interfaces necesarias.

### 5. **D**ependency Inversion . Principio de Inversión de Dependencias (Dependency Inversion Principle - DIP)

El principio de inversión de dependencias se refiere al desacoplamiento de módulos de software. De este modo, en lugar de que los módulos de alto nivel dependan de los de bajo nivel, ambos dependerán de abstracciones.

// Descripción: Diseña un sistema de notificaciones que pueda enviar mensajes por diferentes canales (email, SMS). Usa inyección de dependencias para que el sistema no dependa de implementaciones concretas.

```java
// Código inicial (violando DIP)
class NotificationService {
    private EmailSender emailSender = new EmailSender();

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
```
La solución refactorizada pasa por separar ambos métodos para descaoplar los métodos y poder ampliar fácilemente las funcionalidades.

```java
interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando email: " + message);
    }
}

class SMSSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}

class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.send(message);
    }
}
```
