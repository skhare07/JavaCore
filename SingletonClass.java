package JavaPractice;

//start on load
public class SingletonClass {
    private static SingletonClass s = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {
        return s;
    }

    public static void main(String[] args) {


        //factory method
        SingletonClass s1 = SingletonClass.getSingletonClass();
        System.out.println(s1);
        SingletonClass s2 = SingletonClass.getSingletonClass();
        System.out.println(s2);
    }
}


//lasy init
class Test1 {
    private static Test1 t ;

    private Test1() {

    }

    public static Test1 getTest() {
      if(t == null){
          t = new Test1();
      }
        return t;
    }

    public static void main(String[] args) {


        //factory method
        Test1 t1 = Test1.getTest();
        System.out.println(t1);
        Test1 t2= Test1.getTest();
        System.out.println(t2);
    }
    }