import java.util.Scanner;

public class Problem {

    int size;

    public Problem(int size) {
        this.size = size;
    }

    //functie de afisare a matricei

    public void printMatrix(String[][] matrice, int size){
        System.out.println("Matricea data este: ");
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
               System.out.print(matrice[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
    public String[][] fillMatrixGiven(String[][] matrice, int size, Source[] suppliers, Destination[] demanded){

        Integer auxvar;
        String auxString;
        int[] demand = new int[size];
        demand[0] = 20;
        demand[1] = 10;
        demand[2] = 25;
        int[] supply = new int[size];
        supply[0] = 10;
        supply[1] = 35;
        supply[2] = 25;
        int[][] content = { {2, 3, 1}, {5, 4, 8}, {5, 6, 8}};

        matrice[0][size-1] = "Supply";
        matrice[size-1][0] = "Demand";
        matrice[0][0] = "      ";
        matrice[size-1][size-1] = "      ";

        for(int contor = 1; contor < size - 1; contor++){
            auxString = toString(demanded[contor-1]);
            matrice[0][contor] = auxString + " ";
        }
        for(int contor = 1; contor < size - 1; contor++){
            auxString = toString(suppliers[contor-1]);
            matrice[contor][0] = auxString + "    ";
        }
        for(int contor = 1; contor < size - 1; contor++) {
            auxvar = supply[contor-1];
            matrice[contor][size-1] = auxvar.toString();
        }
        for(int contor = 1; contor < size - 1; contor++) {
            auxvar = demand[contor-1];
            auxString = auxvar.toString();
            matrice[size-1][contor] = auxString + " ";
        }
        for(int row = 1; row < size-1; row++) {
            for(int col = 1; col < size-1; col++){
                auxvar = content[row-1][col-1];
                auxString = auxvar.toString();
                matrice[row][col] = auxString + "  ";
            }
        }

        return matrice;
    }

    //citim informatiile necesare pentru a le adauga in matrice

    public String[][] fillMatrixInput(String[][] matrice, int size, Source[] suppliers, Destination[] demanded){
        Scanner input = new Scanner(System.in);
        int[] demand = new int[size];
        int[] supply = new int[size];
        Integer auxvar;
        matrice[0][size-1] = "Supply";
        matrice[size-1][0] = "Demand";
        matrice[size-1][size-1] = "    ";
        matrice[0][0] = "    ";

        fillDemand(demand, size);
        fillSupply(supply, size);

        //completing the deposits and senders
        for(int column = 1; column < size - 1; column++){
            matrice[0][column] = toString(demanded[column - 1]);
        }
        for(int row = 1; row < size - 1; row++){
            matrice[row][0] = toString(suppliers[row-1]);
        }

        //complete the required and given
        for(int column = 1; column < size - 1; column++){
            auxvar = demand[column - 1];
            matrice[size-1][column] = auxvar.toString();
        }
        for(int row = 1; row < size - 1; row++){
            auxvar = supply[row-1];
            matrice[row][size-1] = auxvar.toString();
        }
        for(int row = 1; row < size - 1; row++){
            System.out.println("Introduceti elementele de pe randul " + row + ": ");
            for(int column = 1; column < size - 1; column++){
                auxvar = input.nextInt();
                matrice[row][column] = auxvar.toString();
            }
        }

        return matrice;
    }

    //citim cantitatile cerute de fiecare soursa

    public int[] fillDemand(int[] demand, int rows){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cantitatea ceruta de fiecare depozit: ");
        for(int i = 0; i < rows - 2; i++){
            demand[i] = input.nextInt();
        }
        return demand;
    }

    public int[] fillSupply(int[] supply, int rows){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cantitatea oferita de fiecare sursa: ");
        for(int i = 0; i < rows - 2; i++){
            supply[i] = input.nextInt();
        }
        return supply;
    }

//suprascriu metoda toString


    @Override
    public String toString() {
        return super.toString();
    }

    public String toString(Source x) {
        return x.name;
    }
    public String toString(Destination x){
        return x.name;
    }
}
