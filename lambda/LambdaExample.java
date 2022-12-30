package java_practice.lambda;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
class Marble {
    String color;
    Integer price;
    public Marble(String color, Integer price) {
        this.color = color;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marble{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

interface StringLength {
    int getLength(String str);
}

interface Sum {
    int add(int a, int b);
}

class Main1 {
    public static void main(String[] agrs) {
        Function<String, Integer> s1 = str -> str.length();
        int length = s1.apply("Sourav");
        System.out.println(length);

        Sum s = (a, b) -> a + b;
        int result = s.add(11, 22);
        System.out.println(result);

        //consumer interface
        Consumer<String> c = (t) -> System.out.println(t);
        c.accept("Sourav");

        List<String> list = new ArrayList<>();
        list.add("sourav");
        list.add("suresh");
        list.add("sandeep");
        list.add("sahil");
        list.forEach((t) -> System.out.println(t));

        //supplier interface
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        Supplier<List<Marble>> m = () -> {
            List<Marble> list1 = new ArrayList<Marble>();
            list1.add(new Marble("red", 100));
            list1.add(new Marble("blue", 200));
            list1.add(new Marble("black", 300));
            return list1;
        };
        System.out.println(m.get());

        //function interface
        Function<String, Integer> function = (t) -> t.length();
        System.out.println(function.apply("Sourav"));

        Function<Integer, String> function1 = (t1) -> {
            if (t1 % 2 == 0) {
                return t1 + " is even";
            } else {
                return t1 + " is odd";
            }
        };
        System.out.println(function1.apply(53));

        Function<String, Integer> function3 = (t) -> t.length();
        Function<Integer, Integer> function4 = (t) -> t * 2;

        Integer integer = function3.andThen(function4).apply("Sourav");
        System.out.println(integer);

        //predicate interface
        Predicate<Integer> predicate = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(13));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> predicate1 = (x) -> x > 5;
        list1.stream().filter(predicate1).collect(Collectors.toList()).forEach(System.out::println);
    }
}