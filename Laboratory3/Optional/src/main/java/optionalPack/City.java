package optionalPack;
import java.util.*;

public class City implements Comparable<Location> {

    private List<Location> nodes = new ArrayList<>();
    List<Location> auxiliary = new ArrayList<>();

    public City(List<Location> nodes) {
        this.nodes = nodes;
    }


    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }
    public void addLocation(Location node) {
        nodes.add(node);
    }
    public List<Location> getNodes() {
        return nodes;
    }


    @Override
    public int compareTo(Location o) {
        return 0;
    }

    public void displayVisitableButNotPayabple(){
        for(int iterator = 0; iterator < nodes.size(); iterator++){
            if(Visitable.class.isAssignableFrom(nodes.get(iterator).getClass()) &&
                    !(Payable.class.isAssignableFrom(nodes.get(iterator).getClass()))){
                auxiliary.add(nodes.get(iterator));
            }
        }
        auxiliary.sort((Location location1, Location location2) -> {
            Visitable location1Casted = (Visitable) location1;
            Visitable location2Casted = (Visitable) location2;
            return location1Casted.getOpeningHour().compareTo(location2Casted.getOpeningHour());
        });
        for(int iterator = 0; iterator < auxiliary.size(); iterator++ ){
            System.out.println(auxiliary.get(iterator));
        }

    }
}
