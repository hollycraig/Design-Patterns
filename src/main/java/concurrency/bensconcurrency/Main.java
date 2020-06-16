package concurrency.bensconcurrency;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Runnable counterA = new Counter("Deadlocks avoided:", 0, 100, false, printer);
        Runnable counterB = new Counter("Threads starved:", 0, 100, true, printer);
        Thread[] threads = new Thread[] {
                new Thread(counterA),
                new Thread(counterB)
        };
        for (Thread thread: threads) {
            thread.start();
        }
    }
}

