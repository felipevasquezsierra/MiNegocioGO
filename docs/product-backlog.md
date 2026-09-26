# Product Backlog – MiNegocioGO

## 1. Información general del proyecto

**Nombre del proyecto:** MiNegocioGO  
**Tipo de proyecto:** Aplicación para la gestión de pequeños negocios  
**Metodología:** Scrum  

## 2. Descripción del producto

MiNegocioGO es una aplicación orientada a pequeños comerciantes que necesitan organizar y controlar las principales operaciones de su negocio desde un solo sistema.

La solución busca facilitar la gestión de productos, inventario y ventas, y posteriormente incorporar funcionalidades relacionadas con la venta online y los pedidos a domicilio.

El sistema pretende ofrecer una alternativa sencilla para registrar información, consultar datos y realizar seguimiento de las operaciones del negocio.

---

## 3. Objetivo del producto

Desarrollar una aplicación que permita a los pequeños comerciantes gestionar de manera organizada la información de sus productos, controlar sus existencias, registrar ventas y, progresivamente, ofrecer productos mediante un canal de venta online.

---

## 4. Usuarios del sistema

### 4.1 Pequeño comerciante

Es el usuario principal del sistema.

Podrá:

- Registrar productos.
- Consultar productos.
- Actualizar productos.
- Registrar entradas de inventario.
- Registrar salidas de inventario.
- Consultar existencias.
- Identificar productos con bajo stock.
- Registrar ventas.
- Consultar ventas.
- Consultar resúmenes de ventas.
- Publicar productos para venta online.
- Gestionar pedidos.

### 4.2 Cliente

Es el usuario que utiliza el canal de venta online.

Podrá:

- Consultar productos disponibles.
- Agregar productos al carrito.
- Realizar pedidos.
- Seleccionar una forma de pago.
- Consultar el estado de sus pedidos.

---

# 5. Épicas del producto

El Product Backlog se organiza en cuatro grandes épicas:

### Épica 1 – Gestión de productos

Permite administrar la información básica de los productos del negocio.

### Épica 2 – Gestión de inventario

Permite controlar entradas, salidas y existencias de productos.

### Épica 3 – Gestión de ventas

Permite registrar y consultar las ventas realizadas por el negocio.

### Épica 4 – Venta online y pedidos

Permite ofrecer productos a los clientes mediante un canal online y gestionar sus pedidos.

---

# 6. Product Backlog

El siguiente listado representa el conjunto inicial de funcionalidades identificadas para MiNegocioGO.

| ID | Épica | Historia de usuario | Prioridad | Story Points | Estado |
|---|---|---|---|---:|---|
| [ ] US-01 | Gestión de productos | Como pequeño comerciante, quiero registrar productos, para mantener organizada la información de los productos de mi negocio. | Alta | 3 | Pendiente |
| [ ] US-02 | Gestión de productos | Como pequeño comerciante, quiero consultar los productos registrados, para conocer la información de los productos de mi negocio. | Alta | 2 | Pendiente |
| [ ] US-03 | Gestión de productos | Como pequeño comerciante, quiero actualizar la información de los productos, para mantener correctamente registrados sus datos. | Alta | 3 | Pendiente |
| [ ] US-04 | Gestión de inventario | Como pequeño comerciante, quiero registrar entradas de inventario, para mantener actualizada la cantidad disponible de mis productos. | Alta | 3 | Pendiente |
| [ ] US-05 | Gestión de inventario | Como pequeño comerciante, quiero registrar salidas de inventario, para controlar las unidades que salen de mi negocio. | Alta | 3 | Pendiente |
| [ ] US-06 | Gestión de inventario | Como pequeño comerciante, quiero consultar las existencias, para conocer la cantidad disponible de cada producto. | Alta | 2 | Pendiente |
| [ ] US-07 | Gestión de inventario | Como pequeño comerciante, quiero identificar los productos con poco stock, para saber cuáles necesitan reposición. | Media | 3 | Pendiente |
| [ ] US-08 | Gestión de ventas | Como pequeño comerciante, quiero registrar una venta, para llevar control de las operaciones realizadas. | Alta | 3 | Pendiente |
| [ ] US-09 | Gestión de ventas | Como pequeño comerciante, quiero consultar las ventas del día, para conocer las operaciones realizadas durante la jornada. | Media | 2 | Pendiente |
| [ ] US-10 | Gestión de ventas | Como pequeño comerciante, quiero consultar un resumen de ventas, para tener una visión general de las ventas registradas. | Media | 3 | Pendiente |
| [ ] US-11 | Venta online y pedidos | Como pequeño comerciante, quiero publicar productos para venta online, para ofrecerlos a mis clientes mediante la aplicación. | Media | 5 | Pendiente |
| [ ] US-12 | Venta online y pedidos | Como cliente, quiero agregar productos al carrito, para revisar mi compra antes de realizar el pedido. | Media | 3 | Pendiente |
| [ ] US-13 | Venta online y pedidos | Como cliente, quiero realizar un pedido a domicilio, para recibir los productos seleccionados en la dirección indicada. | Media | 5 | Pendiente |
| [ ] US-14 | Venta online y pedidos | Como cliente, quiero seleccionar una forma de pago, para completar mi pedido. | Media | 3 | Pendiente |
| [ ] US-15 | Venta online y pedidos | Como cliente, quiero consultar el estado de mi pedido, para conocer en qué etapa se encuentra. | Media | 3 | Pendiente |

