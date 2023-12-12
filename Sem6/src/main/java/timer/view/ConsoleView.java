package timer.view;

import timer.model.Stopwatch;

import java.util.Scanner;

public class ConsoleView {
    private Stopwatch stopwatch;

    private Scanner scanner;

    public ConsoleView(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public void run() {
        System.out.println("Секундомер");
        stopwatch.start();
        System.out.println("Прошло " + stopwatch.printCurrentTime() / 1000 + "секунд");
    }
}
