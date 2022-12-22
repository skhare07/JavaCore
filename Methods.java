package JavaPractice;
//passing object as reference



class X{}
class Emp{}
class Y{}
class Student{}


public class Methods {

    void m1(X x, Emp e){
        System.out.println("m1");
    }

    static void m2(Y y, Student s){
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.m1(new X(),new Emp());   //calling instance method

        Methods.m2(new Y(),new Student());  //calling static method

    }
}



class Test{

    int a=10,b=20;
    void m1(int a,int b){

        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }

//    static void m2(int a,int b){
//        System.out.println(this.a+this.b);
//    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1(100,200);
    }

}

//return object
class Students{
    static Students m1(){
        System.out.println("m1 method");
        return new Students();
    }

    public static void main(String[] args) {
        Students s1 = Students.m1();   //holding return value
        System.out.println(s1);
    }
}


//return variable

class Demo{
    int a = 10;
    int m1(int a){

        return a;   //return local
    }

    int m2(){
        return a;   //return instance
    }

    int m3(int a){
        return this.a;  //return instance
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        int a=d.m1(100);
        System.out.println(a);

        int b = d.m2();
        System.out.println(b);

        int c = d.m3(1000);
        System.out.println(c);

    }
}