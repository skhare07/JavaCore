package JavaPractice;

class Employee{
    int id;
    String name;
    double sal;

    Employee(int id,String name , double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    void display(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee sal : "+sal);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(12,"Sahil",20000);
        e1.display();

        Employee e2=new Employee(13,"Rohit",25000);
        e2.display();

    }
}


//calling constructor

public class Constructors {

    Constructors(){
        this(10);
    System.out.println("0 arg constructor");
}
    Constructors(int a){
        this(10,20);
        System.out.println("1 arg constructor");
    }

    Constructors(int a , int b){
        System.out.println("2 arg constructor");
    }

    public static void main(String[] args) {
        Constructors c = new Constructors();
       // new Constructors(10);
        //new Constructors(10,20);
    }
}
