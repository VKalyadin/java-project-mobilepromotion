public class Main {
    public static void main(String[] args) {

        int account = 100;
        int addDeposit = 1200;
        int bonus = 1;
        int addBonus;

        if (addDeposit >= 1000) {
            addBonus = addDeposit / 100 * bonus;
        } else {
            addBonus = 0;
        }
        System.out.println("Баланс: " + (account + addDeposit + addBonus));
    }
}