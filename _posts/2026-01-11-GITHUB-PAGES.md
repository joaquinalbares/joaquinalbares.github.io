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
 Se recomienda encarecidamente para instalar aplicaciones, es decir, cuando utilizará principalmente el código instalado de la línea de comandos. En los sistemas Debian y los sistemas basados en Debian como Ubuntu, puede instalar pipxUtilizar apt, y luego utilizar pipxPara instalar la aplicación:

```bash
apt install pipx
pipx install some-python-application
```

Instalar el paquete mkdocs usando pip:

```bash
pipx install mkdocs
```

Ahora deberías tener el mkdocsComando instalado en su sistema. ¡
Ejecuta `mkdocs --version`para comprobar que todo funcionaba bien.
