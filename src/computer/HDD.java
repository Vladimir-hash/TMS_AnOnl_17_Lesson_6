package computer;

public class HDD {
    public String name;
    public int memory;
    public String type;

    public HDD(int value, String name, String type) {
        this.memory = value;
        this.name = name;
        this.type = type;

    }
    public HDD() {
//        this.memory = 100;
//        this.name = "Pentium";

    }
    public void showInfo() {
        System.out.println("Name " + name + " Storage capacity " + memory + " Type " + type);
    }
}
