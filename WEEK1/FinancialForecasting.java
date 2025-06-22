public class FinancialForecasting 
{

    // Recursive method to calculate future value
    public static double calculateFutureValueRecursive(double presentValue, double rate, int years)
     {
        if (years == 0) 
        {
            return presentValue; // Base case
        }
        return (1 + rate) * calculateFutureValueRecursive(presentValue, rate, years - 1);
    }

    // Iterative method to calculate future value (optimized)
    public static double calculateFutureValueIterative(double presentValue, double rate, int years) 
    {
        double futureValue = presentValue;
        for (int i = 1; i <= years; i++) 
        {
            futureValue *= (1 + rate);
        }
        return futureValue;
    }

    public static void main(String[] args)
     {
        // Input values
        double presentValue = 10000.0; 
        double rate = 0.08;            
        int years = 5;                

        // Calculate using recursion
        double futureRecursive = calculateFutureValueRecursive(presentValue, rate, years);
        System.out.printf("Future Value using Recursion after %d years: ₹%.2f\n", years, futureRecursive);

        // Calculate using iteration
        double futureIterative = calculateFutureValueIterative(presentValue, rate, years);
        System.out.printf("Future Value using Iteration after %d years: ₹%.2f\n", years, futureIterative);
    }
}
