public class SQRT {

    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int root = 0;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (x/mid == mid) return mid;
            else if (x/mid > mid) low = mid + 1;
            else {
                high = mid - 1;
                root = mid - 1;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        SQRT sqrt = new SQRT();
        System.out.println(sqrt.mySqrt(8));
    }

}
