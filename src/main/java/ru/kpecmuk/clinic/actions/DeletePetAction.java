package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;

/**
 * @since 14.02.2017
 */
public class DeletePetAction implements Action {

    @Override
    public void execute(IClinic clinic, Validator validator) {
        int clientId = validator.getInt("Select client ID :");
        int petId = validator.getInt("Select pet ID :");
        clinic.deletePet(clientId, petId);
    }

    @Override
    public String intro() {
        return String.format("%s - delete pet", this.key());
    }

    @Override
    public int key() {
        return 6;
    }
}