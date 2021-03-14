package compulsoryPack;
import java.util.*;

public class City {
    private List<Location> nodes = new ArrayList<>();

    public City(List<Location> nodes) {
        this.nodes = nodes;
    }

    public List<Location> getNodes() {
        return nodes;
    }

    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    public void addLocation(Location node) {
        nodes.add(node);
    }
    public void displayVisitableButNotPayabple(){

    }

}
