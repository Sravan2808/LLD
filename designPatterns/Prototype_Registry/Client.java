package designPatterns.Prototype_Registry;

import java.rmi.registry.Registry;

public class Client {

//    Main Notes To Understand the Prototype/Registry Design Pattern:
//    =================================================================
//    Step1:
//    => Identify the class for which we want to use prototype.
//    => Implement copy()/clone() method
//        Note:All the child classed must implement the clone() method as well.
//    Step2:  Create a Registry to store Prototype objects.
//    Step3: When we want to create an Object,Create a copy of prototype and just set the attrs which are different from each object.

    public static void fillRegistry(StudentRegistry registry){
        Student lldEveningPrototype = new Student();
        lldEveningPrototype.setBatch("LLD Evening");
        lldEveningPrototype.setAvgPsp(90.0);

        registry.put("LLD Evening", lldEveningPrototype);

        Student intelligentStudentPrototype = new IntelligentStudent();
        intelligentStudentPrototype.setBatch("Intelligent Batch");
        intelligentStudentPrototype.setAvgPsp(95.0);
        registry.put("Intelligent Batch", intelligentStudentPrototype);

    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student sravan = registry.get("LLD Evening").clone();
        sravan.setName("Sravan");
        sravan.setPsp(99.0);
        System.out.println("Name: " + sravan.getName() + ", Batch: " + sravan.getBatch() + ", Avg PSP: " + sravan.getAvgPsp() + ", PSP: " + sravan.getPsp());

        Student bhargav = registry.get("Intelligent Batch").clone();
        bhargav.setName("Bhargav");
        bhargav.setPsp(99.5);
        System.out.println("Name: " + bhargav.getName() + ", Batch: " + bhargav.getBatch() + ", Avg PSP: " + bhargav.getAvgPsp() + ", PSP: " + bhargav.getPsp());

    }
}
