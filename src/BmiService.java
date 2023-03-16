public class BmiService {
    public int calculate (int weightKg, double heightM) {
        double index = (weightKg / (heightM * heightM));
        return (int) index;
    }
}
