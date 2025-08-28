import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Animal List Manager ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Animal");
            System.out.println("2. List Animals");
            System.out.println("3. Remove Animal");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter animal species: ");
                    String species = scanner.nextLine();
                    animalManager.addAnimal(name, species);
                    break;
                case 2:
                    animalManager.listAnimals();
                    break;
                case 3:
                    System.out.print("Enter animal number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    animalManager.removeAnimal(removeIndex);
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