**Total de historias:** 15  
**Total estimado:** 51 Story Points

---

# 7. Detalle de las historias de usuario

## Épica 1 – Gestión de productos

### [ ] US-01 – Registrar productos

**Descripción:**  
Permitir al pequeño comerciante registrar los productos que maneja en su negocio.

**Historia de usuario:**

> Como pequeño comerciante, quiero registrar productos, para mantener organizada la información de los productos de mi negocio.

**Criterios de aceptación:**

- [ ] El usuario puede ingresar el nombre del producto.
- [ ] El usuario puede ingresar los datos básicos requeridos.
- [ ] El sistema valida los campos obligatorios.
- [ ] El sistema permite guardar el producto cuando la información es válida.
- [ ] El producto guardado queda disponible para consulta.

---

### [ ] US-02 – Consultar productos registrados

**Descripción:**  
Permitir consultar los productos almacenados en el sistema.

**Historia de usuario:**

> Como pequeño comerciante, quiero consultar los productos registrados, para conocer la información de los productos de mi negocio.

**Criterios de aceptación:**

- [ ] El usuario puede acceder al listado de productos.
- [ ] El sistema muestra los productos registrados.
- [ ] Cada producto presenta su información básica.
- [ ] La información corresponde a los productos almacenados.

---

### [ ] US-03 – Actualizar información de productos

**Descripción:**  
Permitir modificar la información de un producto existente.

**Historia de usuario:**

> Como pequeño comerciante, quiero actualizar la información de los productos, para mantener correctamente registrados sus datos.

**Criterios de aceptación:**

- [ ] El usuario puede seleccionar un producto.
- [ ] El usuario puede modificar los campos permitidos.
- [ ] El sistema valida la información.
- [ ] El sistema permite guardar los cambios.
- [ ] La información actualizada puede consultarse posteriormente.

---

# Épica 2 – Gestión de inventario

### [ ] US-04 – Registrar entradas de inventario

**Descripción:**  
Registrar el ingreso de unidades de productos al inventario.

**Historia de usuario:**

> Como pequeño comerciante, quiero registrar entradas de inventario, para mantener actualizada la cantidad disponible de mis productos.

**Criterios de aceptación:**

- [ ] Se puede seleccionar el producto.
- [ ] Se puede registrar la cantidad ingresada.
- [ ] La entrada queda registrada.
- [ ] La existencia aumenta según la cantidad registrada.

---

### [ ] US-05 – Registrar salidas de inventario

**Descripción:**  
Registrar las unidades que salen del inventario.

**Historia de usuario:**

> Como pequeño comerciante, quiero registrar salidas de inventario, para controlar las unidades que salen de mi negocio.

**Criterios de aceptación:**

- [ ] Se puede seleccionar el producto.
- [ ] Se puede ingresar la cantidad que sale.
- [ ] El sistema valida que exista cantidad suficiente.
- [ ] La salida queda registrada.
- [ ] La existencia se actualiza correctamente.

---

### [ ] US-06 – Consultar existencias

**Descripción:**  
Permitir consultar las cantidades disponibles de los productos.

**Historia de usuario:**

> Como pequeño comerciante, quiero consultar las existencias, para conocer la cantidad disponible de cada producto.

**Criterios de aceptación:**

- [ ] El usuario puede consultar el inventario.
- [ ] Se muestra la cantidad disponible por producto.
- [ ] Las cantidades corresponden a los movimientos registrados.
- [ ] La información se presenta de forma clara.

---

### [ ] US-07 – Identificar productos con poco stock

**Descripción:**  
Permitir identificar los productos cuya existencia se encuentre por debajo del nivel mínimo establecido.

**Historia de usuario:**

> Como pequeño comerciante, quiero identificar los productos con poco stock, para saber cuáles necesitan reposición.

**Criterios de aceptación:**

- [ ] Se puede establecer un nivel mínimo de existencia.
- [ ] El sistema identifica los productos que están por debajo del mínimo.
- [ ] El usuario puede conocer qué productos necesitan reposición.

---

# Épica 3 – Gestión de ventas

### [ ] US-08 – Registrar una venta

**Descripción:**  
Permitir registrar las ventas realizadas por el negocio.

**Historia de usuario:**

> Como pequeño comerciante, quiero registrar una venta, para llevar control de las operaciones realizadas.

**Criterios de aceptación:**

- [ ] El usuario puede registrar una venta.
- [ ] La venta contiene la información necesaria.
- [ ] La venta queda almacenada.
- [ ] La venta puede consultarse posteriormente.

---

### [ ] US-09 – Consultar ventas del día

**Descripción:**  
Permitir consultar las ventas realizadas durante una fecha determinada.

**Historia de usuario:**

