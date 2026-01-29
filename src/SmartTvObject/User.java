package SmartTvObject;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeUp();

        smartTv.changeChanel(13);

        System.out.println("TV on? "+smartTv.on);
        System.out.println("Chanel? "+smartTv.chanel);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.onn ();
        System.out.println("New status -> TV on? "+smartTv.on);

        smartTv.off ();
        System.out.println("New status -> TV on? "+smartTv.on);
    }
}
