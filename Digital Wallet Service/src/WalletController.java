public class WalletController {

    public static boolean addMoney(User user, int amount){
        user.getWallet().setAmount(user.getWallet().getAmount()+amount);
        return true;
    }

}
