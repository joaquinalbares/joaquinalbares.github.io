---
title: "CONFIGURACIÓN DE VISUAL STUDIO CODE"
date: 2024-10-30T09:34:30-04:00
categories:
  - UT05
tags:
  - vscode
  - ubuntu
---

## **Ejecutar Visual Studio Code desde la Línea de Comandos**


Para ejecutar VS Code desde la terminal usando el comando `code`, asegúrate de que el sistema lo tenga en su [variable de entorno](https://www.genbeta.com/desarrollo/variables-entorno-que-sirven-como-podemos-editarlas-windows-linux) `PATH`.

#### **a) En Windows**

1. **Abrir la Paleta de Comandos en VS Code**:
   - Abre Visual Studio Code.
   - Pulsa `Ctrl + Shift + P` para abrir la Paleta de Comandos.
2. **Ejecutar el Comando para Añadir `code` al `PATH`**:
   - En la Paleta de Comandos, escribe `"shell command"` y selecciona la opción **"Shell Command: Install 'code' command in PATH"**.
   - Esto configurará automáticamente el comando `code` en el `PATH` de Windows.

3. **Reiniciar la Terminal**:
   - Cierra y abre una nueva terminal o ventana de símbolo del sistema (cmd o PowerShell).
   - Ahora deberías poder ejecutar `code` desde la línea de comandos.

#### **b) En macOS**

1. **Abrir la Paleta de Comandos en VS Code**:
   - Abre Visual Studio Code.
   - Pulsa `Cmd + Shift + P` para abrir la Paleta de Comandos.

2. **Ejecutar el Comando para Añadir `code` al `PATH`**:
   - En la Paleta de Comandos, escribe `"shell command"` y selecciona la opción **"Shell Command: Install 'code' command in PATH"**.
   - Esto configurará automáticamente el comando `code` en tu entorno `PATH`.

3. **Verificar la Configuración**:
   - Abre una nueva terminal y ejecuta el siguiente comando para confirmar:
     ```bash
     code --version
     ```

#### **c) En Linux**

En la mayoría de las distribuciones de Linux, puedes configurar `code` en el `PATH` de la siguiente manera:

1. **Verificar si `code` ya está en el `PATH`**:
   - En una terminal, ejecuta:
     ```bash
     code --version
     ```
   - Si `code` no es reconocido, continúa con los siguientes pasos.

2. **Añadir Manualmente `code` al `PATH`**:
   - Normalmente, el archivo ejecutable de VS Code se encuentra en `/usr/share/code/bin/code`.
   - Para añadirlo al `PATH`, abre tu archivo de configuración de shell (`~/.bashrc` o `~/.zshrc` dependiendo del shell que uses) y añade la siguiente línea:
     ```bash
     export PATH="$PATH:/usr/share/code/bin"
     ```
   - Guarda el archivo y recarga el perfil:
     ```bash
     source ~/.bashrc
     # o, si usas zsh
     source ~/.zshrc
     ```

---

### **3. Usar el Comando `code` para Abrir Visual Studio Code**

Una vez que has configurado el comando, puedes abrir VS Code directamente desde la terminal con varios usos prácticos:

- **Abrir una carpeta o proyecto**:
  ```bash
  code /ruta/a/tu/proyecto
  ```

- **Abrir un archivo específico**:
  ```bash
  code archivo.txt
  ```

- **Abrir VS Code en la carpeta actual**:
  ```bash
  code .
  ```

- **Abrir VS Code en modo sin ventanas** (sin abrir ninguna carpeta o archivo):
  ```bash
  code --new-window
  ```

- **Abrir un archivo específico en una nueva ventana**:
  ```bash
  code -n archivo.txt
  ```

### **4. Comprobación Final**

Ejecuta `code --version` desde la terminal para verificar que el comando está funcionando correctamente y muestra la versión instalada de VS Code.

---

### **Resumen de Comandos**

- `code` — Abre Visual Studio Code.
- `code .` — Abre la carpeta actual en VS Code.
- `code archivo.txt` — Abre un archivo específico.
- `code --new-window` — Abre una nueva ventana de VS Code.
- `code -n archivo.txt` — Abre un archivo en una nueva ventana.
