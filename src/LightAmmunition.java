public class LightAmmunition implements Ammunition{
    public Armor createArmor() {
        return new LightArmor();
    }
    public Weapon createWeapon() {
        return new LightWeapon();
    }
}
