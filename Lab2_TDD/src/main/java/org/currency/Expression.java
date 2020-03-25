package org.currency;

public interface Expression {
    Money reduce(String to);
}
