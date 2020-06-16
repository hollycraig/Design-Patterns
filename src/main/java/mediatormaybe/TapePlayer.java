package mediatormaybe;

public class TapePlayer implements AudioPlayer{


    @Override
    public void play() {

        System.out.println("playing tape");

    }

    @Override
    public void stop() {

        System.out.println("stopping tape");

    }

    @Override
    public void rewind() {

        System.out.println("rewinding tape");

    }
}
