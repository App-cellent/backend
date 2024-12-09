package javaStudy;

public class BizService {
    public void bizMethod(int i) throws BizException{
        System.out.println("start business method");

        if(i < 0)
            throw new BizException("매개변수 i는 0 이상이어야 합니다.");
        System.out.println("end business method");
    }
}
