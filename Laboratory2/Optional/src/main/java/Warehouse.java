public class Warehouse extends Source{
    String type = "WAREHOUSE";

    //constructori


    public Warehouse() {
    }

    public Warehouse(String name) {
        super(name);
    }


    //getter
    //nu e nevoie de setter, va fi mereu WAREHOUSE

    public String getType() {
        return type;
    }


}
