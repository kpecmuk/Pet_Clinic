/**
 * Общие параметры для любого питомца
 *
 * @author Kpecmuk
 * @since 10.02.17
 */
public class Animal {
    private final String petType;

    public Animal(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return this.petType;
    }
}
