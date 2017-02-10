/**
 * Профиль клиента
 * У клиента есть имя и питомец
 *
 * @author kpecmuk
 * @since 10.02.2017
 */
public class Client {

    private String clientName;
    private Pet pet;

    public Client(String name, Pet pet) {
        this.clientName = name;
        this.pet = pet;
    }

    public String getClientName() {
        return clientName;
    }

    public Pet getPet() {
        return this.pet;
    }
}