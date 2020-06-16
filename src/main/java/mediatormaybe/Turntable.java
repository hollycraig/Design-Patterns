package mediatormaybe;

public class Turntable implements AudioPlayer {
    @Override
    public void play() {

        System.out.println("playing record");

    }

    @Override
    public void stop() {

        System.out.println("stopping record");

    }

    @Override
    public void rewind() {

        throw new RuntimeException();

    }
}
