package lab.tpo;

public class Arctg {
    public static double calculate(double x, int terms) {
        if (Math.abs(x) > 1) {
            throw new IllegalArgumentException("|x| must be bigger or equal to one");
        }
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            result += Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / (2 * n + 1);
        }
        return result;
    }
}