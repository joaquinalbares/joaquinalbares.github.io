---
title: "UT06 - EJERCICIO RESUELTO"
date: 2026-05-15T00:03:30-01:00
categories:
  - UT06
tags:
  - UML
  - Ejercicios
---



## Ejercicio 1. Gestión de centro deportivo

### Enunciado

Un centro de ocio gestiona socios y varias salas (sala de baile, estudio, pista de pádel) que tienen nombre, capacidad y horario. Los socios pueden reservar una sala para una franja horaria concreta; las reservas pueden ser individuales o de grupo y deben confirmarse a la llegada. Diseña el diagrama de clases y un diagrama de objetos con un socio y dos reservas.

### Tareas y soluciones propuestas
#### Indicar atributos y métodos principales.
**Identificar Clases, Atributos y Métodos.** En este caso encontramos las siguientes clases: 
- Socio, es la clase que gestiona los socios
  - Atributos: id, nombre, email, tipoCuota.
  - Métodos: reservarSala(socio, sala, fechaHora, duracion), confirmarAsistencia(reserva).
- Sala, es la clase que gestiona las salas.
  - Atributos: id, nombre, capacidad, horario.
  - Métodos: anularReserva(reserva).
- Reserva, es la clase que gestiona las reservas.
  - Atributos: id, fechaHora, duracion, tipoReserva.
- Opcionalmente, podriamos crear la clase Centro, que gestiona el centro de manera general.
  - Atributos: id, nombre, direccion.

**Añadir multiplicidades en las asociaciones.**
- Socio 1..* — 0..* Reserva.
- Sala 1 — 0..* Reserva
- Entre Centro y Sala se pude implementar una Composición: Centro contiene Salas (composición fuerte).

**Elaborar el diagrama de clases.** 
```text
@startuml
class Centro {
- nombre: String
- direccion: String
}
class Socio {
- id: String
- nombre: String
- email: String
- tipoCuota: String
+ reservarSala(sala: Sala, fechaHora: DateTime, duracion: int): Reserva
+ confirmarLlegada(reserva: Reserva): void
}
class Sala {
- id: String
- nombre: String
- capacidad: int
- horario: String
+ crearSala(nombre:String,capacidad:int,horario:String): Sala
}
class Reserva {
- id: String
- fechaHora: DateTime
- duracion: int
- tipoReserva: String
- confirmado: boolean
+ confirmar(): void
}
class Grupo {
- id: String
- nombre: String
}
Centro *-- Sala
Socio "1" -- "0..*" Reserva
Sala "1" -- "0..*" Reserva
Reserva "0..1" -- "0..1" Grupo
@enduml
```
El diagrama de clases se puede ver en la siguiente figura:
[Diagrama de clases en PlantUML](https://www.plantuml.com/plantuml/png/ZLB1JiCm3BtlAwAUjj5DSDrfqf3Wm8do0rxYRPRIk7BJNH3_ZjL4QM6Ju9AsptxkUo_Uzn4a3grVM0zzRmuOeh3vN6nCuFOek3DD50fd1Hm9MaiS2lQLMGrRIYHo4-5s0hP0VlOTgUF3m14Azc04UvGhI0CUbhqUMjEpDYUq5tXbKU0P8dvGYxLnWq2IH26kTkOziNMEvN0YQK7UF9x1mJ8FBZtQVMLoamdmy0yF5ZgmvC2DlrJWmW92FBDW1RF-p4wLUg8giywyN5mbcqLD5daZw5uCYlx88IURHqpSaebJjKTcZn3cIIr_H_8YG_VdlMfttfhrPfDCf7sedYgZIFMutQwhSZDZpFTB-Jd2fK7Vaex57eFJJVq6)

**Crear un diagrama de objetos con un socio y una reserva.**
```text
@startuml
object "Socio_S01" as S01 {
id = "S01"
nombre = "Ana Ruiz"
email = "ana@ejemplo.com"
tipoCuota = "mensual"
}
object "Sala_A1" as A1 {
id = "A1"
nombre = "SalaBaile"
capacidad = 25
horario = "Lun-Vie 17:00-21:00"
}
object "Reserva_R10" as R10 {
id = "R10"
fechaHora = "2026-05-20 18:00"
duracion = "60"
tipoReserva = "individual"
confirmado = false
}
S01 --> R10 : "hizo"
A1 --> R10 : "ocupadaPor"
@enduml
```

El diagrama de clases se puede ver en la siguiente figura:
[Diagrama de objetos en PlantUML](https://www.plantuml.com/plantuml/png/LP31QiCm38RlVWhZUuOJQ3SA6yrssM67qSAkHRLLec9RmObxwEYxBqh7kbui_Eb7d-NrC48UImoAzqTqepPRTiIxhQsDXa5FLNyhylfP6s4gSTndb6kRG6yAdOt221G4GO8r7Z7sWHySHwD6wlcjy0ZIZPY60i6eoqq60NRjLTNUJEsTI4Alam6DSj238m-IQXQgumoPM48V9LLVXBf-N5bRDVLq_XTjSC1yWjscjhDigdysOUg0heDtpY2aiSsoiekgiRf-cYVvaYSn9-akxNMntvc2A7awaP-tSvmEb2DuUTS1me3gekGVg-fbzgwqwUZCHhLtZ5tfmSCdPwFMc7o9uGS0)
