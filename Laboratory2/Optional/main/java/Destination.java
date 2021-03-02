public class Destination {

    //caracteristicile clasei

    String name;

    //creez constructorii


    public Destination() {
    }

    public Destination(String name) {
        this.name = name;
    }

    //creez sett-erii si gett-erii


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //suprascriu metoda toString

    @Override
    public String toString() {
        return name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination dest = (Destination) obj;
        return (dest.name == name);
    }
}
