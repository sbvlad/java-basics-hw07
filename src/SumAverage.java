/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i < upperBound + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        double sum = 0;
        int count = 0;
        while (lowerBound < upperBound + 1) {
            sum += lowerBound;
            count++;
            lowerBound++;
        }
        return sum / count;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        double sum = 0;
        int count = 0;
        do {
            sum += numbers[count];
            count++;
        } while (count < numbers.length);
        return sum / count;
    }
}