# task-tracker
El organizador de tareas es un proyecto que sirve para administrar tareas. En este proyecto, se simulará una interfaz de línea de comandos (CLI) sencilla para llevar un registro de lo que se tiene que hacer. Se simulará una CLI debido a las limitantes que presentan algunos compiladores en línea.

## Requisitos
La aplicación simula la ejecución de una línea de comandos (los comandos se alojan en un array tipo string), acepta acciones y entradas del usuario como argumentos, y almacena las tareas en una variable. El usuario puede:

- Agregar, actualizar y eliminar tareas
- Mostrar una lista de todas las tareas

A continuación se presentan algunas restricciones que deben guiar la implementación:

- Utilizar el lenguaje de programación Java.
- Utiliza argumentos posicionales en la línea de comandos para aceptar entradas del usuario.
- Se puede ejecutar en un compilador de pruebas, como el compilador en línea: https://dev.java/playground/
- No se utiliza bibliotecas ni frameworks externos para desarrollar este proyecto.
- Asegura el manejo de los errores y los casos extremos de manera adecuada.

### Ejemplo
A continuación se presenta la lista de comandos y su uso:

// Agregar una nueva tarea <br>
  task-cli add "Comprar el mercado" <br>
// Salida: Tarea agregada exitosamente (ID: 1)
<br><br>
// Actualizar y eliminar tareas <br>
task-cli update 1 "Comprar el mercado y cocinar" <br>
task-cli delete 1 <br>
<br>
// Mostrar todas las tareas <br>
task-cli list
