public class App {
    public static void main(String[] args) throws Exception {
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2023();
    }
}
