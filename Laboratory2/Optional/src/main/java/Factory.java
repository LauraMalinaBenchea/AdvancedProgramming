public class Factory extends Source{

    public Factory() {
    }

    public Factory(String name) {
        super(name);
    }

    @Override
    void setName(String name) {

    }

    @Override
    String getName() {
        return null;
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
