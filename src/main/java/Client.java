import java.util.List;

/**
 * Профиль клиента
 * У клиента есть имя и питомец
 *
 * @author kpecmuk
 * @since 10.02.2017
 */
public class Client {

    private String clientName;
    private List pet;

    public Client(String name, Pet pet) {
        this.clientName = name;
        this.pet.add(pet);
    }

    public String getClientName() {
        return clientName;
    }

    public List getPet() {
        return this.pet;
    }
}