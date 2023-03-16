public class BmiService {
    public int calculate (int weightKg, double heightCm) {
        double index = (weightKg / (heightCm * heightCm));
        return (int) index;
    }
}
