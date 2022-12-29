package java_practice.thread;
class Main {
    public static void main(String[] args) {
        AddInter a1 = (a, b) -> a + b;
        System.out.println(a1.sum(34, 45));
        AddInter a2 = (a, b) -> a + b;
        System.out.println(a1.sum(11, 44));

        LengthInter l1 = str -> str.length();
        System.out.println(l1.getLength("Sourav"));
    }
}