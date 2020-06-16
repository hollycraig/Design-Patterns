package mvc;

public class Counter implements Runnable{
    private int count = 0;
    private boolean counting = false;
    private Integer ceiling = null;
    private Integer floor = null;
    private boolean reverse = false;
    Observer observer;

    public void setObserver(Observer observer){
        this.observer = observer;
    }


    public void startCounting() {

        counting = true;
        while (counting && checkLimits()) {
            try {
                Thread.sleep(1000);
                count = reverse ? count - 1 : count + 1;

                observer.update();

            } catch (InterruptedException ignored) {}
        }
    }

    public void stopCounting() {
        counting = false;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public void setCeiling(Integer ceiling) {
        this.ceiling = ceiling;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }

    private boolean checkLimits() {
        if (null != ceiling && count >= ceiling) {
            return false;
        }
        if (null != floor && count <= floor) {
            return false;
        }

        return true;
    }

    @Override
    public void run() {
        startCounting();
    }
}