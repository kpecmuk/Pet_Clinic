package Actions;

/**
 * @author kpecmuk
 * @since 14.02.2017
 */
public class ViewClientAction implements Action {
    @Override
    public String info() {
        return (actionID() + " - View clients");
    }

    @Override
    public void exec() {

    }

    @Override
    public int actionID() {
        return 1;
    }
}
