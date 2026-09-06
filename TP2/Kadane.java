package formationjava;

public class Kadane {

    public static int maxSubarraySum(int[] t) {
        int currentSum = t[0];
        int maxSum = t[0];

        for (int i = 1; i < t.length; i++) {

            if (t[i] > currentSum + t[i]) {
                currentSum = t[i];
            } else {
                currentSum = currentSum + t[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {-1, -2, -3};
        int[] t4 = {5};
        int[] t5 = {-7};
        int[] t6 = {-2, -1, 3, 4, -5};
        int[] t7 = {1, -1, 1, -1, 1};

        System.out.println("test 1 : " + maxSubarraySum(t1));
        System.out.println("test 2 : " + maxSubarraySum(t2));
        System.out.println("test 3 : " + maxSubarraySum(t3));
        System.out.println("test 4 : " + maxSubarraySum(t4));
        System.out.println("test 5 : " + maxSubarraySum(t5));
        System.out.println("test 6 : " + maxSubarraySum(t6));
        System.out.println("test 7 : " + maxSubarraySum(t7));
    }

}