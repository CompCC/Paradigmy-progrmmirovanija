import java.util.Arrays;

public class RatioNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 0, -3, -4, 2};
        System.out.println(Arrays.toString(RatioImperativ(arr)));
    }

    public static double[] RatioImperativ(int[] arr) {
        double[] res = new double[3];
        if (arr.length == 0) {
            return res;
        }
        int tempPos = 0;
        int tempZero = 0;
        int tempNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                tempPos = tempPos + 1;
            }
            if (arr[i] == 0) {
                tempZero = tempZero + 1;
            }
            if (arr[i] < 0) {
                tempNegative = tempNegative + 1;
            }
        }
        res[0] = (double) tempPos / arr.length * 100;
        res[1] = (double) tempZero / arr.length * 100;
        res[2] = (double) tempNegative / arr.length * 100;
        return res;
    }
}
