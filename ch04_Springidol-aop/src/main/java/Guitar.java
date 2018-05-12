import static java.lang.Thread.sleep;

public class Guitar implements Instrument {
    public void play() {
        try{
            sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("play Strum strum strum");
    }
}
