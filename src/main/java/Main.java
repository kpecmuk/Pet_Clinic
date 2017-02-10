/**
 * Pet Clinic education program
 *
 * @author kpecmuk
 * @version 1.0
 * @since 10.02.17
 */
public class Main {

    public static void main(String[] args) {

        Client client = new Client("Boris", new Pet("Barsik","cat"));

        client.getPet().voice();
    }
}
