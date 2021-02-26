public class Destination {

    String name;

    public Destination() {
    }

    public Destination(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return this.name;
    }



}
