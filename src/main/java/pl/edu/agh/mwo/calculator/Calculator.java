package pl.edu.agh.mwo.calculator;

public class Calculator {

    public double sum(double x, double y) {
        return x+y;
    }

    public double sub(double x, double y) {
        return x-y;
    }

    public double mul(double x, double y) {
        return x*y;
    }

    public double div(double i, double v) {
        if( v!=0 ) {
            return i/v;
        } else {
            return null;
        }
    }

    public double avg(int... avgs) {
    }
}
