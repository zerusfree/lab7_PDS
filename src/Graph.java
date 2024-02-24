import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {
    private int[][] adjacencyMatrix;
    private int vertices;

    public Graph(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        vertices = scanner.nextInt();
        adjacencyMatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public void printDegrees() {
        for (int i = 0; i < vertices; i++) {
            int degree = 0;
            for (int j = 0; j < vertices; j++) {
                degree += adjacencyMatrix[i][j];
            }
            System.out.println("Степінь вершини " + (i+1) + ": " + degree);
        }
    }

    public void printIsolatedAndPendantVertices() {
        for (int i = 0; i < vertices; i++) {
            int degree = 0;
            for (int j = 0; j < vertices; j++) {
                degree += adjacencyMatrix[i][j];
            }
            if (degree == 0) {
                System.out.println("Ізольована вершина: " + (i+1));
            } else if (degree == 1) {
                System.out.println("Висяча вершина: " + (i+1));
            }
        }
    }

    public int getDegree(int vertex) {
        int degree = 0;
        for (int j = 0; j < vertices; j++) {
            degree += adjacencyMatrix[vertex][j];
        }
        return degree;
    }
}
