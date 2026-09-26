# Historias de usuario

## Contexto

Las historias de usuario describen las necesidades funcionales de MiNegocioGO desde la perspectiva del usuario. Cada historia incluye criterios de aceptación que permiten verificar cuándo la funcionalidad cumple con lo esperado.

---

## Épica 1 – Gestión de productos

### [ ] US-01 – Registrar productos

**Descripción:** Permitir al pequeño comerciante registrar los productos que maneja en su negocio para mantener organizada su información.

**Historia de usuario**

> Como pequeño comerciante, quiero registrar productos, para mantener organizada la información de los productos de mi negocio.

**Criterios de aceptación**

- [ ] El usuario puede ingresar el nombre del producto.
- [ ] El usuario puede ingresar los datos básicos definidos para el producto.
- [ ] El sistema valida los campos obligatorios.
- [ ] El sistema permite guardar un producto cuando la información requerida es válida.
- [ ] El producto guardado queda disponible para consulta.

---

### [ ] US-02 – Consultar productos registrados

**Descripción:** Permitir al pequeño comerciante consultar los productos que ya se encuentran registrados.

**Historia de usuario**

> Como pequeño comerciante, quiero consultar los productos registrados, para conocer la información de los productos de mi negocio.

**Criterios de aceptación**

- [ ] El usuario puede acceder al listado de productos.
- [ ] El sistema muestra los productos registrados.
- [ ] Cada producto presenta su información básica.
- [ ] La información mostrada corresponde a los productos almacenados.

---

### [ ] US-03 – Actualizar información de productos

**Descripción:** Permitir modificar la información de un producto existente para mantener los datos actualizados.

**Historia de usuario**

> Como pequeño comerciante, quiero actualizar la información de los productos, para mantener correctamente registrados los datos de mi negocio.

**Criterios de aceptación**

- [ ] El usuario puede seleccionar un producto registrado.
- [ ] El usuario puede modificar los campos permitidos.
- [ ] El sistema valida la información antes de guardar los cambios.
- [ ] El sistema permite guardar la actualización.
- [ ] La información modificada se muestra al volver a consultar el producto.

---

## Épica 2 – Gestión de inventario

### [ ] US-04 – Registrar entradas de inventario

**Descripción:** Registrar el ingreso de unidades de un producto para actualizar sus existencias.

**Historia de usuario**

> Como pequeño comerciante, quiero registrar entradas de inventario, para mantener actualizada la cantidad disponible de mis productos.

**Criterios de aceptación**

- [ ] Se puede seleccionar el producto.
- [ ] Se puede ingresar la cantidad recibida.
- [ ] La entrada queda registrada.
- [ ] La existencia aumenta según la cantidad ingresada.

---

### [ ] US-05 – Registrar salidas de inventario

**Descripción:** Registrar las unidades que salen del inventario.

**Historia de usuario**

> Como pequeño comerciante, quiero registrar salidas de inventario, para controlar las unidades que salen de mi negocio.

**Criterios de aceptación**

- [ ] Se puede seleccionar el producto.
- [ ] Se puede ingresar la cantidad que sale.
- [ ] El sistema valida que exista disponibilidad suficiente.
- [ ] La salida queda registrada.
- [ ] La existencia se actualiza correctamente.

---

### [ ] US-06 – Consultar existencias

**Descripción:** Permitir consultar las cantidades disponibles de los productos.

**Historia de usuario**

> Como pequeño comerciante, quiero consultar las existencias, para conocer la cantidad disponible de cada producto.

**Criterios de aceptación**

- [ ] El usuario puede consultar el inventario.
- [ ] El sistema muestra la cantidad disponible por producto.
- [ ] Las cantidades corresponden a los movimientos registrados.
- [ ] La información se presenta de forma clara.

---

### [ ] US-07 – Identificar productos con poco stock

**Descripción:** Identificar productos cuya existencia esté por debajo del nivel establecido.

**Historia de usuario**

> Como pequeño comerciante, quiero identificar los productos con poco stock, para saber cuáles necesitan reposición.

**Criterios de aceptación**

- [ ] El sistema permite definir o utilizar un nivel mínimo de existencia.
- [ ] Los productos por debajo de ese nivel pueden identificarse.
- [ ] El usuario puede conocer qué productos requieren reposición.

---

## Épica 3 – Gestión de ventas

### [ ] US-08 – Registrar una venta

**Descripción:** Permitir registrar las ventas realizadas durante la jornada.

