public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 180;
        int height = 180;

        int MyImt = service.calculate(weight, height);
        System.out.println(MyImt);
    }
}
