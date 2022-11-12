import java.util.Scanner;
public class FastWeapon implements Weapon{
    Scanner in = new Scanner(System.in);
    public void fight(){
        System.out.print("Вы хотите использовать щит?\n1 - Да\n2 - Нет\nВвод: ");
        int check = in.nextInt();
        if(check == 1){
            System.out.println("Вы выбрали копис со скутумом");
        }
        else {
            System.out.println("Вы выбрали копис");
        }
    }
}
