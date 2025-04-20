---
title: "RAMAS Y CONFLICTOS EN GIT"
date: 2024-12-03T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---

### Práctica: **Introducción a Git y GitHub: ramas y resolución de conflictos**

1. **Clona un repositorio inicial desde GitHub:**  
   - Ve a GitHub y crea un nuevo repositorio llamado `UT05-P02`.
   - Añade un archivo README.md con un mensaje inicial (por ejemplo, "Este es un repositorio de práctica de Git").
   - Clona el repositorio en tu máquina local:  
     ```bash
     git clone https://github.com/tuusuario/UT05-P02.git
     cd UT05-P02
     ```

---

#### **Parte 1: Trabajo con ramas **

1. **Crea una nueva rama:**  
   - Desde la terminal, crea y cámbiate a una nueva rama llamada `feature1`:  
     ```bash
     git checkout -b feature1
     ```

2. **Haz cambios en la nueva rama:**  
   - Abre el archivo `README.md` y añade una línea como:  
     ```
     Trabajando en la rama feature1.
     ```
   - Guarda los cambios y haz un commit:  
     ```bash
     git add README.md
     git commit -m "Añadida una línea desde feature1"
     ```

3. **Cambia a la rama principal (`main`) y haz otros cambios:**  
   - Vuelve a la rama `main`:  
     ```bash
     git checkout main
     ```
   - Añade una línea diferente al archivo `README.md`, por ejemplo:  
     ```
     Actualizando desde la rama principal.
     ```
   - Haz un commit de estos cambios:  
     ```bash
     git add README.md
     git commit -m "Actualización desde la rama principal"
     ```

---

#### **Parte 2: Fusión y resolución de conflictos **

1. **Intenta fusionar `feature1` con `main`:**  
   - Vuelve a la rama principal y fusiona `feature1`:  
     ```bash
     git merge feature1
     ```

2. **Resuelve el conflicto:**  
   - La fusión generará un conflicto porque ambas ramas modificaron la misma línea en `README.md`.
   - Abre el archivo `README.md` en tu editor de texto.  
   - Verás algo como esto:  
     ```plaintext
     <<<<<<< HEAD
     Actualizando desde la rama principal.
     =======
     Trabajando en la rama feature1.
     >>>>>>> feature1
     ```
   - Decide cómo combinar los cambios. Por ejemplo:  
     ```
     Actualizando desde la rama principal y trabajando en la rama feature1.
     ```
   - Guarda el archivo y finaliza la resolución del conflicto:  
     ```bash
     git add README.md
     git commit -m "Resuelto conflicto entre main y feature1"
     ```

3. **Sube los cambios a GitHub:**  
   - Envía la rama principal con los cambios resueltos:  
     ```bash
     git push origin main
     ```

---

### **Conclusión y cierre:**  
- Revisa el historial de commits con:  
  ```bash
  git log --oneline
  ```
