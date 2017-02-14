import Actions.Action;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kpecmuk
 * @since 10.02.2017
 */
public class Clinic {
    private List clients;
    private final Map<Integer, Action> actions = new ConcurrentHashMap();

    public Clinic() {

    }

    public void addAction(Action action) {
        this.actions.put(action.actionID(), action);
    }

    protected void info() {
        System.out.println(">>> Clinic <<<");
        for (Action action : this.actions.values()) {
            System.out.println(action.info());
        }
    }
}