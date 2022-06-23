public class Main {
    public static void main(String[] args) {

        int ticketCost = 40;
        int oneBonusMileCost = 20;
        boolean isOk = true;

        if (ticketCost < 0) {
            System.out.println("Ошибка: введена отрицательная стоимость билета");
            isOk = false;
        }
        if (oneBonusMileCost <= 0) {
            System.out.println("Ошибка: введена отрицательное или нулевое кол-во рублей для одной бонусной мили");
            isOk = false;
        }
        if (isOk) {
            int bonusMiles = ticketCost / oneBonusMileCost;
            System.out.println("Вам полагается бонусных миль: " + bonusMiles);
        }
    }
}
