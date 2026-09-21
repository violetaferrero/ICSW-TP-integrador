# Sistema Integrado WMS y TMS - e-Commerce
Este proyecto es un prototipo desarrollado en Java que simula la integración entre un Sistema de Gestión de Depósitos (*Warehouse Management System* - WMS) y un Sistema de Gestión de Envíos (*Transportation Management System* - TMS) para una plataforma de comercio electrónico.

## Descripción del Código
El programa modela el flujo logístico de un producto desde que sale del depósito hasta su entrega final al cliente:
* **WMS (Depósito):** Administra la preparación, empaquetado y estado del paquete antes de su despacho.
* **TMS (Transporte):** Se encarga del seguimiento (*tracking*), asignación de rutas y actualización del estado del envío durante el trayecto.

## Estructura del Proyecto
* `Paquete.java`: Clase que representa la entidad del paquete con sus atributos logísticos (ID, destino, tracking, peso y estado).
* `Main.java`: Clase principal que ejecuta la simulación del ciclo de vida del paquete atravesando los procesos de WMS y TMS.

## ¿Qué debe incluir un archivo README?

El archivo `README.md` es la carta de presentación y el punto de entrada principal de cualquier repositorio de software. Para que la documentación sea completa e informativa, debe contemplar los siguientes apartados:

1. **Título y Descripción del Proyecto:** Explicación clara y concisa del propósito del software, el dominio del negocio (ej. logística e-Commerce) y los problemas que resuelve.
2. **Requisitos Previos y Tecnologías:** Lista de herramientas, lenguajes y versiones requeridas para su ejecución (ej. Java JDK 17, Git, VS Code).
3. **Instalación y Guía de Uso:** Instrucciones paso a paso sobre cómo clonar el repositorio, compilar las clases y ejecutar el programa desde la terminal o el IDE.
4. **Estructura del Código y Arquitectura:** Explicación general de los módulos principales, clases y patrones de diseño utilizados.
5. **Estrategia de Versionado y Ramificado:** Documentación sobre la metodología de trabajo adoptada (ej. Gitflow), explicando el uso de ramas (`main`, `release/`, `hotfix/`, `feature/`) y el significado de las etiquetas de versión (*tags* como `v1.0.0`, `v1.0.1`, `v1.1.0`).
6. **Guía de Contribución y Políticas de Pull Requests (PR):** Reglas para colaboradores internos y externos, incluyendo los campos requeridos al proponer cambios (descripción, tipo de cambio, pruebas) y uso de revisiones de código.