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
        if (cantidad >= 4) { // aquí ya sabemos que cantidad está entre 4 y 8
            precioUnidad = 26.0;
        } else { // menos de 4
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
