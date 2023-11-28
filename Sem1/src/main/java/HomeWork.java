import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 5, 9, 42, 4, 8, 9, 2};
        System.out.println(Arrays.toString(sortArrayImperative(numbers)));
        System.out.println(Arrays.toString(sortArrayDeclarative(numbers)));
    }

    public static int[] sortArrayImperative(int[] arr) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArrayDeclarative(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
