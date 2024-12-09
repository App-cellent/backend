package javaStudy;

public class BizException extends RuntimeException{
    public BizException(String msg){
        super(msg);
    }
    public BizException(Exception ex){
        super(ex);
    }
}
