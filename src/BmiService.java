public class BmiService {

    public int calculate(double height, double weight) {
        int index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}
