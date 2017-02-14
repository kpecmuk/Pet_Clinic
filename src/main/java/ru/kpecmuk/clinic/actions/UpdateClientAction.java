package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.Client;
import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;

/**
 * �������������� �������.
 *
 * @author parsentev
 * @since 11.08.2015
 */
public class UpdateClientAction implements Action {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        final int clientId = validator.getInt("Select client ID : ");
        final String name = validator.getString("Enter client name : ");
        final Client client = clinic.getById(clientId);
        client.setName(name);
        clinic.editClient(client);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String intro() {
        return String.format("%s - update client", this.key());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int key() {
        return 3;
    }
}
