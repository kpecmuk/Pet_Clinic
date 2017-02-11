
/**
 * Pet Clinic education program
 *
 * @author kpecmuk
 * @version 1.0
 * @since 10.02.17
 */
public class Main {

    public static void main(String[] args) {

        ClinicMenu clinicMenu = new ClinicMenu();

        clinicMenu.askAction();
        if (clinicMenu.getAction() == 1) {
            System.out.println("Action 1");
        }
        if (clinicMenu.getAction() == 2) {
            System.out.println("Action 2");
        }
        if (clinicMenu.getAction() == 3) {
            System.out.println("Action 3");
        }
        if (clinicMenu.getAction() == 5) {
            System.out.println("Action 5 - EXIT");
        }
    }
}