> Como pequeño comerciante, quiero consultar las ventas del día, para conocer las operaciones realizadas durante la jornada.

**Criterios de aceptación:**

- [ ] El usuario puede consultar las ventas por fecha.
- [ ] Se muestran las ventas correspondientes a la fecha seleccionada.
- [ ] Cada venta presenta su información básica.
- [ ] La información se presenta de forma organizada.

---

### [ ] US-10 – Consultar resumen de ventas

**Descripción:**  
Permitir visualizar un resumen de las ventas registradas.

**Historia de usuario:**

> Como pequeño comerciante, quiero consultar un resumen de ventas, para tener una visión general de las ventas registradas.

**Criterios de aceptación:**

- [ ] El usuario puede acceder al resumen.
- [ ] El resumen utiliza las ventas registradas.
- [ ] La información se presenta de forma clara.
- [ ] Se puede consultar el periodo correspondiente.

---

# Épica 4 – Venta online y pedidos

### [ ] US-11 – Publicar productos para venta online

**Descripción:**  
Permitir seleccionar productos del negocio para ofrecerlos mediante el canal online.

**Historia de usuario:**

> Como pequeño comerciante, quiero publicar productos para venta online, para ofrecerlos a mis clientes mediante la aplicación.

**Criterios de aceptación:**

- [ ] El comerciante puede seleccionar un producto para publicar.
- [ ] El producto publicado muestra su información básica.
- [ ] El producto queda disponible para consulta del cliente.
- [ ] El comerciante puede retirar el producto de la publicación.

---

### [ ] US-12 – Agregar productos al carrito

**Descripción:**  
Permitir al cliente seleccionar productos antes de confirmar una compra.

**Historia de usuario:**

> Como cliente, quiero agregar productos al carrito, para revisar mi compra antes de realizar el pedido.

**Criterios de aceptación:**

- [ ] El cliente puede agregar productos al carrito.
- [ ] El carrito muestra los productos seleccionados.
- [ ] Se muestra la cantidad de cada producto.
- [ ] El cliente puede revisar los productos antes de confirmar.

---

### [ ] US-13 – Realizar pedido a domicilio

**Descripción:**  
Permitir al cliente confirmar un pedido y registrar la información necesaria para su entrega.

**Historia de usuario:**

> Como cliente, quiero realizar un pedido a domicilio, para recibir los productos seleccionados en la dirección indicada.

**Criterios de aceptación:**

- [ ] El cliente puede confirmar el pedido.
- [ ] Se registran los datos necesarios para la entrega.
- [ ] El pedido queda almacenado.
- [ ] El cliente recibe confirmación del pedido.

---

### [ ] US-14 – Seleccionar forma de pago

**Descripción:**  
Permitir al cliente seleccionar una forma de pago disponible.

**Historia de usuario:**

> Como cliente, quiero seleccionar una forma de pago, para completar mi pedido.

**Criterios de aceptación:**

- [ ] El sistema muestra las formas de pago disponibles.
- [ ] El cliente puede seleccionar una opción.
- [ ] La forma de pago queda asociada al pedido.
- [ ] La información se conserva junto con el pedido.

---

### [ ] US-15 – Consultar estado del pedido

**Descripción:**  
Permitir al cliente consultar el estado actual de un pedido.

**Historia de usuario:**

> Como cliente, quiero consultar el estado de mi pedido, para conocer en qué etapa se encuentra.

**Criterios de aceptación:**

- [ ] El cliente puede consultar sus pedidos.
- [ ] El sistema muestra el estado actual.
- [ ] El estado corresponde al pedido seleccionado.
- [ ] El estado puede actualizarse cuando cambia la etapa del pedido.

---

# 8. Priorización del Product Backlog

La prioridad se establece teniendo en cuenta las dependencias funcionales del producto.

## Prioridad alta

Las siguientes historias forman la base inicial del sistema:

- [ ] US-01 – Registrar productos.
- [ ] US-02 – Consultar productos.
- [ ] US-03 – Actualizar productos.
- [ ] US-04 – Registrar entradas.
- [ ] US-05 – Registrar salidas.
- [ ] US-06 – Consultar existencias.
- [ ] US-08 – Registrar ventas.

## Prioridad media

Estas funcionalidades complementan el funcionamiento del producto:

- [ ] US-07 – Identificar poco stock.
- [ ] US-09 – Consultar ventas del día.
- [ ] US-10 – Resumen de ventas.
- [ ] US-11 – Publicar productos online.
- [ ] US-12 – Carrito.
- [ ] US-13 – Pedido a domicilio.
- [ ] US-14 – Forma de pago.
- [ ] US-15 – Estado del pedido.

---

# 9. Dependencias funcionales

Las historias tienen algunas dependencias naturales:

```text
US-01 Registrar productos
        │
        ├──> US-02 Consultar productos
        │
        └──> US-03 Actualizar productos
                    │
                    ▼
             US-04 Entradas
                    │
                    ▼
             US-05 Salidas
                    │
                    ▼
             US-06 Existencias
                    │
                    ▼
             US-07 Bajo stock
