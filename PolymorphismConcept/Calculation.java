package JavaPractice.PolymorphismConcept;

public class Calculation {
    void add(){
        int a = 10,b=20;
        int c = a+b;
        System.out.println(c);
    }
    void add(int a,int b){
        int c =a+b;
        System.out.println(c);
    }
    void add(int a,double b){
        double c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
    Calculation c = new Calculation();
    c.add();
    c.add(15,20);
    c.add(15,30.4);
    }
}
