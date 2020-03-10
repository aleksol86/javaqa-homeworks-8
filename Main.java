public class BmiService {
    public long calculate(long weight, long height) {
        long bmi = weight * 10000 / height / height;
        return bmi;
    }
}