package SmartTvObject;

    public class SmartTv {
        boolean on = false;
        int chanel = 1;
        int volume = 25;

    public void ChanelUp(){
        ++chanel;
    }
    public void ChanelDown(){
       --chanel;
    }
    public void changeChanel(int newChanel){
        chanel = newChanel;
    }
    public void volumeUp(){
        ++volume;
    }
    public void volumeDown(){
        --volume;
    }
    public void onn(){
        on = true;
    }
    public void off(){
        on = false;
    }
}
