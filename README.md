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

---

## Gestión de Contribuciones Externas: Pull Requests (PR) y Herramientas de GitHub

Cuando un colaborador externo realiza una modificación en el código, es fundamental contar con un proceso estructurado que nos permita entender el cambio antes de integrarlo a la rama principal.

### 1. Datos requeridos al autor del Pull Request (Plantilla de PR)

Para evaluar y validar la contribución, le pedimos al desarrollador completar los siguientes apartados:

* **Tipo de Cambio:** Clasificación de la modificación (ej. Corrección de error, Nueva funcionalidad, Refactorización de código o Actualización de documentación).
  * *Racional:* Permite al equipo clasificar la urgencia del cambio y determinar qué tipo de pruebas de validación son requeridas.
* **Descripción del Cambio:** Explicación clara y concisa de qué modificaciones se hicieron y cuál es el motivo de la propuesta.
  * *Racional:* Ahorra tiempo en la revisión técnica, ya que evita que el revisor deba inferir el propósito del cambio únicamente leyendo el código diff.
* **Referencia a la Tarea o Issue:** Enlace o número del ticket correspondiente (ej. `Closes #15`).
  * *Racional:* Garantiza la trazabilidad entre el sistema de gestión de tareas/requerimientos y los cambios introducidos en el repositorio.
* **Evidencia de Pruebas Realizadas:** Descripción de las pruebas ejecutadas (o capturas/logs de ejecución) para corroborar que la solución funciona.
  * *Racional:* Asegura que el colaborador probó su código previamente y minimiza la introducción de fallas o regresiones en producción.
* **Checklist de Calidad:** Confirmación de que el código sigue las normas del proyecto, no rompe funcionalidades existentes y compila correctamente.
  * *Racional:* Promueve la responsabilidad del desarrollador sobre la calidad del entregable antes de solicitar la revisión.

---

### 2. Herramientas que ofrece GitHub para la Gestión de PRs

GitHub cuenta con funcionalidades integradas para automatizar y facilitar la revisión de contribuciones externas:

* **Plantillas de Pull Request (`PULL_REQUEST_TEMPLATE.md`):** Permite configurar un formulario por defecto en el repositorio para que, cuando un usuario abra un PR, GitHub le despliegue automáticamente los campos obligatorios que debe completar.
* **Revisiones de Código (Code Reviews e Inline Comments):** Permite realizar comentarios directamente sobre líneas específicas del código, solicitar modificaciones puntuales o aprobar la integración.
* **Reglas de Protección de Ramas (Branch Protection Rules):** Bloquea las fusiones directas a la rama `main`, exigiendo como requisito que todo cambio pase por un PR y cuente con la aprobación explícita de al menos un mantenedor del proyecto.
* **Integración Continua (GitHub Actions / CI):** Ejecuta automáticamente pruebas y linters ante cada nuevo PR para validar que el código compila y pasa todas las pruebas automáticas antes de la revisión humana.