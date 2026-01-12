---
title: "USO DE GITHUB PAGES Y JEKYLL"
date: 2025-01-18T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - evaluación
---
## RESUMEN DE LA PRÁCTICA A REALIZAR
- Crea tu web personal en Github mediante la herramienta GitHub Pages.

Para ello podeis seguir la [guía de inicio rápido](https://docs.github.com/es/pages/quickstart) disponible en la web 
de GitHub.




MkDocs requiere una versión reciente de Python y el paquete Python Gerente, pip, para ser instalado en su sistema.

Puede comprobar si ya tiene estos instalados desde la línea de comandos:

$ python --version
Python 3.8.2
$ pip --version
pip 20.0.2 from /usr/local/lib/python3.8/site-packages/pip (python 3.8)

Si ya tiene estos paquetes instalados, puede pasar a Instalación Médicos.
Instalación de Python

Instale Python usando su gestor de paquetes de su elección, o descargando un Instalador apropiado para su sistema de python.org y ejecutándolo.

Nota

Si va a instalar Python en Windows, asegúrese de marcar la casilla para tener Python se agregó a su PATH si el instalador ofrece dicha opción (es Normalmente desactivado por defecto).

Añadir Python a PATH

Instalación de pip

 pipxSe recomienda encarecidamente para instalar aplicaciones, es decir, cuando utilizará principalmente el código instalado de la línea de comandos. En los sistemas Debian y los sistemas basados en Debian como Ubuntu, puede instalar pipxUtilizar apt, y luego utilizar pipxPara instalar la aplicación:

apt install pipx
pipx install some-python-application

Para las bibliotecas, es decir, cuando utilizará el código principalmente por `import` En sus propios proyectos. Por lo general, usted mismo debe crear un entorno virtual. Puedes hacer esto con `venv` De la biblioteca estándar:

python -m venv my-venv
my-venv/bin/pip install some-python-library


python get-pip.py

Instalación de MkDocs

Instalar el mkdocsPaquete usando pip:

pip install mkdocs

Ahora deberías tener el mkdocsComando instalado en su sistema. ¡Corre mkdocs
--versionPara comprobar que todo funcionaba bien.

$ mkdocs --version
mkdocs, version 1.2.0 from /usr/local/lib/python3.8/site-packages/mkdocs (Python 3.8)

Nota

Si desea que se instalen páginas de mán. para MkDocs, la herramienta click-man puede Generarlos e instalarlos para ti. Simplemente ejecute los siguientes dos comandos:

pip install click-man
click-man --target path/to/man/pages mkdocs

Consulte la documentación de click-man para obtener una explicación de por qué son las páginas de man No se genera automáticamente y se instala por pip.

Nota

Si está utilizando Windows, es posible que algunos de los comandos anteriores no funcionen Fuera de la caja.

Una solución rápida puede ser prefaciar todos los comandos de Python con python -mAsí:

python -m pip install mkdocs
python -m mkdocs

Para una solución más permanente, es posible que deba editar su PATHMedio ambiente Variable para incluir la ScriptsDirectorio de su instalación de Python. Las versiones recientes de Python incluyen un script para hacer esto por ti. Navegar hacia Su directorio de instalación de Python (por ejemplo C:\Python38\), abrir el Tools, entonces ScriptsCarpeta, y ejecutar el win_add2path.pyArchivo por doble Haciendo clic en él. Alternativamente, puede descargar el script y ejecutarlo (python win_add2path.py).



La web debe contener al menos dos páginas web con texto, imágenes y aplicar algún estilo CSS. 

#### 
Crear la web usando la herramienta Jekyll. Esta herramienta permite crear páginas usando plantillas y formato CSS.

Puedes usar los siguientes enlaces para que te sirvan de referencia:

Instalación de Jekyll en Ubuntu:
- [Pasos previos](https://jekyllrb.com/docs/installation/ubuntu/)

[https://nainagurung.medium.com/publish-github-pages-using-jekyll-369a8e2800b7](https://nainagurung.medium.com/publish-github-pages-using-jekyll-369a8e2800b7)

[https://docs.github.com/en/pages/setting-up-a-github-pages-site-with-jekyll](https://docs.github.com/en/pages/setting-up-a-github-pages-site-with-jekyll)

