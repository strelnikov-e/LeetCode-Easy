public class ClimbStairs {

    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        return climbStairs(n, cache);
    }

    private int climbStairs(int n, int[] cache) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (cache[n] != 0) return cache[n];

        cache[n] = climbStairs(n-1, cache) + climbStairs(n-2, cache);
        return cache[n];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();

        System.out.println(climbStairs.climbStairs(3));
        System.out.println(climbStairs.climbStairs(5));
        System.out.println(climbStairs.climbStairs(8));
        System.out.println(climbStairs.climbStairs(20));
    }
}
