public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        //проверка
        //int bonus1 = service.calculate(890);
        //System.out.println("ОР: 44, ФР: " + bonus1);

        //int bonus2 = service.calculate(3_000);
        //System.out.println("ОР: 150, ФР: " + bonus2);

        //int bonus3 = service.calculate(3_400);
        //System.out.println("ОР: 170, ФР: " + bonus3);
    }
}