public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.87; // рост
        double weight = 98; // вес
        int index = service.calculate(height, weight);
        System.out.println(" Масса " + index + " кг ");


    }
}
