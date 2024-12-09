package javaStudy;

public interface TV {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();
    // 추상클래스에서도 비슷한 형태. abstract를 붙였어야 했는데 여긴 없어도 됨
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
