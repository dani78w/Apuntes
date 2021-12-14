USE hollywood;
 
DROP TABLE IF EXISTS ACTUAN;
DROP TABLE IF EXISTS CASADOS;
DROP TABLE IF EXISTS PELICULAS;
DROP TABLE IF EXISTS DIRECTORES;
DROP TABLE IF EXISTS ACTORES;
 
CREATE TABLE PELICULAS(
  nombre VARCHAR(50) PRIMARY KEY,
  ano YEAR NOT NULL,
  nacion VARCHAR(25) NOT NULL,
  calif FLOAT(1) NOT NULL,
  nom_prot VARCHAR(50) NOT NULL,
  nom_dir VARCHAR(50) NOT NULL);
CREATE TABLE ACTORES(
  nombre VARCHAR(50) PRIMARY KEY,
  sexo VARCHAR(1) CHECK(sexo='F' OR sexo='M') NOT NULL,
  fecha_nac DATE NOT NULL,
  nacion VARCHAR(25) NOT NULL);
create table directores(
  nombre VARCHAR(50) PRIMARY KEY,
  sexo VARCHAR(1) CHECK(sexo='F' OR sexo='M') NOT NULL,
  fecha_nac DATE NOT NULL,
  nacion VARCHAR(25) NOT NULL);
create table casados(
  nom1 VARCHAR(50) NOT NULL,
  nom2 VARCHAR(50) NOT NULL,
  PRIMARY KEY (nom1));
create table actuan(
  nom_actor VARCHAR(50) NOT NULL,
  nom_peli VARCHAR(50) NOT NULL,
  PRIMARY KEY(nom_actor, nom_peli));
 
 
ALTER TABLE ACTUAN ADD FOREIGN KEY (nom_actor) REFERENCES ACTORES(nombre);
ALTER TABLE ACTUAN ADD FOREIGN KEY (nom_peli) REFERENCES PELICULAS(nombre);
ALTER TABLE PELICULAS ADD FOREIGN KEY (nom_prot) REFERENCES ACTORES(nombre);
ALTER TABLE PELICULAS ADD FOREIGN KEY (nom_dir) REFERENCES DIRECTORES(nombre);
ALTER TABLE CASADOS ADD FOREIGN KEY (nom1) REFERENCES ACTORES(nombre);
ALTER TABLE CASADOS ADD FOREIGN KEY (nom2) REFERENCES ACTORES(nombre);

INSERT into ACTORES VALUES 
('Harrison Ford','M','1942-03-01','USA'),
('Tom Crusie','M','1942-03-07','USA'),
('Tony Curtis','M','1942-03-01','USA'),
('Penelope Cruz','F','1942-03-07','Spain'),
('Leonardo DiCaprio','M','1942-03-01','USA'),
('Ursula Corbrero','F','1942-03-01','Spain'),
('Benicio del Toro','M','1942-03-01','USA'),
('Tom Holland','M','1942-03-01','USA'),
('Dani Rovira','M','1942-03-01','Spain'),
('Angelina Jolie','F','1942-03-01','USA');

