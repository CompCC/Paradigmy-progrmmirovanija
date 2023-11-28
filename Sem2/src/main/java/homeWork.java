/**
 * Таблица умножения
 * ● Условие
 *   На вход подается число n.
 * ● Задача
 *   Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
 *   Обоснуйте выбор парадигм.
 *   В данном случае использована императивная парадигма как самая простая и оптимальная для данного случая.
 */



import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "CP866");
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num * i);
        }


    }
}
