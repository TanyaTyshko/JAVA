public class JAVA {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;

        int bonus = refill / 100;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int amount = balance + refill + bonus;
        System.out.println("Итоговый бонус:" + bonus);
        System.out.println("Итоговый счет:" + amount);
    }
}
