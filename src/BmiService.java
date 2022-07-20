public class BmiService {

    public double calculate(int weight, double height){
        double bodyMassIndex = weight / Math.pow(height, 2);
        bodyMassIndex = (double) ((int) (bodyMassIndex * 100)) / 100;
        return bodyMassIndex;

    }
}
