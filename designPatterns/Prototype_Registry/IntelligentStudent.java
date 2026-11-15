package designPatterns.Prototype_Registry;

public class IntelligentStudent extends Student{
    public int iq;

    IntelligentStudent(){

    }
    IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
