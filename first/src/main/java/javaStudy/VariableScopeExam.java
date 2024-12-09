package javaStudy;

public class VariableScopeExam {
    int globalScope = 10;
    static int staticValue = 7;

    public void scopeTest(int value){
        int localScope = 20;
        System.out.println(globalScope); // error X
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope); // error X
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
        System.out.println(staticValue);
    }

    public static void main(String[] args){
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        // 모든 클래스는 인스턴스화 하지 않고 사용 불가.
        // static이란 키워드르 붙이면 인스턴스화 하지 않아도 사용할 수 있다.

        System.out.println(staticValue);
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        v1.staticValue = 50;
        v2.staticValue = 100;
        System.out.println(v1.staticValue); // 100
        System.out.println(v2.staticValue); // 100
        // static은 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유.

        System.out.println(VariableScopeExam.staticValue);
        // 이렇게 클래스명에 직접 접근해 사용하는 게 바람직.
    }
}
