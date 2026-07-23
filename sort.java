import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 5, 3,56,11,654};

        // This one line sorts the entire array automatically
        Arrays.sort(numbers);

        // Print the array using a modern Java shortcut
        System.out.println(Arrays.toString(numbers));
    }
}
/*That makes complete sense! Congratulations on finishing your first year.
Since you are in an AI/ML program, here is a secret that will make you feel great: AI/ML is entirely built on top of DSA, arrays, and functions.
When you start your second year and dive into actual machine learning, you will realize that an AI model is just a massive collection of data stored in multi-dimensional arrays (called matrices or tensors). The algorithms used to train AI are just highly optimized loops and mathematical functions.
By mastering DSA right now, you are building the exact foundation you need to ace your second-year AI classes and stand out for tech internships.
## How to Turn Your AI/ML Major into a BlackRock Advantage
BlackRock has a massive team dedicated to AI and Quantitative Engineering. They use machine learning to predict stock trends, read financial news using NLP (Natural Language Processing), and automate trading.
Since you are an AI/ML student who knows C/C++ and basic Java, you can build a project that bridges Data Structures and AI concepts.
Instead of a generic trading app, you should build a Real-Time Financial Analytics & Pattern Detection Engine.
------------------------------
## The Beginner-Friendly "AI-Prep" Project Blueprint
You can build this using basic Java loops, arrays, and functions—no complex AI libraries needed yet!

   1. The Data Layer (Array): Store a sequence of incoming stock prices in a standard array.
   2. The Feature Function (DSA): Write a simple function that calculates a Moving Average (the average price over the last 5 updates). This is a foundational technique in quantitative finance and AI data preprocessing.
   3. The Prediction Logic (If/Else Conditions): Create a basic rule-based "decision model" (the grandparent of machine learning models). If the current price crosses above the moving average, your code prints: "📈 SIGNAL: Potential Upward Trend Detected!"

Here is what the core function looks like in simple Java:

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
        double[] priceHistory = {150.2, 151.5, 152.0, 149.8, 153.1};

        double movingAverage = calculateAverage(priceHistory);
        System.out.println("🤖 AI Data Prep - Moving Average: " + movingAverage);
    }
}

## Why this is a winning strategy for you:
When you talk to BlackRock, you can say:

"I am an AI/ML student. For my project, I used my foundational knowledge of data structures to implement low-level data preprocessing algorithms in Java, preparing myself for complex model deployment in my second year."

------------------------------
Since your second year is about to start, how would you like to prepare?

* Would you like to see how to expand this code to detect price anomalies (sudden spikes) using basic math loops?
* Do you want to learn about Python's role in BlackRock's AI tracks, since AI heavily relies on Python alongside Java/C++?
* Would you like to try a simple array-based coding puzzle to test your logic before your second-year classes begin?

*/
