package jdk8Features;


public class Function {
    public static void main(String[] args) {
        java.util.function.Function<String,Integer> function = (s) -> s.length();
        Function
        System.out.println(function.apply("sachin"));
        System.out.println(function.apply("rohit"));
    }
}
