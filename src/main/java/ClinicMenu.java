/**
 * Main menu
 *
 * @author kpecmuk
 * @since 11.02.17
 */
public class ClinicMenu extends AbstrackMenu implements I_Menu {
    private int action;

    public void show() {
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

    public int action(int command) {
        switch (command) {
            case 1: {
                this.action = 1;
                break;
            }
            case 2: {
                this.action = 2;
                break;
            }
            case 3: {
                this.action = 3;
                break;
            }
            default: {
                this.action = 5;
                break;
            }
        }
        return this.action;
    }

    public int getAction() {
        return this.action;
    }
}