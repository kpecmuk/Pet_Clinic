package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;


public class DeleteClientAction implements Action {

    @Override
    public void execute(IClinic clinic, Validator validator) {
        int clientId = validator.getInt("Select client ID : ");
        clinic.deleteClient(clientId);
    }

    @Override
    public String intro() {
        return (this.key() + " - delete client");
    }

    @Override
    public int key() {
        return 5;
    }
}