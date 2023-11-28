public class SearchImperativ {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 2;
        boolean res;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Искомое число находится в массиве по индексу: " + i);
                break;
            } else {
                System.out.println("Искомого числа нет в массиве.");
            }
        }

    }
}
