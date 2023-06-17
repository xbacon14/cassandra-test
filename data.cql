-- CREA UN KEYSPACE
CREATE KEYSPACE IF NOT EXISTS agenda WITH REPLICATION={'class': 'SimpleStrategy','replication_factor':'3'};

-- CREA UNA TABLA
CREATE TABLE IF NOT EXISTS agenda.contactos ( contactoid UUID , contactonombre text , contactotelefono text, createdat timestamp, PRIMARY KEY(contactoid));

-- INSERTA 2 ROWS DE DATOS
INSERT INTO agenda.contactos ( contactoid, contactonombre, contactotelefono, createdat) VALUES (uuid(), 'JUAN PÉREZ', '+595983658985', toTimeStamp(now()));
INSERT INTO agenda.contactos ( contactoid, contactonombre, contactotelefono, createdat) VALUES (uuid(), 'CAPONE', '+595983423985', toTimeStamp(now()));

-- SELECT PARA RETORNAR TODOS LOS DATOS DE LA TABLA CONTACTOS
SELECT * FROM agenda.contactos;
