package JavaPractice.InterfaceAndAbstractClass.HelperClass;

import JavaPractice.InterfaceAndAbstractClass.Declaration.Message;

public abstract class Helper implements Message {
    @Override
    public void morning() {
        System.out.println("Helper Good Morning");
    }
}
