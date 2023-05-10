create database p81noeliap;
use p81noeliap;

DROP TABLE IF EXISTS factura;

CREATE TABLE factura (
  codigo varchar(45) not NULL,
  fechaEmision datetime not NULL,
  descripcion varchar(100),
  totalImporte decimal(6,2) not null
);