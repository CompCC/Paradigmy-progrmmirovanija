package timer;

import timer.model.Stopwatch;
import timer.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("stopwatch");
        Stopwatch stopwatch = new Stopwatch();
        ConsoleView consoleView = new ConsoleView(stopwatch);
        consoleView.run();

    }
}
