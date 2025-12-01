import java.util.List;

public class WalletService {
    private UserController userController;
    private TransactionStrategy transactionStrategy;

    public WalletService(UserController userController, TransactionStrategy transactionStrategy){
        this.userController = userController;
        this.transactionStrategy = transactionStrategy;
    }



    public boolean makePayment(String from, String
                                to, int amount){
        return transactionStrategy.pay(userController.getUserFromId(from), userController.getUserFromId(to),amount);
    }

    public boolean addMoney(String user, int amount){
        return WalletController.addMoney(userController.getUserFromId(user),amount);
    }
}
