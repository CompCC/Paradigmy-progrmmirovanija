import java.util.ArrayList;
import java.util.Collections;


public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 2, 3, 4, 5, 3, 6, 6);
        System.out.println(dubl(arr));
    }

    public static ArrayList<Integer> dubl(ArrayList<Integer> arr) {
        ArrayList<Integer> arrTrim = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.contains(arr.get(i))) {
                arrTrim.add(arr.get(i));
            }
        }
        return arrTrim;

    }
}
