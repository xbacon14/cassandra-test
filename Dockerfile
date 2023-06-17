FROM cassandra:latest

COPY ./cassandra.yaml /home/cassandra.yaml

EXPOSE 7000 7001 7199 9042 9160
