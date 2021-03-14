package lab4Comp;

public class School implements Comparable<School>{
    String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(School other) {
            if (this.name == null) {
                return -1;
            }
            if (other.name == null) {
                return -1;
            }
            return this.name.compareTo(other.name);
    }
}
