public class Boss extends GameEntity {
    private String name;
    private Weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(health, damage);
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Name: " + name);
        System.out.println("Boss Health: " + getHealth());
        System.out.println("Boss Damage: " + getDamage());
        System.out.println("Boss Weapon: " + weapon.getName() + " (Type: " + weapon.getType() + ")");
    }
}