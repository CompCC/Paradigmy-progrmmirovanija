import java.util.Arrays;

public class SearchDeclarativ {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 2;
        System.out.println((Arrays.binarySearch(array, target) >= 0));
    }
}
