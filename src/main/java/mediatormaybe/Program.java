package mediatormaybe;

public class Program {

    public static void main(String[] args){
        AudioPlayer p = new RecordPlayer(new Turntable());
        p.play();
        p.stop();
        p.rewind();
    }
}
