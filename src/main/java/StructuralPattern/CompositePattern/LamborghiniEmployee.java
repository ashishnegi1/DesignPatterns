package StructuralPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class LamborghiniEmployee {
    private String name;
    private String dept;
    private int salary;
    private List<LamborghiniEmployee> subordinates;

    public LamborghiniEmployee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(LamborghiniEmployee e){
        subordinates.add(e);
    }

    public void remove(LamborghiniEmployee e){
        subordinates.remove(e);
    }

    public List<LamborghiniEmployee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
