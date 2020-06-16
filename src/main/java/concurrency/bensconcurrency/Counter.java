package concurrency.bensconcurrency;

public class Counter implements Runnable {
    private String prefix;
    private int start;
    private int finish;
    private boolean reverse;
    private final Printer printer;

    public Counter(String prefix, int start, int finish, boolean reverse, Printer printer) {
        if (null == prefix || null == printer || finish < start) {
            throw new IllegalArgumentException();
        }
        this.prefix = prefix;
        this.start = start;
        this.finish = finish;
        this.reverse = reverse;
        this.printer = printer;
    }

    @Override
    public void run() {
        if (reverse) {
            for (int i = finish; i >= start; i--) {
                synchronized (printer) {
                    printer.setCount(i);
                    printer.setPrefix(prefix);
                    printer.print();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = start; i <= finish; i++) {
                synchronized (printer) {
                    printer.setCount(i);
                    printer.setPrefix(prefix);
                    printer.print();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}