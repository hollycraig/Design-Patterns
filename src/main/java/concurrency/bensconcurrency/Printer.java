package concurrency.bensconcurrency;

public class Printer {
    private String prefix;
    private int count;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void print() {
        System.out.println(String.format("%s %d", prefix, count));
    }
}