import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main menu
 *
 * @author kpecmuk
 * @since 11.02.17
 */
public class ClinicMenu {

    private void show() {
        System.out.println("----------------");
        System.out.println("Pet Clinic Menu:");
        System.out.println("----------------");
        System.out.println("1. Add Client");
        System.out.println("2. Remove Client");
        System.out.println("3. Update Client");

        System.out.println("----------------");
        System.out.println("5. Exit program");
        System.out.println("----------------");
        System.out.print("ACTION: ");
    }

    public int askAction() {
        int result;
        Scanner scanner = new Scanner(System.in);
        do {
            int command;
            this.show();
            try {
                command = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Integers only, please.");
                scanner.nextLine();
                command = 0;
            }
            if (command == 1) {
                result = 1;
                break;
            }
            if (command == 2) {
                result = 2;
                break;
            }
            if (command == 3) {
                result = 3;
                break;
            }
            if (command == 5) {
                result = 5;
                break;
            }
        } while (true);
        return result;
    }
}