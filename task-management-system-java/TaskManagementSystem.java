import java.util.*;

public class TaskManagementSystem {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\nTask Management System");
            System.out.println("1 Add Task");
            System.out.println("2 Show Tasks");
            System.out.println("3 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter task name: ");
                String name = sc.nextLine();

                manager.addTask(id,name);

            }

            else if(choice == 2){

                manager.showTasks();

            }

            else{

                break;

            }

        }

    }

}