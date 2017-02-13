package client;

import menu.AbstractMenu;

/**
 * @author kpecmuk
 * @since 11.02.2017
 */
public class ClientOptions extends AbstractMenu {

    public void show() {
        System.out.println("---------------");
        System.out.println("  Client Menu  ");
        System.out.println("---------------");
        System.out.println("1.View client  ");
        System.out.println("2.View pets    ");
        System.out.println("3.Add client   ");
        System.out.println("4.Remove client");
        System.out.println("---------------");
        System.out.println("5.Back         ");
        System.out.println("---------------");
        System.out.print("ACTION: ");
    }

    @Override
    protected int action(int command) {
        return 0;
    }
}