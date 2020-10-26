package ch.iterial.recrutment.java.expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum implements Expression {
    List<Expression> expression = new ArrayList<>();

    public Sum(Expression ... elements) {
        Arrays.stream(elements).forEach(expression::add);
    }
    @Override
    public int calculate() {
        return expression.stream().collect(Collectors.summingInt(x -> x.calculate()));
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder("(+");
        expression.forEach(x -> sb.append(" " + x.format()));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toString() {
        return format();
    }
}
