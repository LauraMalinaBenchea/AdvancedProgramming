public class Factory extends Source{
    String type = "FACTORY";

    //constructori

    public Factory() {
    }

    public Factory(String name) {
        super(name);
    }

    //getter
    //nu e nevoie de setter, deoarece va fi mereu FACTORY


    public String getType() {
        return type;
    }
}
