public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double kilograms = 98.0;
        double meters = 1.87;

        int bmIndex = service.calculate(kilograms, meters);
        System.out.println("Body mass index: " + bmIndex);
    }
}
