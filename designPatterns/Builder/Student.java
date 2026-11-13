package designPatterns.Builder;

public class Student {
    String name;
    int age;
    String batch;
    double psp;
    int gradYear;
//    ...Lots of attrs


    private Student(Builder builder){

        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();

    }

    public static Builder getBuilder(){
        return new Builder();
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

//    Inner Class of Student Class

    public static class Builder{
        String name;
        int age;
        String batch;
        double psp;
        int gradYear;
//        lots of attributes

        private Builder(){

        }

        public Student build(){

//            Validation start
            if(this.age<18){
                throw new RuntimeException("Age should be greater than 18");
            }

            if(this.gradYear<2025) throw new RuntimeException("Grad Year should be greater than 2025");

//            Validation end

            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }
}

