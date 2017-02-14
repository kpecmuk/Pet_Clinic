package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.Client;
import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 11.08.2015
 */
public class ShowAction implements Action {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        for (Client client : clinic.getClients()) {
            System.out.println(client);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String intro() {
        return (this.key() + " - show client");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int key() {
        return 0;
    }
}
