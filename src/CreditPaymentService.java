public class CreditPaymentService {
    public int calculate(double proc, int years, int summ) {
        int months = 12 * years;

        double calculatedInterest = proc / 100 / (double) 12;
        double calculateKoef = Math.pow(1 + calculatedInterest, months);
        return (int) ((summ * calculateKoef * calculatedInterest) / (calculateKoef - 1));
    }
}
