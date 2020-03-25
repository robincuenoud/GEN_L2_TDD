package org.currency;

public interface Expression {
    Money reduce(Bank bank, String to);
}
