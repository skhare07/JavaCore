package JavaPractice.InterfaceAndAbstractClass.Clients;

import JavaPractice.InterfaceAndAbstractClass.HelperClass.Helper;

public class Client2 extends Helper {
    @Override
    public void evening() {
        System.out.println("Good Evening");
    }
    @Override
    public void night() {
        System.out.println("Good Night");
    }
    public static void main(String[] args) {
    Client2 c = new Client2();
    c.morning();
    c.evening();
    c.night();
    }
}
