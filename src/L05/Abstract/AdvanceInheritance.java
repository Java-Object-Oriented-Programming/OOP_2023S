package L05.Abstract;

interface I {

    void func1();

    void func2();

    void func3();

}

public abstract class AdvanceInheritance implements I {


    protected static int b;
    int a;

    abstract void func();

    public void func1() {

    }

    public void func2() {
    }

    public void func3() {
    }

    public AdvanceInheritance() {
        System.out.println("Hello AdvanceInheritance");
    }
}


class TestAdvInheritance extends AdvanceInheritance {

    @Override
    void func() {

    }

    public TestAdvInheritance() {
        System.out.println("Hello TestAdvInheritance");
    }
}


class TestInheritance {


    public static void main(String[] args) {
//        I i = new I();
//        AdvanceInheritance a = new AdvanceInheritance();
        System.out.println("Hello");

        TestAdvInheritance tai = new TestAdvInheritance();
//        TestInheritance.main(new String[]{});
    }


}
