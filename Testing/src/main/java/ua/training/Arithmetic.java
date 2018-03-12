package ua.training;

public class Arithmetic {
    public double add(double var0, double var1) {
        return var0 + var1;
    }

    public double deduct(double var0, double var1) {
        return var0 - var1;
    }

    public double multiply(double var0, double var1) {
        return var0 * var1;
    }

    public double divide(double var0, double var1) {
        if (var1 == 0.0) {
            throw new IllegalArgumentException();
        }
        return var0 / var1;
    }
}

