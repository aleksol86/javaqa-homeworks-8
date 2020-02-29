public class MainV1 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass  = 90;
        int height = 2;
        int bMI = service.calculate(bodyMass);
        System.out.println(bMI);
    }
}
