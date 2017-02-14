package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;

/**
 * @author kpecmuk
 * @since 14.02.2017
 */
public class ViewClientAction implements Action {
    @Override
    public void execute(IClinic clinic, Validator validator) {

    }

    @Override
    public String intro() {
        return (key() + " - View clients");
    }

    @Override
    public int key() {
        return 0;
    }
}