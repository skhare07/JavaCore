package JavaPractice.AbstractionConcept;
//main method inside abstract class
abstract class Demo {
    abstract void m1();
    public static void main(String[] args) {

    }
}
class Demo1 extends Demo{
    @Override
    void m1() {
        System.out.println("Message 1");
    }
    public static void main(String[] args) {
        new Demo1().m1();
    }
}
//practice 2-Constructor inside abstract class
abstract class TestA{
    TestA(){
        System.out.println("Abstract class constructor");
    }
    abstract void m1();
}
class TestB extends TestA{
    @Override
    void m1() {
        System.out.println("m1 method");
    }
    TestB(){
        super();
        System.out.println("Normal class constructor");
    }
    public static void main(String[] args) {
   new TestB().m1();
    }
}
//practice 3 - instance block and static block inside abstract class
abstract class TestC{
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("Static block");
    }
}
class TestD extends TestC{
    public static void main(String[] args) {
        TestD t = new TestD();
    }
}