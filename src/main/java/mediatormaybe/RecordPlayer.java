package mediatormaybe;

public class RecordPlayer implements AudioPlayer {
    private Turntable t;

    public RecordPlayer(Turntable t){
        this.t = t;

    }
    @Override
    public void play() {
        t.play();

    }

    @Override
    public void stop() {
        t.stop();
    }

    @Override
    public void rewind() {
        try{
            t.rewind();
        }
        catch(RuntimeException ex){
            System.out.println("cannot rewind, set stylus to beginning");
        }
    }
}
