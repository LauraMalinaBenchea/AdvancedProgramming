abstract public class Source {

    //caracteristicile clasei

    String name;
    /*public enum SourceType{
        WAREHOUSE, FACTORY;
    }
    SourceType type;*/

    //creez constructorii

    public Source() {
    }

    public Source(String name) {
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
        if (!(obj instanceof Source)) {
            return false;
        }
        Source src = (Source) obj;
        return (src.name == name);
    }
}
