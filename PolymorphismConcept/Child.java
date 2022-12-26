package JavaPractice.PolymorphismConcept;

class Parent {
    void message(){
        System.out.println("In parent class");
    }
}
class Child extends Parent{
    void message(){
        super.message();
        System.out.println("In child class");
    }
    public static void main(String[] args) {
        Parent p = new Child();
        p.message();
    }
}

//practice 2 -class as return type
class Animal{}
class Dog extends Animal{}
class Test1{
    Animal color(){
        System.out.println("Animal-Various Color");
        return new Animal();
    }
}
class Test2 extends Test1{
    Dog color(){
        System.out.println("Dog- mainly black and brown");
    return new Dog();
    }
    public static void main(String[] args) {
        new Test2().color();
    }
}