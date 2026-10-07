String[] inputs = {"task-cli add Comprar el super", 
                   "task-cli add Regar las plantas", 
                   "task-cli add Arreglar la cama", 
                   "task-cli list", 
                   "task-cli update 0 Comprar el super y  cocinar", 
                   "task-cli update 1 Regar las plantas y cortarlas", 
                   "task-cli update 2 Arreglar la cama y leer un libro", 
                   "task-cli list", 
                   "task-cli delete 0", 
                   "task-cli delete 1", 
                   "task-cli delete 2", 
                   "task-cli list", 
                   "exit"};
int cursorInputs = 0;
String[] tasks = new String[3];
int cursorTasks = 0;
String input = "";

IO.println("👋 Bienvenido a task-cli 📖");

while (!input.equals("exit")) {
 input = inputs[cursorInputs];
 if (input.startsWith("task-cli")) {
  input = input.substring(9, input.length());
  // # Adding a new task
  if (input.startsWith("add")){
    input = input.substring(4, input.length());
    tasks[cursorTasks++] = input;
    IO.println("Tarea agregada exitosamente (ID: " + cursorTasks + ")");
  } else if (input.startsWith("update")){ //# Updating and deleting tasks
    input = input.substring(7, input.length());
    int id = Integer.valueOf(input.substring(0, 1));
    input = input.substring(2, input.length());
    tasks[id] = input;
    IO.println("Tarea actualizada exitosamente (ID: " + id + ")");
  } else if (input.startsWith("delete")){
    input = input.substring(7, input.length());
    int id = Integer.valueOf(input.substring(0, 1));
    tasks[id] = null;
    IO.println("Tarea eliminada exitosamente (ID: " + id + ")");
  } else if (input.startsWith("list")){ //# Listing all tasks
    IO.println("Mostrar todas las tareas");
    IO.println(Arrays.toString(tasks));
  } else {
    IO.println("Error: No se reconoce el comando");
    break;
  }
 } else{
   IO.println("Error: No se reconoce el programa");
   break;
 }
  input = inputs[++cursorInputs];
}
IO.println("👋 Bye");
