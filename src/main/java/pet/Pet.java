package pet;

/**
 * Класс питомца, с именем и видом
 *
 * @author Kpecmuk
 * @since 10.02.17
 */
public class Pet extends Animal {
    private String petName = "No Name";
    private String owner = "_______";

    public Pet(String petName, String petType, String owner) {
        super(petType);
        this.petName = petName;
        this.owner = owner;
    }

    public Pet(String petName, String petType) {
        super(petType);
        this.petName = petType;
    }

    public void voice() {
        System.out.println("bark, meow");
    }
}