import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int pointer = digits.length - 1;

        while (pointer >= 0) {
            if (digits[pointer] == 9) {
                digits[pointer--] = 0;
            } else {
                digits[pointer]++;
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {

        PlusOne plusOne = new PlusOne();

        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 9})));
    }
}
