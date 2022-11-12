public class Soldier {
    private Armor armor;
    private Weapon weapon;
    public Soldier(Ammunition ammunition){
        armor = ammunition.createArmor();
        weapon = ammunition.createWeapon();
    }
    public void fight(){
        armor.fight();
        weapon.fight();
    }
}