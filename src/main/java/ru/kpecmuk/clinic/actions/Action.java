package ru.kpecmuk.clinic.actions;

import ru.kpecmuk.clinic.IClinic;
import ru.kpecmuk.clinic.tools.Validator;

/**
 * @author kpecmuk
 * @version 1.0
 * @since 10.02.17
 */
public interface Action {

    /**
     * Выполнить действие.
     *
     * @param clinic    Клиника.
     * @param validator Валидатор ввода.
     */
    void execute(final IClinic clinic, final Validator validator);

    /**
     * Описание действия.
     *
     * @return Описание.
     */
    String intro();

    /**
     * Ключ.
     *
     * @return ключ.
     */
    int key();
}
