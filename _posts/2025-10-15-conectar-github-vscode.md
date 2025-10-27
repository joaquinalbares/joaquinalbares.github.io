---
title: "CONECTAR GITHUB CON VS CODE"
date: 2025-10-15T01:00:00-04:00
categories:
  - UT01
tags:
  - TRABAJO
---
Haz unos apuntes con pantallazos que documente los siguientes pasos a seguir para conectar VSCODE con GITHUB:

### 1. COMPROBAR ESTADO DE GIT.

Ejecutamos ```git config --global --list``` y nos debe mostrar al menos estos dos valores:

```bash
user.name=Joaquin R
user.email=48088064+joaquinalbares@users.noreply.github.com
```

En caso contrario, debemos ejecutar los siguientes comandos

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu.email@example.com"
```

### 2. CONECTAR VSCODE A TU CUENTA DE GITHUB.

En el icono de abajo a la izquierda debemos hacer clic en el icono del usuario y hacer clic en "Sign In" y seguir los pasos.

### 3. CLONAR EL REPOSITORIO
Abrimos la paleta de comandos y escribimos "Clone" y clonamos nuestro reposotorio en la carpqeta que queramos
