CREATE TABLE usuarios (
   idUsuario int  NOT NULL,
   saldo int not null,
   correo varchar(30) not null,
   tipoId varchar (20) not null,
   fechaNacimiento date not null,
   CONSTRAINT usuarios_pk PRIMARY KEY (idUsuario)
);


CREATE TABLE apuestas (
   idApuesta int  NOT NULL,
   idUsuario int not null,
   idAdmin int  NOT NULL,
   fecha date not null,
   marcadorA int not null,
   marcadorB int not null,
   ganancia int not null,
   valorApostado int not null,
   estado boolean not null,
   idPartido int not null,
   CONSTRAINT apuestas_pk PRIMARY KEY (idApuesta)
);


CREATE TABLE administradores (
   idAdmin int  NOT NULL,
   nombre varchar(50) not null,
   correo varchar(50) not null,
   cedula varchar(2) not null,
   CONSTRAINT administradores_pk PRIMARY KEY (idAdmin)
);

drop table administradores ;


CREATE TABLE partidos (
   idPartido int  NOT NULL,
   marcadorA int not null,
   marcadorB int not null,
   fecha date not null,
   estado boolean not null,
   nombreDeporte varchar(80) not null,
   tipoEncuentro varchar(50) not null,
   idEquipo int  NOT NULL,
   idDeporte int  NOT NULL,
   idDatos int  NOT NULL,
   CONSTRAINT partidos_pk PRIMARY KEY (idPartido)
);

CREATE TABLE equipos (
   idEquipo int  NOT NULL,
   nombre varchar(50) not null,
   equipoLocal boolean not null,
   CONSTRAINT equipos_pk PRIMARY KEY (idEquipo)
);

CREATE TABLE deportes (
   idDeporte int  NOT NULL,
   nombre varchar(50) not null,
   tipo varchar(50) not null,
   CONSTRAINT deportes_pk PRIMARY KEY (idDeporte)
);

CREATE TABLE datos (
   idDatos int  NOT NULL,
   ganador1T varchar(50) not null,
   ganador2T varchar(50) not null,
   numeroAmarillas int not null,
   marcador int not null,
   numeroFaltas int not null,
   CONSTRAINT datos_pk PRIMARY KEY (idDatos)
);


alter table apuestas add constraint apuestas_usuarios
	foreign key (idUsuario)
	references usuarios (idUsuario)
;

alter table apuestas add constraint apuestas_partidos
	foreign key (idPartido)
	references partidos (idPartido)
;

alter table apuestas add constraint apuestas_administradores
	foreign key (idAdmin)
	references administradores (idAdmin)
;

alter table partidos add constraint partidos_equipos
	foreign key (idEquipo)
	references equipos (idEquipo)
;


alter table partidos add constraint partidos_deportes
	foreign key (idDeporte)
	references deportes (idDeporte)
;

alter table partidos add constraint partidos_datos
	foreign key (idDatos)
	references datos (idDatos)
;


alter table apuestas drop constraint apuestas_administradores;

