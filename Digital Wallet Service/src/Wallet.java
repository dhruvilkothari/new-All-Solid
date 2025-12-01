import java.util.UUID;

public class Wallet {

    private final String id;
    private int amount;
    private final String userId;

    public Wallet(String userId) {
        this.userId = userId;
        this.id = UUID.randomUUID().toString();
        this.amount = 0;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }
}
