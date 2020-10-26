package ch.iterial.recrutment.java.expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiply implements Expression {
    List<Expression> elements = new ArrayList<>();

    public Multiply(Expression... expressions) {
        Arrays.stream(expressions).forEach(elements::add);
    }

    @Override
    public int calculate() {
        if (elements.isEmpty())
            return 0;
        int result = elements.get(0).calculate();
        for (int index = 1; index < elements.size(); index++)
            result *= elements.get(index).calculate();
        return result;
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder("(*");
        elements.forEach(x -> sb.append(" " + x.format()));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toString() {
        return format();
    }
}
