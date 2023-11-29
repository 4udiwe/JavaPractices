public class Calc {
    public <T extends Number> T sum(T a, T b) {
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else {
            throw new IllegalArgumentException("Bad type erorr");
        }
    }
    public <T extends Number> T sub(T a, T b){
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else {
            throw new IllegalArgumentException("Bad type erorr");
        }
    }

    public <T extends Number> T mul(T a, T b){
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else {
            throw new IllegalArgumentException("Bad type erorr");
        }
    }
    public <T extends Number> T div(T a, T b){
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else {
            throw new IllegalArgumentException("Bad type erorr");
        }
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int num2 = 5;
        double num1 = 5.5;
        System.out.println(calc.sum(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.mul(num1, num2));
        System.out.println(calc.div(num1, num2));
    }
}
