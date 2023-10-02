public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98; // масса тела  в кг;
        double h = 1.87; // рост в метрах;
        double result = service.calculate(m, h);
        System.out.println(result);
    }
}