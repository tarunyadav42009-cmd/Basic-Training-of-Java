public class SimpleAIEngine {

    // A simple function to calculate a moving average (Core ML preprocessing step)
    public static double calculateAverage(double[] prices) {
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum / prices.length; // Returns the mean value
    }

    public static void main(String[] args) {
        // Simulating the last 5 prices of a stock
        double[] priceHistory = { 150.2, 151.5, 152.0, 149.8, 153.1, 131.12, 145.23 };

        double movingAverage = calculateAverage(priceHistory);
        System.out.println(" AI Data Preparation - Moving Average: " + movingAverage);
    }
}