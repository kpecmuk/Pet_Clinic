/**
 * Класс питомца, с именем и видом
 * Created by Kpecmuk on 10.02.2017.
 */
public class Pet {
    private final String petName;
    private final String petType;
    private String owner;

    public Pet(String petName, String petType, String owner) {
        this.petName = petName;
        this.petType = petType;
        this.owner = owner;
    }

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;
        this.owner = "_______";
    }
    
    public void voice() {
        System.out.println("bark, meow");
    }

    public String getPetName() {
        return this.petName;
    }

    public String getPetType() {
        return this.petType;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
