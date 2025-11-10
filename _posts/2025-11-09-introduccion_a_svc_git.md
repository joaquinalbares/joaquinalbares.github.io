---
title: "UT05 - CONTROL DE VERSIONES"
date: 2025-11-09T00:01:30-01:00
categories:
  - UT05
tags:
  - git
  - practicas
---


# INTRODUCCIÓN
A la hora de abordar un proyecto, una de las tareas que más trabajo nos lleva es el control de las modificaciones y mejoras realizadas a nuestro código.

Esto se hace especialmente complicado si nuestro proyecto contiene mucho código y se va a ir desarrollando en un espacio de tiempo más largo de una tarde, claro.

Existen en el mercado una serie de herramientas de control de versiones, herramientas para documentar los programas y herramientas de refactorización que nos van a ayudar mucho en nuestro quehacer como programador si aprendemos a manejarlas con soltura.

El uso de este tipo de herramientas nos garantizan por un lado que los proyectos mantengan una trazabilidad de todos los cambios sufridos, y quién o quienes han realizado los cambios, dos aspectos de vital importancia cuando se trabaja en equipos de software.

Además, el uso de este tipo de herramientas garantiza que nuestros proyectos estén correctamente documentados, y que ofrezcan información útil de lo que hace cada una de las clases y métodos que los forman, y bien refactorizados simplificando el código de los programas y favoreciendo su lectura, entendimiento y fácil mantenimiento.

Todas estas cuestiones son muy importantes si queremos llegar a ser unos buenos programadores.


