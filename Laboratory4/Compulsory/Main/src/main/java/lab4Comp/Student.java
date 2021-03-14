package lab4Comp;

import java.util.Comparator;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    //@Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
