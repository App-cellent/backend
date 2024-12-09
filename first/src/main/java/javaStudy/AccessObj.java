package javaStudy;

public class AccessObj {
    public int p = 3;  // 모든 접근을 허용. 가장 넓은 의미
    protected int p2 = 4;  // 같은 패키지인 경우 접근 허용 + 다른 패키지 중 상속받은 패키지
    int k = 2; // 디폴트(defualt) 접근 지정자. 자기 자신과 같은 패키지만 접근 가능
    private int i = 1; // 자기 자신만 접근 가능
}
