public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyYear = service.calculate(9.99, 1, 1_000_000);
        int monthlyTwoYears = service.calculate(9.99, 2, 1_000_000);
        int monthlythreeYears = service.calculate(9.99, 3, 1_000_000);

        System.out.println(monthlyYear);
        System.out.println(monthlyTwoYears);
        System.out.println(monthlythreeYears);
    }
}