package ch.iterial.recrutment.java.expressions;

public class Literal implements Expression {
    private final int value;

    public Literal(int value) {
       this.value = value;
    }

    public String format(){
        return String.valueOf(value);
    }

    @Override
    public String toString() {
        return format();
    }

    public int calculate() {
        return value;
    }
}
