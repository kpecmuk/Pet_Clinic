package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;

/**
 * @author kpecmuk
 * @version 1.0
 * @since 10.02.17
 */
public interface Action {

    void execute(final IClinic clinic, final Validator validator);

    String intro();

    int key();
}
