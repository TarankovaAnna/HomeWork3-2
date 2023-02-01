public class BmiService {
    public int calculate(int weight, int height) {
        int height2 = height * height;
        int imt = (weight * 10_000) / height2;

        return imt;
    }

}
