package lecture1;

public class Main {
    public static void main(String[] args) {
        JavaMoney money = new JavaMoney(1000L);
        JavaMoney money1 = money;
        JavaMoney money2 = new JavaMoney(1000L);

        System.out.println(money1 == money2);
        System.out.println("money2.equals(money) = " + money2.equals(money));
        System.out.println(money.plus(money2));
    }
}
