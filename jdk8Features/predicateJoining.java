package jdk8Features;

import java.util.function.Predicate;

//+++++++++++++++++
//PredicateJoining
//++++++++++++++++
//public java.util.function.Predicate<T> and(java.util.function.Predicate<? super
//T>);
//
//public java.util.function.Predicate<T> negate();
//public java.util.function.Predicate<T> or(java.util.function.Predicate<? super
//T>);


//class MyPredicate implements Predicate<String>{
//    @Override
//    public boolean test(String s) {
//        return s.length()>3;
//    }
//}
public class stringLen {
    public static void main(String[] args) {
//        Write a predicate to accept string  as the input and check the length of the given string is greater than 3 or not.
//        Predicate<String> p = (s) -> s.length()>3;
//        System.out.println(p.test("Hello"));
//        System.out.println(p.test("Hi"));

//        Array should tell how many element present in the array are greater than 10 and even number.
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        Predicate<Integer> p1 = (i) -> i>10;
        Predicate<Integer> p2 = (i) -> i%2==0;
        System.out.println("The numbers greater than 10 are: ");
        print(p1,arr);
        System.out.println();
        System.out.println("The even numbers are: ");
        print(p2,arr);
        System.out.println();
        System.out.println("The numbers which not greater than 10: ");
        print(p1.negate(),arr);
        System.out.println();
        System.out.println("The numbers which are greater than 10 and even: ");
        print(p1.and(p2),arr);
    }
    public  static  void  print(Predicate<Integer> p, int[] arr){
        for (int i:arr) {
            if(p.test(i)){
                System.out.print(i+" ");
            }
        }
    }
}
