---
title: "UT05 - P04 - USO DE GITHUB PAGES Y MKDOCS"
date: 2026-01-11T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - evaluación
---
## RESUMEN DE LA PRÁCTICA A REALIZAR
- Vamos a crear una web personal en Github mediante la herramienta GitHub Pages y MKDocs.

### 1. Instalación MkDocs
MkDocs requiere una versión reciente de Python y el gestor de paquetes Python, pip/pipx, para ser instalado en su sistema.

Puede comprobar si ya tiene estos instalados desde la línea de comandos:

```bash
python3 --version
Python 3.12.2
```


### 2. Instalación de pip/pipx
Dependiendo de nuestro sistema operativo, podemos instalar pip o pipx. En sistemas basados en Debian como Ubuntu, podemos instalar pip usando apt:

```bash
apt install python3-pip
```

Adicionalmente,se recomienda encarecidamente instalar pipx para instalar aplicaciones en entornos protegidos y herramientas de línea de comandos . En los sistemas Debian y los sistemas basados en Debian como LinuxMint, podemos instalar pipx usando apt:

```bash
apt install pipx
```

Instalamos el paquete mkdocs usando pip:

```bash
pip install mkdocs
```

Ahora deberíamos tener el comando `mkdocs` instalado en el sistema.

Podemos ejecutar la orden `mkdocs --version`para comprobar que todo funcionaba bien. Si nos dice que no se puede ejecutar la orden, debemos escribir `pipx ensurepath` y recargar el terminal para que funcione correctamente.


### 3. Creando un nuevo proyecto

Para crear un nuevo proyecto, debemos crear la carpeta donde vamos a desarrollar la web, lo que podemos hacer desde la línea de comandos:

```bash
mkdocs new proyecto-mkdocs
cd proyecto-mkdocs
```

Dentro de la carpeta, creamos el proyecto:
```bash
mkdocs new .`
```

Verificamos que se crean los siguientes archivos:
  - `mkdocs.yml`
  - Carpeta `docs/` con `index.md`.


Podemos comprobar la instalación gracias a que MkDocs viene con un servidor incorporado que le permite obtener una vista de como quedará el proyecto antes de subirlo al repositorio. Debemos  estar en el mismo directorio que el archivo de configuración `mkdocs.yml`, y luego iniciamos el servidor ejecutando el comando mkdocs serve:

```bash
mkdocs serve
```

Abrimos [http://127.0.0.1:8000/](http://127.0.0.1:8000/) en el navegador y vemos la página de inicio predeterminada que se muestra.

### 4. Configurar MkDocs Material

- Editar `mkdocs.yml` y dejar al menos algo similar a:[][][]

```yaml
site_name: Proyecto de <Nombre Apellidos>
site_url: https://<tu_usuario>.github.io/proyecto-mkdocs/
theme:
  name: material

nav:
  - Inicio: index.md
```

### 5. Crear repositorio y subir a GitHub

Ahora debemos hacer los siguientes pasos en este orden:

  1. Crear un repositorio nuevo en GitHub, por ejemplo `proyecto-mkdocs`, no es necesario que se incluya el archivo `README.md`.
  
  2. Inicializar Git en la carpeta del proyecto:
    - `git init`
    - `git add .`
    - `git commit -m "Inicialización proyecto MkDocs"`
    - `git branch -M main`
    - `git remote add origin https://github.com/<tu_usuario>/proyecto-mkdocs.git`
    - `git push -u origin main`.

### 6. Desplegar en GitHub Pages

Para desplegar el sitio en GitHub Pages, debemos ejecutar:

```bash
mkdocs gh-deploy
```

Este comando construye el sitio, crea y/o actualiza la rama `gh-pages` y la sube a GitHub, todo de manera automática y sin nuestra intervención.

Por último, debemos comprobar en GitHub que todo se ha configurado correctamente, para ello, seguimos los siguientes pasos:

  - Vamos a Settings → Pages.
  - Comprobar que se ha seleccionado como fuente la rama `gh-pages` y la carpeta `/`.

![Configuración de github pages](/assets/images/UT05-P05-img01.png)

- La URL suele ser:
    - `https://<tu_usuario>.github.io/proyecto-mkdocs/`.


## ENINCIADO DE LA PRÁCTICA

Desaroollar una página web personal siguendo los pasos anteriores. Para una evaluación positiva de la práctica, se deben cumplir los siguientes **requisitos**:

- Contenido mínimo:
    - Página de inicio con presentación personal.
    - Página de formación y experiencia.
    - Página de proyectos (mínimo 3 proyectos con descripción breve).
    - Página de contacto (correo, redes, GitHub, etc.).

- Aspectos técnicos:
    - Uso del tema `material` configurado en `mkdocs.yml`.
    - Estructura de navegación definida en `mkdocs.yml` (menú superior).
    - Uso de al menos:
        - 1 lista numerada.
        - 1 lista con viñetas.
        - 1 tabla básica en Markdown.
        - 1 bloque de código (`````).

- Control de versiones:
    - Proyecto en un repositorio público de GitHub.
    - Al menos 3 commits significativos con mensajes claros.

- Despliegue:
    - Publicación en GitHub Pages usando `mkdocs gh-deploy` o usando `GitHub Action`.

Un ejemplo del resultado se pueder ver en [https://joaquinalbares.github.io/portfolio-mkdocs/](https://joaquinalbares.github.io/portfolio-mkdocs/).

### MATERIAL A ENTREGAR

El alumno creará una carpeta llamada `P04` dentro de la carpeta `UT05` del repositorio de prácticas del alumno.

En la carpeta se crearán los siguientes archivos:

- Archivo `README.MD` que contenga la siguiente información:

  - URL del repositorio GitHub creado por el alumno.
  - URL pública de GitHub Pages.
  - Problemas encontrados y mejoras realizadas.
  
- Una Captura de pantalla de cada uno de los pasos de la práctica.
