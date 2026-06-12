package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args){
//        Pair p = new Pair();
//        p.X = "Hello";
//        p.Y = 2.5;

//        With Object data type, we don't get any compile time safety.
//        Double x = (Double) p.X; // ClassCastException at runtimex
//        System.out.println(x);

        Pair<Double,Double> p1 = new Pair<>();
        p1.first = 2.5; // compile time safety, we can't assign a String to first
        p1.second = 3.5;

//        Double d = p1.first; // no need for casting, we get the correct type at compile time
//        System.out.println(d);

        Pair<String,Double> p2 = new Pair<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);

//        list.add("String");// compile time error, we can't add a String to a List of Integers

        Map<Integer,String> map1 = new HashMap<>();
        // Generics came in Java-5
        // Java is a backward compatible language.
//        Map map2 = new HashMap();
//        map2.put(89.0, "Manvendra");

        doSomething(list);

        List<Double> doubles = new ArrayList<>();
        doSomething(doubles);



    }

    public static void doSomething(List<? extends Number> numbers){
        System.out.println(numbers);
    }

    // public static void doSomething2(List<? super Dog> list) {}

}
