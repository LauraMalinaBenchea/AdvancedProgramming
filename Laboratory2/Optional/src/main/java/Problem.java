import java.util.Scanner;

public class Problem {

    //caracteristicile clasei

    int size;
    //constructor

    public Problem(int size) {
        this.size = size;
    }

    //functie de afisare a matricei

    public void printMatrix(int[][] matrice, int rows, int[] supply, int[] demand, Source[] suppliers, Destination[] demanded){
        System.out.println("Matricea data este: ");
        System.out.print("       ");
        for(int i = 0; i < size; i++){
            System.out.print(toString(demanded[i]) + "  ");
        }
        System.out.print("Supply");
        System.out.println(" ");
        for(int i = 0; i < rows; i++){
            System.out.print(toString(suppliers[i]) + "     ");
            for(int j = 0; j < rows; j++){
                System.out.print(matrice[i][j] + "    ");
                if(j == (rows - 1)){
                    System.out.print("   ");
                    System.out.print(supply[i]+ "  ");
                }

            }
            System.out.println(" ");
        }
        System.out.print("Demand ");
        for(int i = 0; i < rows; i++){
            System.out.print(demand[i] + "  ");
        }
    }
    public int[][] fillMatrix(int[][] matrice, int rows){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rows; i++){

            System.out.println("Introduceti elementele de pe linia " + i + ":");
            for(int j = 0; j < rows; j++){
                matrice[i][j] = input.nextInt();
            }
        }
        return matrice;
    }
    public int[] fillDemand(int[] demand, int rows){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cantitatea ceruta de fiecare depozit: ");
        for(int i = 0; i < rows; i++){
            demand[i] = input.nextInt();
        }
        return demand;
    }

    public int[] fillSupply(int[] supply, int rows){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cantitatea oferita de fiecare sursa: ");
        for(int i = 0; i < rows; i++){
            supply[i] = input.nextInt();
        }
        return supply;
    }

//suprascriu metoda toString

    //@Override
    public String toString(Source x) {
        return x.name;
    }
    public String toString(Destination x){
        return x.name;
    }
}
