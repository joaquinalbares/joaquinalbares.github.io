---
title: "USO DE GITHUB PAGES Y MKDOCS"
date: 2026-01-11T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - evaluación
---
## RESUMEN DE LA PRÁCTICA A REALIZAR
- Crea tu web personal en Github mediante la herramienta GitHub Pages y MKDocs.



## PASO 1 - CREACIÓN DE LA WEB PESONAL CON GITHUB PAGES
Para ello podeis seguir la [guía de inicio rápido](https://docs.github.com/es/pages/quickstart) disponible en la web de GitHub.

## PASO 2 - Instalación MkDocs
MkDocs requiere una versión reciente de Python y el paquete Python Gerente, pip, para ser instalado en su sistema.

Puede comprobar si ya tiene estos instalados desde la línea de comandos:

```bash
python3 --version
Python 3.12.2
```


### Instalación de pipx
 Se recomienda encarecidamente para instalar aplicaciones, es decir, cuando utilizará principalmente el código instalado de la línea de comandos. En los sistemas Debian y los sistemas basados en Debian como Ubuntu, puede instalar pipx usando apt:

```bash
apt install pipx
```

Instalar el paquete mkdocs usando pip:

```bash
pipx install mkdocs
```

Ahora deberías tener el mkdocsComando instalado en el sistema.
Ejecuta `mkdocs --version`para comprobar que todo funcionaba bien.

## Creando un nuevo proyecto
Para crear un nuevo proyecto, ejecute el siguiente comando desde la línea de comandos:

```bash
mkdocs new my-project
cd my-project
ls -la
```

Aqui apercerán los archivos creados.

MkDocs viene con un servidor de dev incorporado que le permite obtener una vista previa de su documentación mientras trabaja en ella. Asegúrese de estar en el mismo directorio que el archivo de configuración mkdocs.yml, y luego inicie el servidor ejecutando el comando mkdocs serve:

```bash
mkdocs serve
```bash

Abrimos http://127.0.0.1:8000/ en el navegador y vemos la página de inicio predeterminada que se muestra.
