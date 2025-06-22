public class Main {
    public static void main(String[] args) {
        double currentValue = 10000;
        double annualGrowthRate = 0.08;
        int years = 5;

        System.out.println("Recursive Financial Forecasting\n");
        double futureValue = calculateFutureValueRecursive(currentValue, annualGrowthRate, years);
        System.out.printf("Future Value after "+years+": %.2f",futureValue);

    }

    public static double calculateFutureValueRecursive(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return (1 + rate) * calculateFutureValueRecursive(currentValue, rate, years - 1);
    }

}
