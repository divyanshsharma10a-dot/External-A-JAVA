import java.util.*;

public class CRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Create\n2. Read\n3. Update\n4. Delete\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: // CREATE
                    System.out.print("Enter item to add: ");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Added!");
                    break;

                case 2: // READ
                    System.out.println("Items: " + list);
                    break;

                case 3: // UPDATE
                    System.out.print("Enter index to update: ");
                    int indexU = sc.nextInt();
                    sc.nextLine();
                    if (indexU < list.size()) {
                        System.out.print("Enter new value: ");
                        list.set(indexU, sc.nextLine());
                        System.out.println("Updated!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4: // DELETE
                    System.out.print("Enter index to delete: ");
                    int indexD = sc.nextInt();
                    if (indexD < list.size()) {
                        list.remove(indexD);
                        System.out.println("Deleted!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}