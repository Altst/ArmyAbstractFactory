public class MidAmmunition implements Ammunition{

    public Armor createArmor() {
        return new MidArmor();
    }

    public Weapon createWeapon() {
        return new MidWeapon();
    }
}
