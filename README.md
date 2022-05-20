# Proyecto Final - Equipo 4
## Tencologías Para La Integración de Soluciones

# Contenido
1. [Integrantes](#Integrantes)
1. [Descripción](#Descripción)
1. [Solución](#Solución)
1. [Microservicio 1](#microservicio-1)
1. [Microservicio 2](#microservicio-2)
1. [Microservicio 3](#microservicio-3)
1. [Operaciones por SOAP](#Operaciones-por-SOAP)
1. [Operaciones por REST](#Operaciones-por-REST)

&nbsp;

### Integrantes
- CAMPOS GARCIA IVAN ANTONIO zs19016413@estudiantes.uv.mx
- DURAN CUELLAR BRYAN ALBERTO zs18014509@estudiantes.uv.mx
- LUCAS NEGRETE PABLO zs19016378@estudiantes.uv.mx
- VILLA CEBALLOS LUIS ARMANDO zs18014494@estudiantes.uv.mx

### Descripción 
<p>
La globalización, el aumento del número y velocidad de las transacciones y la movilidad, provocados por la rápida evolución de la tecnología han dejado obsoleta la forma de atender los negocios. Para un gran número de empresas es casi un «obligación» ofrecer servicios web y cada vez más frecuentemente las empresas nacen con el objetivo único de que sus servicios se consulten en internet. Las ventajas son múltiples, destacando el aumento de clientes potenciales, la ausencia de horario comercial y la comodidad de poder ofrecer a nuestros clientes administrar su servicio desde cualquier ubicación. Ahora bien, todos estos beneficios se ponen en ejecución para ofrecer a los clientes los medios adecuados para que las contrataciones se realicen lo más rápidas, seguras y sencillas posibles, así como la administración de sus servicios.
</p>

### Solución
<p>
Como solución pensamos en desarrollar un servicio web para la creación de contratos y para la renta de luz que se lleva a cabo bimestralmente, con la finalidad de reducir los tiempos de espera en lugares físicos y hacerlo de forma más rápida y segura en el servicio.
</p>

### Microservicio 1

El primer microservicio consiste en 5 operaciones de tipo SOAP:
- AgregaContrato
- CancelarServicio
- ModificarServicio
- MostrarContratos

Estos operaciones, serán descritos en breve. Este microservicio esta disponible en el siguiente enlace:

https://microservicio-contrato.herokuapp.com/ws/contratos.wsdl


### Microservicio 2

El segundo microservicio consiste en 2 operaciones de tipo REST:
- Pagar
- Historial de pago

Estos operaciones, serán descritos en breve. Este microservicio esta disponible en el siguiente enlace:

https://microservicio-pago.herokuapp.com/

### Microservicio 3

El segundo microservicio consiste en una operación de tipo REST:
- Generación de firma electrónica

Esta operación, será descritos en breve. Este microservicio esta disponible en el siguiente enlace:



#### Operaciones por SOAP 

<br>

1. <b>Agregar contrato </b>: La persona dará de alta su servicio, con su número de contrato, además proporcionará datos personales como su nombre completo, domicilio, número telefónico, firma electrónica y el número de contrato se genera automáticamente. <br>
2. <b>Cancelar Servicio </b>: La persona accede al servicio mediante número de contrato y firma electrónica, entonces el servicio será cancelado. 
3. <b>Consultar Servicio </b>: La persona accede al servicio mediante su número de contrato y su firma electrónica. <br>
4. <b>Modificar Servicio </b>: La persona accede al servicio mediante su número de contrato y firma electrónica así modificara su contrato de luz. Luego el usuario proporcionara los datos a modificar. <br>
5. <b>Mostrar contratos </b>: Las personas podrán visualizar todos los contratos, podrá visualizar el nombre, el número de contrato y la firmae. <br>

#### Operaciones por REST 

<br>

- <b>Generación de firma electrónica</b>: La persona generara su firma electrónica proporcionando su nombre completo.
- <b>Historial de pago</b>: La persona podrá ver su consumo de energía e importe del mes anterior, proporcionando firma electrónica.
- <b>Pagar<b>: La persona pagara su servicio proporcionando su número de contrato y la cantidad a pagar.

