---
title: "UT04 - DOCUMENTACIÓN Y PRUEBAS: EJERCICIO 1"
date: 2025-05-06T00:01:30-01:00
categories:
  - UT04
tags:
  - REFACTORIZACIÓN
---

Refactorizar y documentar el siguiente codigo:

```java


public class Fecha {

public int dia;

private int mes;

public int anio;

public Fecha(int dia, int mes, int anio) {

this.dia = dia;

this.mes = mes;

this.anio = anio;

}

public boolean valida () {

if (dia < 1 || dia > 31)

return false;

if (mes < 1 || mes > 12)

return false;

int diasMes = 0;

switch (mes) {

case 1:

case 3:

case 5:

case 7:

case 8:

case 10:

case 12: diasMes = 31; break;

case 4:

case 6:

case 9:

case 11 : diasMes = 30; break;

case 2 :

if ( (anio % 400 == 0) ||

( (anio % 4 == 0) && (anio % 100 != 0) ) )

diasMes = 29;

else diasMes = 28;

break;

}

if (dia > diasMes)

return false;

else return true;

}

}
```

En un documento aparte se deberá indicar las modifiaciones realizadas siguiento el siguiente modelo:

**1. RENOMBRADO**
- La variable dia se ha renombrado a diaMes.
- ...

**2. CREACIÓN DE MÉTODOS**
- Se ha agrupado el codigo de las lineas 12-17 a un nuevo método llamado .....

**3. ENCAPSULAMIENTO**
- Las variables dia y anio se han hecho privadas y se han creado los getter y setter correspondientes.

**4. AGRUPAMIENTO DE CLASES**
- Se ha creado el package "fechas" para guardar la clase
