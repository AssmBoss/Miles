public class Main {
    public static void main(String[] args) {
        // переменные для входных данных и параметров программы:
        int ticketCost = 600; //для хранения стоимости билета
        int oneBonusMileCost = 20; //для хранения количества рублей для одной бонусной мили

        if (ticketCost < 0) // проверка, что стоимость билета не отриц.число
        {
            System.out.println("Ошибка: введена отрицательная стоимость билета");
            System.exit(0); // Terminates JVM
        }
        if (oneBonusMileCost <= 0) //проверка, что кол-во рублей для одной бонусной мили не 0 и не отрицательное число
        {
            System.out.println("Ошибка: введена отрицательное или нулевое кол-во рублей для одной бонусной мили");
            System.exit(0); // Terminates JVM
        }
        int bonusMiles = ticketCost / oneBonusMileCost; // Рассчитывается количество бонусных миль, ответ сохраняется в новую переменную и
        System.out.println("Вам полагается бонусных миль: " + bonusMiles); // Ответ выводится на экран
    }
}
