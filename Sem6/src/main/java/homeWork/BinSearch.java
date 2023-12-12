/**
 * ● Контекст
 * Предположим, что мы хотим найти элемент в массиве (получить
 * его индекс). Мы можем это сделать просто перебрав все элементы.
 * Но что, если массив уже отсортирован? В этом случае можно
 * использовать бинарный поиск. Принцип прост: сначала берём
 * элемент находящийся посередине и сравниваем с тем, который мы
 * хотим найти. Если центральный элемент больше нашего,
 * рассматриваем массив слева от центрального, а если больше -
 * справа и повторяем так до тех пор, пока не найдем наш элемент.
 * ● Ваша задача
 * Написать программу на любом языке в любой парадигме для
 * бинарного поиска. На вход подаётся целочисленный массив и
 * число. На выходе - индекс элемента или -1, в случае если искомого
 * элемента нет в массиве.
 */

package homeWork;

import java.util.Arrays;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(Arrays.toString(binSearch(arr, 1)));
        System.out.println(binarySearch(arr,15));

    }

    public static int binarySearch(int[] arr, int findNum) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int result = -1;


        while (firstIndex <= lastIndex) {
            int halfIndex = (firstIndex + lastIndex) / 2;
            if (arr[halfIndex] > findNum) {
                lastIndex = halfIndex - 1;
            }
            if (arr[halfIndex] < findNum) {
                firstIndex = halfIndex + 1;
            }
            if (arr[halfIndex] == findNum) {
                result = halfIndex;
                break;
            }
        }
        return result;
    }
}


//    public static int[] binSearch(int[] arr, int findNum) {
//        if (arr.length == 1) {
//            if (arr[0] == findNum) {
//                return arr;
//            } else {
//                return null;
//            }
//        }
//        return binSearch(search(arr, findNum), findNum);
//    }

//    public static int[] search(int[] arr, int findNum) {
//        int[] result = new int[arr.length / 2];
//        int halfIndex = arr.length / 2;
//        if (findNum < arr[halfIndex]) {
//            result = Arrays.copyOfRange(arr, 0, halfIndex);
//        } else if (findNum >= arr[halfIndex]) {
//            result = Arrays.copyOfRange(arr, halfIndex, arr.length);
//        }
//        return result;
//    }

