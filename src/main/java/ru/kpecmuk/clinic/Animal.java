package ru.kpecmuk.clinic;

/**
 * Класс описывает животного.
 *
 * @author parsentev
 * @since 07.04.2015
 */
public class Animal implements Pet {
    private String name;
    private int id;

    public Animal(final String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.getName();
    }
}
