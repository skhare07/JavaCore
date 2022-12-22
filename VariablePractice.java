package JavaPractice;

public class VariablePractice {
    static int a=10;
    static int b=20;
    int c=30;
    int d=40;

    static void m1(){

        System.out.println(VariablePractice.a);
        System.out.println(VariablePractice.b);

        VariablePractice variablePractice = new VariablePractice();
        System.out.println(variablePractice.c);
        System.out.println(variablePractice.d);

    }
    void m2(){
        System.out.println(VariablePractice.a);
        System.out.println(VariablePractice.b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void main(String[] args) {
        m1();
        VariablePractice variablePractice = new VariablePractice();
        variablePractice.m2();
    }
}

//instance -separate memory vs static-single copy


class Variables{
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println(variables.a);
        System.out.println(variables.b);
        variables.a=100;
        variables.b=200;

        System.out.println(variables.a);
        System.out.println(variables.b);

        Variables variables1 = new Variables();
        System.out.println(variables1.a);
        System.out.println(variables.b);

    }
}