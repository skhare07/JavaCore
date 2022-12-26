package JavaPractice.InterfaceConcept;
public interface Vehical {
    String Name = "TVS";   //public ,static ,final
    int speed = 100;       //public ,static,final
    void start();      //public + abstract
    void stop();       //public + abstract
    default void color(){
        System.out.println("Color is Red");
    }
    static void Mileage(){
        System.out.println("Mileage is 60kmpl");
    }
class Customer implements Vehical{
    @Override
    public void start() {
        System.out.println("Enter key to start");
    }
    @Override
    public void stop() {
        System.out.println("Remove key to stop");
    }
    public static void main(String[] args) {
    Customer c = new Customer();
    c.start();
    c.stop();
    c.color();  //default method
    Vehical.Mileage(); //static
    }
}
}