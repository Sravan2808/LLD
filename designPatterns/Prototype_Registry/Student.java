package designPatterns.Prototype_Registry;

public class Student implements Prototype<Student>{
    String name;
    int age;
    String batch;
    double avgPsp;
    double psp;

    Student(){

    }
    Student (Student st){
        this.name = st.name;
        this.age = st.age;
        this.batch = st.batch;
        this.avgPsp = st.avgPsp;
        this.psp = st.psp;
    }


    public Student clone(){
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
