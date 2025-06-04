# Sistema de Gestión de Cursos y Alumnos 📚

Este proyecto es una **aplicación web** desarrollada con **Spring Boot** para gestionar **Alumnos** y **Cursos** en una institución educativa. El sistema permite realizar operaciones **CRUD** (Crear, Leer, Actualizar, Eliminar) sobre **Alumnos** y **Cursos**, además de contar con funcionalidades para la **auditoría** de las acciones realizadas y la **exportación de datos** en formatos **PDF** y **Excel**.

---

## 🛠️ Funcionalidades

- **Gestión de Cursos**: 
    - Crear, editar, eliminar y listar cursos.
    - Visualización de cursos con sus respectivos detalles (ID, Nombre, Créditos).
  
- **Gestión de Alumnos**:
    - Crear, editar, eliminar y listar alumnos.
    - Visualización de alumnos con sus respectivos detalles (ID, Nombre, Email).

- **Auditoría**:
    - Registro de las acciones realizadas sobre los cursos y alumnos (Crear, Editar, Eliminar).
    - Las acciones son guardadas y pueden ser consultadas para tener un seguimiento.

- **Exportación de Datos**:
    - Exportación de los datos de **Alumnos** y **Cursos** a **PDF** y **Excel**.
    - Las vistas de los datos están preparadas para generar reportes bien estructurados.

- **Interfaz de Usuario**:
    - **Thymeleaf** para la integración entre el backend y las vistas.
    - **Bootstrap** para un diseño responsivo, atractivo y fácil de usar.

---

## 🚀 Tecnologías Utilizadas

- **Spring Boot**: Framework principal para el desarrollo de la aplicación.
- **Spring Data JPA**: Para la gestión y acceso a la base de datos.
- **Thymeleaf**: Motor de plantillas para la creación de vistas dinámicas.
- **Bootstrap**: Framework CSS para la creación de interfaces modernas y responsivas.
- **Apache POI**: Librería utilizada para la creación de archivos **Excel**.
- **iText**: Librería utilizada para la generación de archivos **PDF**.

---

## 🛠️ Instalación y Ejecución

### 1. Clonar el Repositorio

Primero, clona el repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/nombre-del-repositorio.git
2. Navegar al Proyecto
Accede al directorio del proyecto clonado:
cd nombre-del-repositorio
3. Compilación del Proyecto
Usa Maven para compilar el proyecto:
mvn clean install
4. Ejecutar la Aplicación
Ejecuta la aplicación con el siguiente comando:
mvn spring-boot:run
La aplicación estará disponible en http://localhost:8086.

🔧 Endpoints Principales
Endpoint	Descripción
/listarAlumnos	Muestra la lista de Alumnos en la base de datos.
/formAlumno	Muestra el formulario para crear o editar un Alumno.
/eliminarAlumno/{id}	Elimina un Alumno por su ID.
/listarCursos	Muestra la lista de Cursos en la base de datos.
/form	Muestra el formulario para crear o editar un Curso.
/eliminar/{id}	Elimina un Curso por su ID.
/verAlumnos(format=pdf)	Exporta la lista de Alumnos en formato PDF.
/verAlumnos(format=xlsx)	Exporta la lista de Alumnos en formato Excel.

🎨 Interfaz de Usuario
La interfaz está construida utilizando Bootstrap para un diseño moderno, limpio y fácil de navegar. Los formularios para crear, editar y eliminar Alumnos y Cursos están bien estructurados y cuentan con validaciones de entrada para asegurar la integridad de los datos.

Botones de Exportación
En la página de Listado de Alumnos y Listado de Cursos, los botones para exportar a PDF y exportar a Excel están disponibles en la parte superior de la tabla de datos, permitiendo exportar fácilmente la información a estos formatos para su análisis o almacenamiento.

📄 Contribución
¡Tu ayuda es bienvenida! Si deseas contribuir a este proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza los cambios necesarios y haz commit de tus cambios (git commit -am 'Agregada nueva funcionalidad').
Sube tus cambios a tu repositorio fork (git push origin feature/nueva-funcionalidad).
Abre un Pull Request para que podamos revisar tus cambios.
