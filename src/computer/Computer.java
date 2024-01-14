package computer;

/*
Создать класс для описания компьютера, а в этом классе должны быть поля: стоимость,
модель(строковый типа) RAM и HDD.
Для полей RAM и HDD следует создать свое собственные классы.
Классы RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
Класс RAM имеет поля - название и объем.
Класс HDD имеет поля - название, объем и тип(внешний или внутренний).
Класс Computer молжен иметь два конструктора
 - первый - с параметрами стоимость и модель
 - второй - со всеми полями
При создание объекта компьютер с помощью первого конструктора должны создаваться поля RAM и HDD
с помощью конструктора по умолчанию
В каждом из классов предусмотреть методы для вывода полной информации(вывод всех полей и значений)
Тестовый сценарий для проверки:
 - создать объект компьютер1 с помощью первого конструктора и вывести информацию на экран
 - создать объект компьютер2 с помощью второго конструктора и вывести информацию на экран
 */

public class Computer {
    private String model;
    private int price;

    private HDD hdd;
    private RAM ram;
    public Computer(String model, int price,RAM ram, HDD hdd) {
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
    }
    public Computer( String model,int price) {
        this(model,price,new RAM(),new HDD());
    }

    public void showInfo() {
        System.out.println("Name " + hdd.name + " Capacity " + hdd.memory + " Type " + hdd.type);
        System.out.println("Name " + ram.name + " Storage capacity " + ram.value);
        System.out.println("Model: " + model + " Price " + price);
    }
}
