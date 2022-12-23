package JavaPractice;

class Parent {
    int a = 10;
    int b = 20;
    Parent() {
        System.out.println("Parent 0 arg constructor");
    }
    void method() {
        System.out.println("In parent");
    }
}
class Child extends Parent {
    int a = 100;
    int b = 200;
    Child() {
        this(10);         //calling curent
        System.out.println("Child 0 arg Constructor");
    }
    Child(int a) {
        super();                        //calling parent class constructor
        System.out.println("Child 1 arg construcotr");
    }
    void method() {
        super.method();
        System.out.println("In child");
    }
    void add(int a, int b) {
        System.out.println(a + b);         //local
        System.out.println(this.a + this.b);  //current
        System.out.println(super.a + super.b);  //super class variable
    }
    public static void main(String[] args) {
        new Child().add(1000, 2000);
        new Child().method();
        new Child(10);
    }
}
public class InheritancePractice {
    InheritancePractice() {
        System.out.println("Parent 0 arg constructor");
    }

    {
        System.out.println("Parent Instance block");
    }

    static {
        System.out.println("Parent static block");
    }
}
class ChildInheritance extends InheritancePractice {
    ChildInheritance() {
        System.out.println("Child 0 arg constructor");
    }
    {
        System.out.println("Child Instance block");
    }
    static {
        System.out.println("Child static block");
    }

    public static void main(String[] args) {
        new ChildInheritance();
    }
}