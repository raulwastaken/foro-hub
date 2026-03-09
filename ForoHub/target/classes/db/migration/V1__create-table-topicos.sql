CREATE TABLE topicos (
    id bigint not null auto_increment,
    titulo  varchar(100) not null unique,
    mensaje varchar(200) not null unique,
    fecha_de_creacion datetime not null,
    status varchar(20) not null,
    autor varchar(20) not null,
    curso varchar(20),

    primary key(id)
)
