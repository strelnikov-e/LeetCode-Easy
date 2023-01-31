public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = min;
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = min;
            } else if (prices[i] > max) {
                max = prices[i];
            }
            if ((max - min) > res) res = max - min;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Max profit: " + maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println("Max profit: " + maxProfit(new int[] {7,6,4,3,1}));
        System.out.println("Max profit: " + maxProfit(new int[] {2,4,1}));
    }
}
