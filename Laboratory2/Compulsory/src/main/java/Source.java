public class Source {

    String name;
    public enum SourceType{
        WAREHOUSE, FACTORY;
    }
    SourceType type;

    public Source() {
    }

    public Source(String name) {
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
