package ch.iterial.recrutment.java.expressions;

public class ExpressionFactory {

    public static Expression literal(final int value) {
        //throw new UnsupportedOperationException();
        return new Literal(value);
    }

    public static Expression add(final Expression... expressions) {
        //throw new UnsupportedOperationException();
        return new Sum(expressions);
    }

    public static Expression multiply(final Expression... expressions) {
        //throw new UnsupportedOperationException();
        return new Multiply(expressions);
    }

}
