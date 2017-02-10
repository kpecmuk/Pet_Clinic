/**
 * Класс питомца, с именем и видом
 * Created by Kpecmuk on 10.02.2017.
 */
public class Pet extends SimplePet {

    public Pet(String petName, String petType, String owner) {
        super(petName,petType,owner);
    }

    public Pet(String petName, String petType) {
        super(petName, petType, "_______");
    }

    public void voice() {
        System.out.println("bark, meow");
    }


}
