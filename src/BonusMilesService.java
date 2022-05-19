public class BonusMilesService {

    public int calculate(int cost) {
        int bonus = cost / 20;
        System.out.println("Сумма покупки: " + cost + " руб.");
        System.out.println("Ваш бонус: " + bonus + " миль");
        return bonus;
    }
}
