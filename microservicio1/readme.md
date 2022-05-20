# Microservicio 1

Este microservicio esta disponible en el siguiente enlace:

https://microservicio-contrato.herokuapp.com/ws/contratos.wsdl

El primer microservicio consiste en 5 operaciones de tipo SOAP:

Para hacer uso de este microservicio es necesaria la extensión [Wizdler](https://chrome.google.com/webstore/detail/wizdler/oebpmncolmhiapingjaagmapififiakb)

![Operaciones disponibles del servicio desde Wizdler](https://i.ibb.co/gZNGrH5/Imagen1.png)

1. <b>Agregar contrato </b>: La persona dará de alta su servicio, con su número de contrato, además proporcionará datos personales como su nombre completo, domicilio, número telefónico, firma electrónica y el número de contrato se genera automáticamente. <br>
![Parámetros de recepción](https://i.ibb.co/MgF2P1D/eagregar.png)
![Parámetros de devolución](https://i.ibb.co/Wzf6dCB/agregar.png)

2. <b>Cancelar Servicio </b>: La persona accede al servicio mediante número de contrato y firma electrónica, entonces el servicio será cancelado. 
![Parámetros de recepción](https://i.ibb.co/yRZHCMP/ecancelar.png)
![Parámetros de devolución](https://i.ibb.co/1X47R1k/cancelar.png)

3. <b>Consultar Servicio </b>: La persona accede al servicio mediante su número de contrato y su firma electrónica. <br>
![Parámetros de recepción](https://i.ibb.co/Sx9nZNR/econsultar.png)
![Parámetros de devolución](https://i.ibb.co/KL1kgZ0/consultar.png)

4. <b>Modificar Servicio </b>: La persona accede al servicio mediante su número de contrato y firma electrónica así modificara su contrato de luz. Luego el usuario proporcionara los datos a modificar. <br>
![Parámetros de recepción](https://i.ibb.co/6NrMNdS/emodificar.png)
![Parámetros de devolución](https://i.ibb.co/82JQsfJ/modificar.png)

5. <b>Mostrar contratos </b>: Las personas podrán visualizar todos los contratos, podrá visualizar el nombre, el número de contrato y la firmae. <br>
![Parámetros de recepción](https://i.ibb.co/Dky8fLG/emostrar.png)
![Parámetros de devolución](https://i.ibb.co/7NDzvKR/mostrar.png)



