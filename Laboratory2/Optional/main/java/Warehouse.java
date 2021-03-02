public class Warehouse extends Source{

    public Warehouse() {
    }

    public Warehouse(String name) {
        super(name);
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source src = (Warehouse) obj;
        return (src.name == name);
    }

}
