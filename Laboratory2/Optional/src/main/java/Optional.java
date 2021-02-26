public class Optional {
    public static void main(String[] args){
        int size = 3;
        Source[] suppliers = new Source[size];
        Destination[] demanded = new Destination[size];
        Warehouse S1 = new Source("S1");
        suppliers[0] = S1;
        Factory S2 = new Source("S2");
        suppliers[1] = S2;
        Factory S3 = new Source("S3");
        suppliers[2] = S3;
        Destination D1 = new Destination("D1");
        demanded[0] = D1;
        Destination D2 = new Destination("D2");
        demanded[1] = D2;
        Destination D3 = new Destination("D3");
        demanded[2] = D3;
        Problem P1 = new Problem(size);
        int[][] matrice = new int[size][size];
        int[] supply = new int[size];
        int[] demand = new int[size];
        P1.fillMatrix(matrice, size);
        P1.fillDemand(demand, size);
        P1.fillSupply(supply, size);
        P1.printMatrix(matrice, size, supply, demand, suppliers, demanded);

    }
}
