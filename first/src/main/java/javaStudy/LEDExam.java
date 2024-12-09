package javaStudy;

public class LEDExam {
    public static void main(String[] args){
        TV tv = new LEDTV();
        tv.turnOn();
        tv.changeVolume(29);
        tv.changeChannel(8);
        tv.turnOff();
    }
}
