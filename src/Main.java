public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight, height;
        weight = 98;
        height = 1.87;
        int result = service.calculate(weight, height);
        System.out.println(result);
    }
}