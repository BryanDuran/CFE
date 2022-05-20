From rrojano/jdk8
workdir /app
#expose 8080

cmd ["/app/ejecutar.sh"]
#run apt-get update
#run apt-get install -y mariadb-server
#add bd.sql /app/bd.sql
#run /etc/init.d/mysql start; mysql < /app/bd.sql
add app/ContratosCFE-0.0.1-SNAPSHOT.jar /app/ContratosCFE-0.0.1-SNAPSHOT.jar
add ejecutar.sh /app/ejecutar.sh
run chmod 755 /app/ejecutar.sh