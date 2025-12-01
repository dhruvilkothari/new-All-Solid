import java.util.UUID;

public class User {
    private final String id;
    private final String name;
    private final Wallet wallet;

    public User(String name){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        wallet = new Wallet(this.id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
