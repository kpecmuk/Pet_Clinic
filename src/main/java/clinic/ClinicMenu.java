package clinic;

import menu.AbstractMenu;

/**
 * Main menu
 *
 * @author kpecmuk
 * @since 11.02.17
 */
public class ClinicMenu extends AbstractMenu {
    private int action;

    public void show() {
        System.out.println("--------------------");
        System.out.println("  pet.Pet clinic.Clinic Menu   ");
        System.out.println("--------------------");
        System.out.println("1.client.Client options    ");
        System.out.println("2.pet.Pet options       ");
        System.out.println("3.Update information");
        System.out.println("--------------------");
        System.out.println("5.Exit program      ");
        System.out.println("--------------------");
        System.out.print("ACTION: ");
    }

    @Override
    public int action(int action) {
        switch (action) {
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

    void resetAction() {
        this.action = 0;
    }

    int getAction() {
        return this.action;
    }
}