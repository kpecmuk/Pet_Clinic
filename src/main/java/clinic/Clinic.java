package clinic;

import java.util.List;

/**
 * @author kpecmuk
 * @since 10.02.2017
 */
public class Clinic {
    private List clients;
    private ClinicMenu clinicMenu;

    public Clinic() {
        this.clinicMenu = new ClinicMenu();
    }

    public void startWorking() {

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
