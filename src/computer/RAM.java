package computer;

public class RAM {
    public String name;
    public int value;

    public RAM(int value, String name) {
        this.value = value;
        this.name = name;

    }
    public RAM() {
//        this.value = 200;
//        this.name = "Intel Cyclope";

    }
    public void showInfo() {
        System.out.println("Name " + name + " Capacity " + value);
    }
}
