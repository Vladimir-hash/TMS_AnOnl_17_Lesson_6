package creditCard;

// 1. Создать класс Credit Card с полями: номер счета текущая сумма на счету.
// Добавьте метод, который позволяет начислять сумму на кредитную карту.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
// Добавьте метод, который выводит текущую информацию о карточке.
// Напишите программу которая создает три объекта класса CreditCard у которых
// заданы номер счета и начальная сумма.
// Тестовый сценанирий для проверки:
//     Положите деньги на первые две карточки и снимите с третьей.
//     Выведите на экран текущее состояние всех трех карточек.

public class CreditCard {
    int accountNumber ;
    int currentCash;
    public CreditCard(int accountNumber, int currentCash) {
        this.accountNumber = accountNumber;
        this.currentCash = currentCash;
    }

    public void addCash(int sum) {
        this.currentCash += sum;
        System.out.println("You're current balance: " + this.currentCash);
    }
    public void wasteCash(int sum) {
        this.currentCash -= sum;
        System.out.println("You're current balance: " + this.currentCash);
    }
    public void updatedPurse() {
       System.out.println( "\n" + "Account number: " + this.accountNumber + " \n Current balance: " + this.currentCash + "\n");
    }

}
