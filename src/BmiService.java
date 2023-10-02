public class BmiService {

    public double calculate(int m, double h) {
        double result = (int) (m / (h * h));
        return result;
    }
}
