package ru.kpecmuk.clinic;

/**
 * Интерфейс описывает животное.
 *
 * @author parsentev
 * @since 16.04.2015
 */
public interface Pet {
    /**
     * ID.
     *
     * @return
     */
    int getId();

    /**
     * ID.
     *
     * @param id
     */
    void setId(int id);

    /**
     * Имя животного.
     *
     * @return
     */
    String getName();

    /**
     * Имя животного.
     *
     * @param name
     * @return
     */
    void setName(String name);
}