public class Skeleton extends Boss {
    private int arrowsCount;

    public Skeleton(String name, int health, int damage, Weapon weapon, int arrowsCount) {
        super(name, health, damage, weapon);
        this.arrowsCount = arrowsCount;
    }

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Skeleton Arrows Count: " + arrowsCount);
        System.out.println("-----------------------");
    }
}