**Historia de usuario**

> Como pequeño comerciante, quiero registrar una venta, para llevar control de las operaciones realizadas.

**Criterios de aceptación**

- [ ] El usuario puede registrar una venta.
- [ ] La venta contiene la información necesaria.
- [ ] La venta queda almacenada.
- [ ] La venta puede consultarse posteriormente.

---

### [ ] US-09 – Consultar ventas del día

**Descripción:** Permitir consultar las ventas realizadas durante una fecha determinada.

**Historia de usuario**

> Como pequeño comerciante, quiero consultar las ventas del día, para conocer las operaciones realizadas durante la jornada.

**Criterios de aceptación**

- [ ] El usuario puede consultar las ventas por fecha.
- [ ] Se muestran las ventas correspondientes a la fecha seleccionada.
- [ ] Cada venta presenta su información básica.
- [ ] La información se presenta de forma organizada.

---

### [ ] US-10 – Consultar resumen de ventas

**Descripción:** Mostrar un resumen de las ventas registradas para facilitar su revisión.

**Historia de usuario**

> Como pequeño comerciante, quiero consultar un resumen de ventas, para tener una visión general de las ventas registradas.

**Criterios de aceptación**

- [ ] El usuario puede acceder al resumen.
- [ ] El resumen utiliza las ventas registradas.
- [ ] La información se presenta de forma clara.
- [ ] El resumen puede consultarse para el periodo seleccionado.

---

## Épica 4 – Venta online y pedidos

### [ ] US-11 – Publicar productos para venta online

**Descripción:** Permitir seleccionar productos del negocio para ofrecerlos mediante el canal online.

**Historia de usuario**

> Como pequeño comerciante, quiero publicar productos para venta online, para ofrecerlos a mis clientes por medio de la aplicación.

**Criterios de aceptación**

- [ ] El usuario puede seleccionar un producto para publicar.
- [ ] El producto publicado muestra su información básica.
- [ ] El producto queda disponible para consulta del cliente.
- [ ] El usuario puede retirar un producto de la publicación.

---

### [ ] US-12 – Agregar productos al carrito

**Descripción:** Permitir al cliente seleccionar productos antes de confirmar un pedido.

**Historia de usuario**

> Como cliente, quiero agregar productos al carrito, para revisar mi compra antes de realizar el pedido.

**Criterios de aceptación**

- [ ] El cliente puede agregar un producto al carrito.
- [ ] El carrito muestra los productos seleccionados.
- [ ] El carrito muestra la cantidad de cada producto.
- [ ] El cliente puede revisar los productos antes de confirmar.

---

### [ ] US-13 – Realizar pedido a domicilio

**Descripción:** Permitir al cliente confirmar un pedido y proporcionar los datos necesarios para su entrega.

**Historia de usuario**

> Como cliente, quiero realizar un pedido a domicilio, para recibir los productos seleccionados en la dirección indicada.

**Criterios de aceptación**

- [ ] El cliente puede confirmar el pedido.
- [ ] Se registran los datos necesarios para la entrega.
- [ ] El pedido queda almacenado.
- [ ] El cliente recibe confirmación del pedido.

---

### [ ] US-14 – Seleccionar forma de pago

**Descripción:** Permitir al cliente seleccionar una forma de pago disponible para el pedido.

**Historia de usuario**

> Como cliente, quiero seleccionar una forma de pago, para completar mi pedido.

**Criterios de aceptación**

- [ ] El sistema muestra las formas de pago disponibles.
- [ ] El cliente puede seleccionar una opción.
- [ ] La forma de pago queda asociada al pedido.
- [ ] El pedido conserva la información seleccionada.

---

### [ ] US-15 – Consultar estado del pedido

**Descripción:** Permitir al cliente consultar el estado actual de un pedido realizado.

**Historia de usuario**

> Como cliente, quiero consultar el estado de mi pedido, para conocer en qué etapa se encuentra.

**Criterios de aceptación**

- [ ] El cliente puede consultar sus pedidos.
- [ ] El sistema muestra el estado actual.
- [ ] El estado corresponde al pedido seleccionado.
- [ ] El estado se actualiza cuando cambia la etapa del pedido.

---

## Convención de seguimiento

- `[ ]` = pendiente.
- `[x]` = realizado y validado.

Los criterios deben marcarse como `[x]` únicamente cuando la funcionalidad haya sido implementada y comprobada.
