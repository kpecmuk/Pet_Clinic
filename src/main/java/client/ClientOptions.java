package client;

import menu.AbstractMenu;

/**
 * @author kpecmuk
 * @since 11.02.2017
 */
public class ClientOptions extends AbstractMenu {
    private int action;

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
            case 4: {
                this.action = 4;
                break;
            }
            default: {
                this.action = 5;
                break;
            }
        }
        return this.action;
    }
}