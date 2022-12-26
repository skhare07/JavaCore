package JavaPractice.InterfaceAndAbstractClass.Clients;

import JavaPractice.InterfaceAndAbstractClass.Declaration.Message;
 class Client1 implements Message {
    @Override
    public void morning() {
        System.out.println("Good Morning");
    }
    @Override
    public void evening() {
        System.out.println("Good Evening");
    }
    @Override
    public void night() {
        System.out.println("Good Night");
    }
    public static void main(String[] args) {
    Client1 c = new Client1();
    c.morning();
    c.evening();
    c.night();
     }
}

