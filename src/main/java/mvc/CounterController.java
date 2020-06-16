package mvc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterController implements Observer{
    private Counter model;
    private CounterView view;
    ExecutorService executor = Executors.newFixedThreadPool(5);

    public CounterController(Counter model, CounterView view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);

    }
    @Override
    public void update() {
        executor.execute(model);
    }
}
