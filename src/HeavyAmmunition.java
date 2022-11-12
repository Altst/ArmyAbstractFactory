public class HeavyAmmunition implements Ammunition{
    public Armor createArmor() {
        return new HeavyArmor();
    }
    public Weapon createWeapon() {
        return new HeavyWeapon();
    }
}
