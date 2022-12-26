package JavaPractice.AbstractionConcept;

abstract class Test{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class Test1 extends Test{
    @Override
    void m1() {
        System.out.println("Message 1");
    }
}
abstract class Test2 extends Test1{
    @Override
    void m2() {
        System.out.println("Message 2");
    }
}
class Test3 extends Test2{
    @Override
    void m3() {
        System.out.println("Message 3");
    }
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.m1();
        t.m2();
        t.m3();
    }
}
