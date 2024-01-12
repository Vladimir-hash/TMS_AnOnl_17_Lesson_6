import creditCard.CreditCard;


public class Main {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(632362,100);
        CreditCard secondCard = new CreditCard(823298,150);
        CreditCard thirdCard = new CreditCard(382783,300);

        firstCard. updatedPurse();
        secondCard. updatedPurse();
        thirdCard. updatedPurse();

        firstCard.addCash(15);
        secondCard.addCash(5);
        thirdCard.wasteCash(50);

        firstCard.updatedPurse();
        secondCard.updatedPurse();
        thirdCard.updatedPurse();
    }
}