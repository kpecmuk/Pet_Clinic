/**
 * @author kpecmuk
 * @since 11.02.2017
 */
public class ClinicClientAdd extends AbstractMenu implements I_Menu {

    public void show() {
        System.out.println("----------------");
        System.out.println("New Client Menu:");
        System.out.println("----------------");
        System.out.println("1. Client name");
        System.out.println("2. Pet name");
        System.out.println("3. Pet type");
        System.out.println("----------------");
        System.out.println("5. Return");
        System.out.println("----------------");
        System.out.print("ACTION: ");
    }

    @Override
    protected int action(int command) {
        return 0;
    }
}
