package mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 67, 2, 687, 65, 4, 8, 6, 3, 9};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int half = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, half);
        int[] right = Arrays.copyOfRange(arr, half, arr.length);
        return merge(mergeSort(left), mergeSort(right));

    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                result[indexLeft + indexRight] = left[indexLeft];
                indexLeft += 1;
            } else {
                result[indexLeft + indexRight] = right[indexRight];
                indexRight += 1;
            }
        }

        for (int i = indexLeft; i < left.length; i++) {
            result[i + indexRight] = left[i];
        }
        for (int i = indexRight; i < right.length; i++) {
            result[i + indexLeft] = right[i];
        }

        return result;
    }
}
