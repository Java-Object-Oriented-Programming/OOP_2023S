package L05.Exception;

class A {
}

public class ExceptionTest extends A {

    //Logic Exception
    double pow(int base, int exp) {
        return Math.pow(base, exp);
    }

    //run-time Exception
    void run() {
        ExceptionTest e = new ExceptionTest();
        A a = new A();
        ((ExceptionTest) a).run();
    }

    //Comp Exception
    void Comp() {
//        ExceptionTest e = new A();
    }


    static void exp() throws Exception{

        if(true){
            throw new ArithmeticException();
        }

    }
    public static void main(String[] args) throws Exception {

        ExceptionTest exceptionTest = new ExceptionTest();
        System.out.println(exceptionTest.pow((int) 2.5, 2));
//        exceptionTest.run();

        exp();

    }

}
