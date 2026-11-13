package designPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setName("BhargavSuryaGoud")
                .setAge(18)
                .setGradYear(2030)
                .setPsp(9.5)
                .build();

        System.out.println("Debugging the student object: " + st.getName() + ", " + st.getAge() + ", " + st.getGradYear() + ", " + st.getPsp() + ", " + st.getBatch() + ".");
    }
}
