import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Optional_2 {

    public static int readInput(){
        System.out.println("Introduceti numarul de linii si coloane: ");
        Scanner input = new Scanner(System.in);
        int nodes = input.nextInt();
        return nodes;
    }

    public static int[][] randomMatrixGenerator(int n, int[][] graph){
        Random rand = new Random();
        int upperBound = 2;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                graph[i][j] = rand.nextInt(upperBound);
            }
        }
        return graph;

    }

    public static void printMatrix(int[][] matrice, int nodes){
        System.out.println("Matricea generata aleator este: ");
        for(int i = 0; i < nodes; i++){
            for(int j = 0; j < nodes; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static boolean isConnected(int[][] adjacencyMatrix, int numberOfNodes) {
        int visited[] = new int[numberOfNodes ];

        for(int i=0; i< numberOfNodes; i++){
            for(int j=0; j < numberOfNodes; j++){
                if(adjacencyMatrix[i][j]==1 && visited[i]==0) {
                    visited[i] = 1;
                }
            }
        }

        boolean connected = false;
        System.out.println(Arrays.toString(visited));
        System.out.println("Componentele conectate sunt: ");
        for (int vertex = 1; vertex < numberOfNodes; vertex++) {
            if (visited[vertex] == 1) {
                connected = true;
                System.out.print(vertex + " ");
            } else {
                connected = false;
                break;
            }
        }
        System.out.println(" ");
        return connected;

    }
    public static void printConnected(boolean connected){
        if(connected){
            System.out.println("Graful generat de matricea data este conectat.");
        } else{
            System.out.println("Graful generat de matricea data nu este conectat.");
        }
    }

    public static long printTime(long startTime, long finishTime){
        return (finishTime - startTime);
    }
    public static void toDo(){
        int nodes = readInput();
        int[][] graph = new int[nodes][nodes];
        randomMatrixGenerator(nodes, graph);
        printMatrix(graph, nodes);
        boolean connected = isConnected(graph, nodes);
        printConnected(connected);
    }
    public static void main(String[] args){
        long startTime = System.nanoTime();
        toDo();
        long finishTime = System.nanoTime();
        System.out.println("Aplicatia s-a terminat in " + printTime(startTime, finishTime) + " nanosecunde");

    }
}