# CONTROL DE VERSIONES
Según encontramos en la [Wikipedia...](https://es.wikipedia.org/wiki/Control_de_versiones)

> "Se llama control de versiones a la gestión de los diversos cambios que se realizan sobre los elementos de algún producto o una configuración del mismo. Una versión, revisión o edición de un producto, es el estado en el que se encuentra el mismo en un momento dado de su desarrollo o modificación."

De una manera sencilla es como un diario donde se guardan las modificaciones que hacemos a nuestro código, y que es es de mucha utilidad cuando queremos recuperar un documento, o una carpeta, o un proyecto en un momento concreto de su desarrollo.

También es muy útil cuando se necesita mantener un cierto control de los cambios que se realizan sobre documentos, archivos o proyectos que comparten varias personas o un equipo de trabajo, se hace necesario saber qué cambios se hacen, quien los hace y cuando se realizan.

**TERMINOLOGIA**

Antes de entrar en la instalación y manejo de herramientas de control de versiones veamos los términos que se utilizan y son comunes para la mayoría de estas herramientas:

* **Repositorio**. Lugar donde se almacenan todos los datos y los cambios. Puede ser un sistema de archivos en un disco duro, un servidor, etc.
* **Revisión o versión**. Una revisión es una versión concreta de los datos almacenados.
Algunos sistemas identifican las revisiones con un numero contador (como Subversion).
Otros identifican las revisiones mediante un código de detección de modificaciones (en Git usa SHA1). La ultima versión se la identifica como la cabeza o HEAD.
* **Etiquetar o Rotular (tag)**. Cuando se crea una versión concreta en un momento determinado del desarrollo de un proyecto se le pone una etiqueta, de forma que se pueda localizar y recuperar en cualquier momento. Las etiquetas permiten identificar de forma fácil revisiones importantes en el proyecto (por ejemplo una versión publicada). En algunos sistemas se considera una etiqueta cuando se crea una rama en la que los ficheros no evolucionan, es decir se congela.
* **Tronco (trunk)**, es el tronco o la linea principal de desarrollo de un proyecto.
* **Rama o ramificar (branch)**. Las ramas son copias de archivos, carpetas 0 proyectos.
Cuando se crea una rama se crea una bifurcación del proyecto y se crean dos lineas de desarrollo. Son motivos habituales de creación de ramas la creación de nuevas funcionalidades o la corrección de errores.
* **Desplegar (Checkout)**. Crear una copia de trabajo del proyecto, o de archivos y carpetas del repositorio en el equipo local. Por defecto se obtiene la ultima versión, aunque también se puede indicar una versión concreta. Con el checkout se vincula la carpeta de trabajo del equipo local con el repositorio, y se crean los metadatos de control de versiones (carpetas y archivos ocultos que se crean de tipo .svn).
* **Confirmar (commit o check-in)**. Se realiza commit cuando se confirman los cambios realizados en local para integrarlos al repositorio.
* **Exportación (export)**. Similar a Checkout, pero en esta ocasión no vincula la copia con el repositorio. Es una copia limpia sin los metadatos de control de versiones.
* **Importación (import)**. Es la subida de carpetas y archivos del equipo local al repositorio.
Se puede hacer en cualquier momento desde el sistema de archivos.
* **Actualizar (update)**. Se realiza una actualización cuando se desea integrar los cambios realizados en el repositorio en la copia de trabajo local. Los cambios pueden ser realizados por personas del equipo de trabajo.
* **Fusion (merge)**. Una fusión consiste en unir los cambios realizados sobre uno o varios archivos en una única revisión. Se suele realizar cuando hay varias lineas de desarrollo Separadas en ramas y en alguna etapa se necesitan fusionar los cambios hechos entre ramas 0 en una rama con el tronco principal, o viceversa.
* **Conflicto**. Ocurre cuando dos usuarios crean una copia local (Checkout) de la misma versión de un archivo, uno de ellos realiza cambios y envía los cambios (commit) al repositorio, y el otro no actualiza (update) esos cambios y realiza cambios sobre el archivo e intenta enviar luego sus cambios al repositorio. Entonces se produce el conflicto y el sistema no es capaz de fusionar los cambios. Este usuario deberá resolver el conflicto combinando los cambios o eligiendo uno de ellos.
* **Resolver conflicto**.
La actuación del usuario para atender un conflicto entre diferentes cambios al mismo documento.
Para trabajar en proyectos utilizando un sistema de control de versiones, lo primero que hay que hacer es crearse una copia en local de la información del repositorio con checkout, de esta manera se vincula la copia con el repositorio, a continuación el usuario realizara sus modificaciones y una vez finalizadas sube las modificaciones al repositorio con commit. Si la copia del usuario ya esta vinculada al repositorio, antes de modificar y realizar cambios tiene que hacer Update, para asegurarse que los cambios se realizan sobre la versión última del repositorio.


## 2.1. Subversion. Ciclo de vida de subversion.
En el mercado existen dos vías de trabajo para el control de versiones: [Subversion](http://subversion.apache.org) y [Git](https://git-scm.com/). Podemos decantarnos por una u otra dependiendo de nuestras necesidades.


Subversion es una herramienta multiplataforma (Win32, Linux, Mac, etc.) de código abierto para el control de versiones. Usa una base de datos central, el repositorio, que contiene los archivos cuyas versiones y respectivas historias se controlan. El repositorio actúa como un servidor de ficheros, con la capacidad de recordar todos los cambios que se hacen tanto en sus directorios como en sus ficheros.

Cuando un proyecto de software es desarrollado por un equipo de personas es indispensable llevar un control bajo un método de trabajo, seguir unas normas y aplicar las buenas prácticas en el uso de las herramientas. Así, el proyecto debe verse como un árbol que tiene su tronco (*trunk*) donde esta la linea principal de su desarrollo; que tiene sus ramas (*branches*) en la que se añadirán nuevas funciones o se corregirán errores; y que ademas tiene sus etiquetas (*tags*) para marcar situaciones importantes, o versiones finalizadas.

Con esta filosofía de trabajo en la cabeza, la estructura de carpetas recomendada en la creación de proyectos utilizando estas herramientas y la funcionalidad que se le debe dar a cada carpeta dentro del repositorio son las siguientes:

* **Trunk (tronco):** base común para guardar las carpetas del proyecto o trabajo a controlar.
Es donde esta la versión básica, es decir, la rama de desarrollo principal.
* **Tags (etiquetas):** una etiqueta es una copia del proyecto, de una carpeta o de un archivo que se hace con el objetivo de obtener una versión que no se va a modificar. Deben ser copias del tronco (trunk). Util para crear versiones ya finalizadas, aquí se guardaran las versiones cerradas de los proyectos.
* **Branches (ramas):** en las ramas se desarrollan versiones que luego se van a publicar. Es una copia del trunk, de un proyecto, de una carpeta o de un archivo con la intención de modificar sobre ella, para conseguir un producto final diferente y alternativo al original. Es la ramificación del código, es decir, modificaciones de versiones cerradas.

## GIT
Git es un sistema de control de versiones distribuido, utilizado principalmente en el desarrollo de software para rastrear los cambios realizados en el código fuente. Fue creado por Linus Torvalds en 2005 para el desarrollo del kernel de Linux. Con Git, los desarrolladores pueden colaborar en proyectos de manera más eficiente y segura.

Comandos básicos de Git:

- `git init`: Inicializa un repositorio vacío de Git en el directorio actual.

- `git add`: Agrega archivos al área de preparación (staging) para ser confirmados.

- `git commit`: Confirma los cambios agregados al área de preparación, creando una nueva versión en el historial de cambios.

- `git status`: Muestra el estado actual del repositorio, incluyendo los cambios pendientes y los archivos no rastreados.

- `git log`: Muestra el historial de cambios del repositorio, incluyendo los commits realizados y sus mensajes.

- `git branch`: Crea una nueva rama en el repositorio para trabajar en paralelo con la rama principal (master).

- `git checkout`: Cambia entre ramas o versiones del repositorio.

- `git merge`: Combina los cambios realizados en una rama con la rama principal.

- `git clone`: Crea una copia del repositorio en otro lugar, como un servidor remoto o una computadora local.

Ejemplo de uso de Git:

Supongamos que estamos trabajando en un proyecto de desarrollo de software con un equipo de programadores. Para utilizar Git en este proyecto, debemos seguir los siguientes pasos:

- Crear un repositorio: Utilizamos el comando `git init` en el directorio raíz del proyecto para crear un repositorio vacío de Git.

- Agregar archivos: Utilizamos el comando `git add` para agregar los archivos modificados o nuevos al área de preparación.

- Confirmar cambios: Utilizamos el comando `git commit` para confirmar los cambios agregados al área de preparación y crear una nueva versión en el historial de cambios.

- Trabajar en ramas: Utilizamos el comando `git branch` para crear una nueva rama del proyecto y trabajar en ella en paralelo con la rama principal. Por ejemplo, podemos crear una rama llamada "nueva-caracteristica" para agregar una nueva funcionalidad al software.

- Cambiar de rama: Utilizamos el comando `git checkout` para cambiar entre las diferentes ramas del proyecto. Por ejemplo, podemos cambiar a la rama "nueva-caracteristica" para trabajar en la nueva funcionalidad.

- Combinar cambios: Utilizamos el comando `git merge` para combinar los cambios realizados en una rama con la rama principal. Por ejemplo, podemos combinar los cambios realizados en la rama "nueva-caracteristica" con la rama principal "master" para agregar la nueva funcionalidad al software.

- Compartir cambios: Utilizamos el comando `git clone` para crear una copia del repositorio en otro lugar, como un servidor remoto o una computadora local. Por ejemplo, podemos crear una copia del repositorio en un servidor de producción para implementar los cambios realizados.

### PRIMEROS PASOS CON GIT
Empezaremos suponiendo que Git ya se encuentra instalado dentro de nuestro computadora, que lo hemos descargado de la página oficial de Git, después de eso tenemos que configurar nuestro Git con dos comandos:

```bash
$ git config --global user.name "Mi Nombre"`
$ git config --global user.email micorreo@example.com
```

Ahora podemos confirmar que hemos configurado correctamente git usando el comando:
```bash
$ git config --global --list`
```


Una vez configurado, Lo primero que debemos hacer para iniciar a trabajar con git es identificar que proyecto queremos versionar, una vez hemos realizado esto deberemos de ejecutar el comando:

`$ git init`

este comando nos servirá para iniciar un repositorio, si nosotros lo dejamos así con un espacio en blanco lo que hará es crear la carpeta .git(Es una carpeta oculta por lo cual debemos de seleccionar la opción de mostrar carpetas ocultas) dentro de nuestro proyecto seleccionado.

Para verificar que se han hecho modificaciones en nuestro proyecto podemos ejecutar el comando:

`$ git status`

Este comando nos sirve para ver que archivos se encuentran dentro del working directory que es uno de los 3 estados de git, si un archivo esta siendo traqueado nos aparecerá en letras verdes, mientras que si no, nos dirá en letras rojas, además de que arriba de las letras de colores nos aparecerá una descripción de si el archivo es tracked o untracked

### GESTIÓN DE RAMAS CON GIT
**Creación y Gestión de Ramas con Git**

**1. Introducción a las Ramas en Git:**
   - Las ramas en Git son líneas de desarrollo independientes que permiten trabajar en diferentes características, correcciones de errores o experimentos de forma aislada.
   - La rama principal es comúnmente conocida como `master` o `main`, aunque este nombre puede variar según las convenciones de nombres del proyecto.

**2. Creación de Ramas:**
   - Para crear una nueva rama, se utiliza el comando `git branch <nombre-de-la-rama>`.
   - Por ejemplo, para crear una rama llamada "nueva-funcionalidad": `git branch nueva-funcionalidad`.

**3. Cambio entre Ramas:**
   - Para cambiar a una rama diferente, se utiliza el comando `git checkout <nombre-de-la-rama>`.
   - Por ejemplo, para cambiar a la rama "nueva-funcionalidad": `git checkout nueva-funcionalidad`.

**4. Creación y Cambio de Ramas en un Solo Paso:**
   - Git permite crear y cambiar a una nueva rama en un solo paso utilizando el comando `git checkout -b <nombre-de-la-rama>`.
   - Por ejemplo, para crear y cambiar a una rama llamada "correccion-bug": `git checkout -b correccion-bug`.

**5. Visualización de Ramas:**
   - Para ver todas las ramas en el repositorio y resaltar la rama actual, se utiliza el comando `git branch`.
   - Para ver las ramas junto con los últimos commits en cada una, se puede usar `git branch -v`.

**6. Eliminación de Ramas:**
   - Para eliminar una rama después de que su trabajo se haya fusionado con éxito en otra rama, se utiliza el comando `git branch -d <nombre-de-la-rama>`.
   - Si se necesita forzar la eliminación de una rama que aún no se ha fusionado completamente, se usa `git branch -D <nombre-de-la-rama>`.

**7. Fusión de Ramas:**
   - Para fusionar una rama con la rama actual, primero se cambia a la rama destino y luego se utiliza el comando `git merge <nombre-de-la-rama-a-fusionar>`.
   - Por ejemplo, para fusionar la rama "nueva-funcionalidad" en la rama actual: `git merge nueva-funcionalidad`.

**8. Resolución de Conflictos de Fusión:**
   - En caso de conflictos durante la fusión, Git indicará los archivos conflictivos. Se debe editar manualmente estos archivos para resolver los conflictos, luego agregar los cambios y realizar un commit para completar la fusión.

**9. Buenas Prácticas:**
   - Es recomendable crear ramas específicas para cada tarea o característica.
   - Mantener las ramas actualizadas con la rama principal (o la rama de desarrollo) para evitar conflictos mayores durante la fusión.
   - Nombrar las ramas de manera descriptiva según su propósito para facilitar la comprensión y el seguimiento del trabajo realizado.


Estos apuntes proporcionan una visión general sobre la creación y gestión de ramas en Git, pero es importante profundizar en cada tema y practicar regularmente para dominar completamente estas habilidades.

¿Qué sucede cuando creas una nueva rama? Bueno…​, simplemente se crea un nuevo apuntador para que lo puedas mover libremente. Por ejemplo, supongamos que quieres crear una rama nueva denominada "testing". Para ello, usarás el comando git branch:

$ git branch testing

