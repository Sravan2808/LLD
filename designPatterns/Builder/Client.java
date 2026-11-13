package designPatterns.Builder;

public class Client {
    public static void main(String[] args) {

        /** Main Notes To Understand the Builder Design Pattern:
         * 1. getBuilder() static method
         * 2. Make the Builder class static
         * 3. build method in Builder class.
         * 4. Make the setters of Builder class return Builder object.
         *
         * Why we made setters return Builder object -> To support Method chaining.
         */

        //Method Chaining.
        Student st = Student.getBuilder()
                .setName("BhargavSuryaGoud")
                .setAge(18)
                .setGradYear(2030)
                .setPsp(9.5)
                .build();

        System.out.println("Debugging the student object: " + st.getName() + ", " + st.getAge() + ", " + st.getGradYear() + ", " + st.getPsp() + ", " + st.getBatch() + ".");
    }
}
