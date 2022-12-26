package JavaPractice.InterfaceConcept;

interface It1{
    void m1();
}
interface It2 extends It1 {
    void m2();
}
interface It3 extends It2{
    void m3();
}
class Test implements It3{
    //all 3 methods should be implemented
    @Override
    public void m1() {
        System.out.println("m1 method");
    }
    @Override
    public void m2() {
        System.out.println("m2 method");
    }
    @Override
    public void m3() {
        System.out.println("m3 method");
    }
    public static void main(String[] args) {
    Test t = new Test();
    t.m1();
    t.m2();
    t.m3();
    }
}
