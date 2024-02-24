import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Graph graph = new Graph("src/graph.txt");
            graph.printDegrees();
            graph.printIsolatedAndPendantVertices();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        }
    }
}