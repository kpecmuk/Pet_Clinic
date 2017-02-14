package Actions;

/**
 * @author kpecmuk
 * @since 14.02.2017
 */
public class RemoveClientAction implements Action {
    @Override
    public String info() {
        return (actionID() + " - Remove client");
    }

    @Override
    public void exec() {

    }

    @Override
    public int actionID() {
        return 3;
    }
}
