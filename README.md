# foro-hub
Forohub challenge from Oracle Next Education
Project consist on an API REST to create topics to web forum.

# 📚 ForoHub API

ForoHub es una **API REST desarrollada con Java y Spring Boot** que permite gestionar los tópicos de un foro.  
La aplicación implementa operaciones **CRUD** para crear, consultar, actualizar y eliminar tópicos.

Este proyecto fue desarrollado como práctica para aprender el desarrollo de **APIs REST con Spring Boot**, aplicando buenas prácticas como el uso de **DTOs, validaciones y paginación**.

---

# 🚀 Tecnologías utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Jakarta Validation
- Maven
- Base de datos relacional (PostgreSQL / H2)

---

### Controller

Contiene los endpoints de la API que reciben las solicitudes HTTP y devuelven respuestas.

Ejemplo:

`TopicoController`

### Domain

Contiene la lógica del dominio:

- Entidades
- Repositorios
- DTOs (Data Transfer Objects)

---

# 📌 Endpoints de la API

La API tiene como ruta base:
/topicos


---

# 🔹 Crear un tópico

**POST**


Crea un nuevo tópico en el foro.

### Request Body

```json
{
  "titulo": "Duda sobre Spring Boot",
  "mensaje": "¿Cómo funciona ResponseEntity?",
  "autor": "Raul",
  "curso": "Spring Boot"
}

```
Respuesta: 201 Created

# 🔹 Listar todos los topicos

Get /topicos
Respuesta: 200 OK

# 🔹 Detallar un topico:

Put /topicos/{id}
Respuesta:
```json
{
  "titulo": "Nuevo titulo",
  "mensaje": "Mensaje actualizado"
}
```

# 🔹Eliminar un topico

Delete /topicos/{id}

Respuestas: 
204 No Content
404 Not Found


