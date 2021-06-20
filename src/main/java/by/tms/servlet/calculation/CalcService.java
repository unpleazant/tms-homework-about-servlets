package by.tms.servlet.calculation;

public class CalcService {

    public static double calculate(double a, double b, String operation) {
        switch (operation) {
            case "sum":
                return sum(a, b);
            case "sub":
                return sub(a, b);
            case "mul":
                return mul(a, b);
            case "div":
                return div(a, b);
            default:
                return 0;
        }
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double mul(double a, double b) {
        return a * b;
    }

    private static double div(double a, double b) {
        return a / b;
    }

}
