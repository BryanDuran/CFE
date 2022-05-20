# Explicación del Docker File

1.	Se inicializa la imagen base para las instrucciones subsecuentes en ente caso se usará la imagen de JDK8. 
2.	Se establece el directorio de trabajo; /app.
3.	CMD se encarga de pasar el comando al contenedor, en este caso ejecuta el archivo ejecutar.sh. 
4.	ADD se encarga de copiar el archivo JAR de la carpeta app local a la carpeta app de la imagen.
5.	Lo mismo pasa con ejecutar, es copiada a la carpeta app de la imagen.
6.	Finalmente ejecuta el archivo ejecutar.sh, dentro del archivo ejecutar.sh, se establece el puerto donde se ejcutara, debido a que expose no funciona al hacer el desploy con heroku.

![Ejemplo DockerFile](https://i.ibb.co/VH0bswN/Captura-de-pantalla-2022-05-20-162444.png)

![Ejemplo Ejecutar SH](https://i.ibb.co/qx0SgZZ/eje.png)