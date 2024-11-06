---
title: "CONFIGURACIÓN INICIAL GIT"
date: 2024-11-06T09:34:30-04:00
categories:
  - UT05
tags:
  - git
  - debian
---

## **Configuración Inicial de Git**

---

### **1. Verificar la Instalación de Git**

Antes de comenzar, asegúrate de que Git esté instalado correctamente:

```bash
git --version
```

Si ves la versión de Git en la salida, significa que está instalado. Si no, instala Git según el sistema operativo:

- **Windows**: [Descargar Git para Windows](https://git-scm.com/download/win)
- **Mac**: `brew install git` (si tienes Homebrew) o [Descargar Git para Mac](https://git-scm.com/download/mac)
- **Linux**: Instálalo usando el gestor de paquetes de tu distribución, por ejemplo, en Ubuntu:
  ```bash
  sudo apt update
  sudo apt install git
  ```

---

### **2. Configurar tu Nombre y Correo Electrónico**

Git utiliza tu nombre y correo electrónico en cada commit que hagas. Esta información ayuda a identificar quién realizó cada cambio en el historial de versiones.

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu.email@example.com"
```

> **Nota**: Usa las comillas para rodear tu nombre y correo electrónico.

Puedes verificar que se han guardado estos valores con:

```bash
git config --global user.name
git config --global user.email
```

---

### **3. Configurar el Editor de Texto Predeterminado**

Git necesita un editor de texto para editar mensajes de commit y resolver conflictos. Por defecto, suele utilizar Vim, pero puedes configurarlo para usar otro editor.

- **Configurar Visual Studio Code**:
  ```bash
  git config --global core.editor "code --wait"
  ```
- **Configurar Nano**:
  ```bash
  git config --global core.editor "nano"
  ```
- **Configurar Vim**:
  ```bash
  git config --global core.editor "vim"
  ```

### **4. Configurar Alias para Comandos Comunes**

Los alias te permiten usar atajos para comandos de Git que usas frecuentemente. Por ejemplo:

- **Alias para `status`**:
  ```bash
  git config --global alias.st status
  ```
- **Alias para `log` con formato bonito**:
  ```bash
  git config --global alias.lg "log --oneline --graph --all"
  ```
- **Alias para `checkout`**:
  ```bash
  git config --global alias.co checkout
  ```

Usa estos alias escribiendo `git st`, `git lg`, y `git co` respectivamente.

### **5. Configurar Línea de Comandos en Color**

Para facilitar la lectura de los mensajes en la terminal, puedes habilitar el color en la salida de Git:

```bash
git config --global color.ui auto
```

---

### **6. Verificar la Configuración**

Puedes ver todas las configuraciones que has hecho con el siguiente comando:

```bash
git config --list
```

Esto mostrará todos los parámetros configurados globalmente en Git.

---

### **Resumen de Comandos Usados**

- `git config --global user.name "Tu Nombre"`
- `git config --global user.email "tu.email@example.com"`
- `git config --global core.editor "nombre_del_editor"`
- `git config --global alias.[alias] [comando]`
- `git config --global credential.helper cache`
- `git config --global color.ui auto`
- `git config --list`