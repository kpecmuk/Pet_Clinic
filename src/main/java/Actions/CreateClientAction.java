package Actions;

/**
 * @author kpecmuk
 * @since 14.02.2017
 */
public class CreateClientAction implements Action {
    @Override
    public String info() {
        return (actionID() + " - New client");
    }

    @Override
    public void exec() {

    }

    @Override
    public int actionID() {
        return 2;
    }
}