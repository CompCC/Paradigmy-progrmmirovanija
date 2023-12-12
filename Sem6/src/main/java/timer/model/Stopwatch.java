package timer.model;

public class Stopwatch {

    private long mlliseconds;
    private long startTime;
    private boolean isActive = false;

    public void start() {
        isActive = true;
        startTime = System.currentTimeMillis();
    }

    public long stop() {
        isActive = false;
        return System.currentTimeMillis() - startTime;

    }

    public long printCurrentTime() {
        if (isActive){

        }
        return mlliseconds;
    }
}
