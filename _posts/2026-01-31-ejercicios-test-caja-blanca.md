---
title: "UT03 - PRUEBAS DE CAJA BLANCA"
date: 2026-01-31T00:01:30-01:00
categories:
  - UT03
tags:
  - caja blanca
---

### EJERCICIO 1

```java
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);

    int cantidad;
    double precioUnidad;
    double totalPagar;

    System.out.print("Introduce el número de teclados que quieres comprar: ");
    cantidad = sc.nextInt();

    if (cantidad > 8) {
        precioUnidad = 20.0;
    } else {
        if (cantidad >= 4) { //cantidad entre 4 y 8
            precioUnidad = 26.0;
        } else { // cantidad menos de 4
            precioUnidad = 30.0;
        }
    }

    totalPagar = cantidad * precioUnidad;

    System.out.println("Número de teclados: " + cantidad);
    System.out.println("Precio por teclado: " + precioUnidad + " €");
    System.out.println("Total a pagar: " + totalPagar + " €");

    sc.close();
}
```


### EJERCICIO 2

```java
public static boolean esNumeroEspecial(int numero) {
        int suma = 0;
       
        int temp = numero;
        boolean devuelve;
        while (temp > 0) {
            suma += temp % 10;
            temp /= 10;
        }
        
        if (suma % 2 == 0) {
            if (numero % 3 == 0) {
                devuelve = true; 
            }
        } else {
            if (numero % 5 == 0) {
                devuelve =  true; 
            }
        }
        return devuelve;
    }
```

### EJERCICIO 3

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int edad;
    String genero;
    
    
    // Validación de edad
    do {
        System.out.print("Introduce tu edad (18-100): ");
        edad = sc.nextInt();
        if (edad < 18) || edad > 100) {
            System.out.println("Error: La edad debe estar entre 18 y 100.");
        }
    } while (edad < 18 || edad > 100);
    
    sc.nextLine(); // Consumir el salto de línea restante
    
    // Validación de género
    do {

        System.out.print("Introduce tu género (Hombre/Mujer): ");
        genero = sc.nextLine().trim().toLowerCase();
        if (!genero.equals("hombre") && !genero.equals("mujer")) {
            System.out.println("Error: Introduce solo 'Hombre' o 'Mujer'.");
        }
    } while (!genero.equals("hombre") && !genero.equals("mujer"));
    
    // Determinación del grupo según las condiciones
    String grupo;
    if ((genero.equals("mujer") && edad > 35) || (genero.equals("hombre") && edad > 50)) {
        grupo = "A";
    } else {
        grupo = "B";
    }
    
    System.out.println("Te corresponde el grupo " + grupo + ".");
    
    sc.close();
}
```

### EJERCICIO 4

```java
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double monto;
    int experienciaLaboral;
    String nivelRiesgo = "";

    System.out.print("monto: ");
    monto = Double.parseDouble(teclado.nextLine());

    System.out.print("experienciaLaboral: ");
    experienciaLaboral = Integer.parseInt((teclado.nextLine()));

    if (monto <= 0) {
        System.out.println("Error: Monto o ingreso inválido");
    } else {
        if (monto > 150000) {
            if (experienciaLaboral < 2)
                nivelRiesgo = "Alto";
            else
                nivelRiesgo = "Medio";
        } else if (monto <= 150000) {
            if (experienciaLaboral < 5)
                nivelRiesgo = "Medio";
            else
                nivelRiesgo = "Bajo";
        } else {
            nivelRiesgo = "Bajo";
        }
    }
    System.out.println("Riesgo " + nivelRiesgo);
}
```

### EJERCICIO 5

```java
public int primerNumero(int n) {
        int primera = 0;

        if (n < 10) {
            primera = n;
        }

        else if (n < 100) {
            primera = n / 10;
        }

        else if (n < 100) {
            primera = n / 100;
        }

        else if  (n < 10000) {
            primera = n / 1000;
        }

        else if (n >= 10000) {
            primera = n / 10000;
        }

        else {
            primera = 0;
        }


        return primera;
    }