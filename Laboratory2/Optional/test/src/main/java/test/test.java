package test;

public class test {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3}, {2, 3, 4}, {13, 24, 35}};
        int size = matrice.length;
        char c = '\u250C';
        System.out.print(c);
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                System.out.print(matrice[row][col] + " ");
            }
            System.out.println(" ");
        }
    }

}
