public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; //Рост
        int weight = 98; //Вес

        double index = (int) (service.calculate(height, weight));
        System.out.println("Масса тела = " + Math.round(index));
    }
}
