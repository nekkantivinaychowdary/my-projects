import java.util.*;

class TaskManager {

    List<Task> tasks = new ArrayList<>();

    void addTask(int id, String name) {
        tasks.add(new Task(id, name));
        System.out.println("Task added successfully");
    }

    void showTasks() {

        if(tasks.isEmpty()){
            System.out.println("No tasks available");
            return;
        }

        for(Task t : tasks){
            System.out.println(t.id + " " + t.name +
                    " " + (t.completed ? "Completed" : "Pending"));
        }
    }
}