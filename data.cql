-- CREA UN KEYSPACE
CREATE KEYSPACE IF NOT EXISTS agenda WITH REPLICATION={'class': 'SimpleStrategy','replication_factor':'1'};

-- CREA UNA TABLA
CREATE TABLE IF NOT EXISTS agenda.contactos ( contactoid text PRIMARY KEY, contactonombre text , contactotelefono text, createdat timestamp);

-- INSERTA 2 ROWS DE DATOS
INSERT INTO agenda.contactos ( contactoid, contactonombre, contactotelefono, createdat) VALUES ('123', 'JUAN PÉREZ', '+595983658985', toTimeStamp(now()));
INSERT INTO agenda.contactos ( contactoid, contactonombre, contactotelefono, createdat) VALUES ('4123', 'CAPONE', '+595983423985', toTimeStamp(now()));