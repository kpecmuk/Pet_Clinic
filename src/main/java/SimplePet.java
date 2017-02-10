/**
 * Общие параметры для любого питомца
 * Created by User on 10.02.2017.
 */
public class SimplePet {
    private final String petType;
    private String petName;
    private String owner;

    public SimplePet(String petName, String petType, String owner) {
        this.petName = petName;
        this.petType = petType;
        this.owner = owner;
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
