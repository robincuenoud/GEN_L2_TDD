package java.org.currency;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount ;
        this.currency = currency ;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    public String toString(){
        return amount + " " + currency;
    }

    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend){
        return new Money(amount + addend.amount, currency);
    }

    String currency(){
        return currency;
    }

    public static Money franc(int amount) {

        return new Money(amount, "CHF");
    }

    public static Money dollar(int amount)  {

        return new Money(amount, "USD");

    }



}
