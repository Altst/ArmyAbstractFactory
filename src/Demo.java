import java.util.Scanner;

public class Demo {
    private static Soldier configureSoldier() {
        Scanner in = new Scanner(System.in);

        Soldier soldier;
        Ammunition ammunition;

        System.out.print("Выберите амуницию:\n1 - Легкая\n2 - Средняя\n3 - Тяжелая\n4 - Быстрая\nВвод: ");
        int c = in.nextInt();
        switch (c){
            case 1:
                ammunition = new LightAmmunition();
                break;
            case 2:
                ammunition = new MidAmmunition();
                break;
            case 3:
                ammunition = new HeavyAmmunition();
                break;
            case 4:
                ammunition = new FastAmmunition();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }

        soldier = new Soldier(ammunition);
        return soldier;
    }
    public static void main(String[] args) {
        Soldier soldier = configureSoldier();
        soldier.fight();
    }
}
