abstract public class Source {

    String name;

    Source() {}
    Source(String name) {}

    abstract void setName(String name);
    abstract String getName();

    @Override
    public String toString() {
        return name;
    }

    @Override
    abstract public boolean equals(Object obj);
}
