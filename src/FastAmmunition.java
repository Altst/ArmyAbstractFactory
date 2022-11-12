public class FastAmmunition implements Ammunition{
    public Armor createArmor() {
        return new FastArmor();
    }
    public Weapon createWeapon() {
        return new FastWeapon();
    }
}
