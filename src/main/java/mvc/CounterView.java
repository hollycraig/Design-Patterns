package mvc;

public class CounterView implements Observer {
    private Counter model;
    public Observer observer;
    public ViewUtils view;
    ViewUtils viewUtils = new ViewUtils();
    String header = "What would you like to do?";
    String[] options = new String[6];
    String prompt = ">";

    public void setObserver(Observer observer){
        this.observer = observer;
    }

    public CounterView(Counter model) {
        this.model = model;
        this.model.setObserver(this);
        this.view = new ViewUtils();
        options[0] = "Set ceiling";
        options[1] = "Set floor";
        options[2] = "Reverse count";
        options[3] = "Stop count";
        options[4] = "Start count";
        options[5] = "Reset counter";
    }

    public void launch() {


        int selection = view.displayMenu(header, options, prompt);
        switch (selection){
            case 1:
                System.out.println("What would you like to set it to?");
                int ceiling = view.getInt(">", false);
                model.setCeiling(ceiling);
                break;
            case 2:
                System.out.println("What would you like to set it to?");
                int floor = view.getInt(">", true);
                model.setFloor(floor);
                break;
            case 3:
                System.out.println("Reverse the count? Y/N");
                String answer = view.getString(">", false);
                if (answer.equals("Y")) {
                    model.setReverse(true);
                }
                break;
            case 4:
                model.stopCounting();
                break;
            case 5:
                observer.update();
                break;
            case 6:
                model.resetCount();
                break;
        }
        launch();
    }

    @Override
    public void update() {
        System.out.println("Count: " + model.getCount());
    }
}
