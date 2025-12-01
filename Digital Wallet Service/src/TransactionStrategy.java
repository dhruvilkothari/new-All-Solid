public interface TransactionStrategy {
    public boolean pay(User from, User to, int amount);
}
