import java.util.*;

public class LibrarySystem {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\nLibrary Management System");
            System.out.println("1 Add Book");
            System.out.println("2 Show Books");
            System.out.println("3 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter title: ");
                String title = sc.nextLine();

                library.addBook(id,title);
            }

            else if(choice == 2) {
                library.showBooks();
            }

            else {
                break;
            }
        }
    }
}