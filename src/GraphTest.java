import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    @Test
    void testPrintDegrees() {
        try {
            Graph graph = new Graph("src/graph.txt");
            int expectedDegree = 1;
            assertEquals(expectedDegree, graph.getDegree(0), "Степінь вершини 1 не співпадає");
        } catch (FileNotFoundException e) {
            fail("Файл не знайдено");
        }
    }
}