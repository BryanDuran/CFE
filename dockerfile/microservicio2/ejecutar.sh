#!/bin/sh
#/etc/init.d/mysql start
/usr/bin/java -jar -Dserver.port=$PORT PagoRest-0.0.1-SNAPSHOT.jar