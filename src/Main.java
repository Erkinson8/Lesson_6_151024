public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.BOW, "Excalibur");

        Boss boss = new Boss("Dark Lord", 500, 50, bossWeapon);

        boss.printInfo();
        System.out.println("-----------------------");

        Skeleton skeleton1 = new Skeleton("Gato",150, 30, bossWeapon, 10);
        Skeleton skeleton2 = new Skeleton("Bull", 200, 35, bossWeapon, 15);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}
