public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 79;
        double height = 1.77;
        double bodyMassIndex = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела: " + bodyMassIndex);


    }
}
