import Actions.CreateClientAction;
import Actions.RemoveClientAction;
import Actions.ViewClientAction;

/**
 * Pet Clinic education program
 *
 * @author kpecmuk
 * @version 1.0
 * @since 10.02.17
 */
public class Main {

    public static void main(String[] args) {

        Clinic ui = new Clinic();

        ui.addAction(new ViewClientAction());
        ui.addAction(new CreateClientAction());
        ui.addAction(new RemoveClientAction());

        ui.show();
    }
}