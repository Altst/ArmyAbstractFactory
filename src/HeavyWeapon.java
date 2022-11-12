import java.util.Scanner;

public class HeavyWeapon implements Weapon{
    Scanner in = new Scanner(System.in);
    public void fight(){
        System.out.print("Вы хотите использовать щит?\n1 - Да\n2 - Нет\nВвод: ");
        int check = in.nextInt();
        if(check == 1){
            System.out.println("Вы выбрали спата со скутумом");
        }
        else {
            System.out.println("Вы выбрали спата");
        }
    }
}
