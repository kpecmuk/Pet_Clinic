import java.util.Scanner;

/**
 * @author kpecmuk
 * @since 14.02.2017
 */
public class Validator {

    public int getInt(Clinic ui) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        boolean correct = false;
        do {
            try {
                result = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Number plz !");
                scanner.nextInt();
                ui.info();
            }

        } while (!correct);

        return result;
    }

}
