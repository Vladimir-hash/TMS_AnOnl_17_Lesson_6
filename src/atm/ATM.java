package atm;

/*
    2. Создать класс, описывающий банкомат.
    Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
    количеством купюр номиналом 20, 50 и 100.
    Сделать метод для добавления денег в банкомат.
    Сделать функцию, снимающую деньги, которая принимает сумму денег,
    а возвращает булевое значение - успешность выполнения операции.
    При снятии денег функция должна распечатывать каким количеством
    купюр какого номинала выдаётся сумма.
    Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class ATM {
    int value;
    private int money20;
    private int money50;
    private int money100;

    public ATM(int money20, int money50, int money100) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    public void addMoney(int money20, int money50, int money100) {
        this.money20 += money20;
        this.money50 += money50;
        this.money100 += money100;
    }
    public boolean removeMoney (int value) {
        int money100 = value/100;
        int count100 = (money100 > this.money100) ? this.money100 : money100;
        value -= count100 *100;

        int money50 = value/50;
        int count50 = (money50 > this.money50) ? this.money50 : money50;
        value -= count50 *50;

        int money20 = value/20;
        int count20 = (money20 > this.money20) ? this.money20 : money20;
        value -= count20 *20;

        if (value == 0) {
            System.out.println("100 " +count100);
            System.out.println("50 " +count50);
            System.out.println("20 " +count20);
            return true;
        } else {
            return false;
            }
    }
}
