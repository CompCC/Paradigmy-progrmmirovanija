import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Контекст
 * Есть такая операция в статистике - “нормализация”. Это операция принимающая на вход вектор и
 * возвращающая другой вектор. Смысл этой операции в том, чтобы данные из разных шкал загнать в
 * единый диапазон, как правило - от 0 до 1, тогда с данными становится проще работать.
 * ● Ваша задача
 * Реализовать с использованием функциональной парадигмы процедуру normalization, которая выполняет
 * нормализацию полученного массива по приведенной формуле нормализованного значения элемента, где
 * ○ x_norm - нормализованное значение элемента
 * ○ x - исходное значение элемента
 * ○ x_max, x_min - максимальное и минимальное значение в массиве
 */

public class Normaliz {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8);
        System.out.println(Arrays.toString(normalization(arr)));

    }

    public static double[] normalization(ArrayList<Integer> arr) {
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        double[] newArr = new double[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newArr[i] = (double) (arr.get(i) - max) / (max - min);
        }
        return newArr;
    }
}
