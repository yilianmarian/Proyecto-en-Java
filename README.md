# Ferreteria el tablillazo

Los objetivos de este trabajo se orientan a la administración de la información de usuarios, de inventarios, ventas y artículos. Pretende ser una herramienta que permita optimizar el servicio dentro de las labores administrativas de la ferretería, no se trata de una ferretería con tienda online si no un recurso para facilitar la comercialización y pre-venta de productos, esa preventa se pretende hacer a través de cotizaciones.  Se verán beneficiados en los siguientes aspectos: Los clientes contarán con la facilidad de hacer cotizaciones en línea, aun cuando la ferretería no este prestando servicio, esto les permitirá a los clientes conocer productos nuevos y la cantidad que se  está ofreciendo con sus correspondientes precios, sosteniendo el precio que se registre en la cotización. Los empleados podrán iniciar sesión y hacer las ventas con o sin cotizaciones. El administrador podrá tener a su disposición información de todo lo que está quedando en la base de datos por medio de la web, y a si mismo podrá insertar, editar y borrar datos. 

Se espera con este proyecto contribuir a:  
Proporcionar herramienta administrativa a la microempresa EL TABLILLAZO, minimizar las perdidas de información dentro de dicha ferretería, monitorear las cotizaciones y ver a través de las ventas registradas que productos se están vendiendo con más frecuencia, prestar un servicio aun cuando la ferretería este cerrada, crear un ambiente ameno en el campo laboral dentro de la ferretería EL TABLILLAZO, permitir en un tiempo posterior hacer nuevos cambios a la herramienta web. 

***
Colaboradores: 
Yillian Marian Galano Pastrana,Rachel Cepero Rodriguez y Janny Campos Mora

***
Clases implementadas y por cada miembro:

Yillian Galano Pastrana utilizo la clase comentario con los atributos remitente, texto, direccion, id y datos, la clase cotizacion con los atributos producto, comprador, id y datos, la clase empleado con los atributos nombre y contraseña y la clase rebaja con los atributos producto, vendedor,id y dato. 
Janny Campos Mora  utilizo la clase administrador con los atributos nombre y CI, la clase articulos con los atributos id, nombre, descripcion, cantidad, valor unitario y valor total, la clase main que es donde se inicializa el programa y la clase registro con los atributos id, dato, nombre y descripcion
Rachel Cepero Rodriguez utilizo la clase cliente con los atributos nombre y contraseña y la clase usuarios con los atributos nombre y contraseña
***
Trabajo con archivos por cada miembro:

Se desarrollo el trabajo con archivos de la clase registro(por la colaboradora Yillian),de la clase articulos(por la colaboradora Rachel) y la clase cliente y empleado(por la colaboradora Janny) ,con el objetivo de guardar y cargar los datos de estas clases en una lista para luego almacenarlos en una tabla que vamos a emplear en la aplicacion

***
Interfaces graficas realizadas en el trabajo por cada colaborador:

La imagen siguiente es el inicio de la página, se pueden encontrar pestañas con los siguientes nombres: inicio y contáctenos. En esta pestaña el usuario podrá ingresar a su perfil, ya sea un cliente, empleado o administrador donde podrá hacer uso de servicios según sea el perfil ingresado.(Interfaz realizada por Janny) 

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Login.PNG)


El usuario al ingresar como cliente tendrá una pestaña como la siguiente, donde podrá hacer las cotizaciones que desee, al darle en el botón cotizar tendra que ingresar el ID del articulo y al dar clic en aceptar la cotización quedara registrada en la base de datos .Una vez el cliente quiera abandonar la página este dará clic en el encabezado con el nombre cerrar sesión.(Interfaz realizada por Rachel)

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Menu%20Cliente.PNG)


El cliente tambien podra ver los articulos como muestra la imagen siguiente donde encontrara datos como el Id ,el nombre y el precio(Interfaz realizada por Yillian) 

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Vista%20Cliente.PNG)

Lo siguiente es el diseño del entorno empleado, los empleados únicamente pueden hacer ventas con o sin cotizaciones al ingresar con su perfil de empleado (Interfaz realizada por Yillian) 

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Menu%20Empleado.PNG)


La siguiente imagen es el entorno administrador. En este entorno la persona ingresada puede gestionar los usuarios ya sea cliene o empleado y tambien gestionara los articulos y los registros. Esta pestaña contara con el boton compromiso(donde se podra escribir dichos compromisos) y el boton cerrar sesion:(Interfaz realizada por Yillian)

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Menu%20Administardor.PNG)
![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Compromisos.PNG)

Gestion de usuarios(cliente y empleado) (Interfaz Realizada por Rachel)
En estas interfaces el administrador puede  añadir a todos los usuarios del sistema, llenando los campos con su nombre y contraseña, al terminar  solo debe dar clic en el menu, luego en guardar y automáticamente se agregara un nuevo usuario.

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Gestion%20de%20clientes.PNG)
![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Gestion%20de%20empleaods.PNG)


Gestión de articulos (Interfaz realizada por Janny)
En esta interfaz el administrador puede añadir los articulos que se encuentran disponibles asi como informacion acerca de estos, ID, Nombre, Descripcion, Cantidad, Valor Unitario y Valor Total al llenar los campos mencionados anteriromente debe dar clic en menu y luego en guardar, automáticamente se agregara el articulo. Esta se realizo con el objetivo de mostrar los articulos que se encuentran a la venta en el momento

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Gestion%20de%20articulos.PNG)


Gestion de registros (Interfaz realizada por Janny)
En esta interfaz el administrador puede registrar un inventario, para ello solo debe dar clic en el inventario y llenar la lista que aparece, por ultimo solamente dar clic en guardar  y automáticamente se agregara un inventario.Esta se realizo con el objetivo de mostar el registro de productos de la tienda aunque no se encuentren a la venta en el momento( en resumen esta interfaz guarda la lista de todos los productos que ha vendido la tienda)

![Screenshot](https://github.com/yilianmarian/Proyecto-de-VP/blob/main/Fotos%20para%20el%20README/Gestion%20de%20Regitro.PNG)




