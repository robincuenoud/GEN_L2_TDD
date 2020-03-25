package org.currency;

import org.currency.Expression;
import org.currency.Money;

public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
    this.addend = addend;
    this.augend = augend;
    }
    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount,to);
    }
}
