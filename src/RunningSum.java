import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] a) {
        int[] res = new int[a.length];
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            temp += a[i];
            res[i] = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();

        int[] a = new int[]{2,4,-7,1,8,3};

        System.out.println(Arrays.toString(runningSum(a)));

    }
}
