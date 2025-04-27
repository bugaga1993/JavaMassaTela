public class BmiService {

    public int calculate(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        bmi = (double) ((int) (bmi * 100)) / 100;
        return (int) bmi;
    }
}