public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightCm = 1.87;
        int bodymassindex = service.calculate(weightKg,heightCm);
        System.out.println(bodymassindex);
    }
}
