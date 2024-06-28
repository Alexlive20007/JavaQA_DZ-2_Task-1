//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int price = 12000;
        System.out.println("Стоимость билета = " + price);
        int bonus = 20;
        System.out.println("За каждые " + bonus + " рублей потраченные на билет, начисляется 1 бонус");
        int totalBonus = price / bonus;
        System.out.println("Итого бонусов = " + totalBonus);
    }
}