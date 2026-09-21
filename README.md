# Sistema Integrado WMS y TMS - e-Commerce
Este proyecto es un prototipo desarrollado en Java que simula la integración entre un Sistema de Gestión de Depósitos (*Warehouse Management System* - WMS) y un Sistema de Gestión de Envíos (*Transportation Management System* - TMS) para una plataforma de comercio electrónico.

## Descripción del Código
El programa modela el flujo logístico de un producto desde que sale del depósito hasta su entrega final al cliente:
* **WMS (Depósito):** Administra la preparación, empaquetado y estado del paquete antes de su despacho.
* **TMS (Transporte):** Se encarga del seguimiento (*tracking*), asignación de rutas y actualización del estado del envío durante el trayecto.

## Estructura del Proyecto
* `Paquete.java`: Clase que representa la entidad del paquete con sus atributos logísticos (ID, destino, tracking, peso y estado).
* `Main.java`: Clase principal que ejecuta la simulación del ciclo de vida del paquete atravesando los procesos de WMS y TMS.
