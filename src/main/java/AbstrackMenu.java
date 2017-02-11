import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author kpecmuk
 * @since 11.02.17
 */
abstract class AbstrackMenu implements I_Menu {

    public int askAction() {
        Scanner scanner = new Scanner(System.in);
        int command;
        do {
            this.show();
            try {
                command = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Integers only, please.");
                scanner.nextLine();
                command = 0;
            }
        } while (command == 0);
        return action(command);
    }

    protected abstract int action(int command);
}