public class Solution {

    public Solution() {
    }

    public void isSatisfiable(int size){

        int[] demand = new int[size];
        demand[0] = 20;
        demand[1] = 10;
        demand[2] = 25;
        int[] supply = new int[size];
        supply[0] = 10;
        supply[1] = 35;
        supply[2] = 25;
        int[][] content = { {2, 3, 1}, {5, 4, 8}, {5, 6, 8}};
        int demandSum = 0;
        int supplySum = 0;
        for(int i = 0; i < size-2; i++){
            demandSum+=demand[i];
            supplySum+=supply[i];
        }
        if(demandSum > supplySum){
            System.out.println("Problema nu poate fi satisfacuta");
        }
        System.out.println("Problema poate fi satisfacuta");
    }
}
