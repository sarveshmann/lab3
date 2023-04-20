import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        // inputs
        List<String> input1 = Arrays.asList("a", "b", "ca");
        List<String> expected1 = Arrays.asList("a", "ca");
        assertEquals(null, expected1, ListExamples.filter(input1, s -> s.contains("a")));
        
    }

    @Test
    public void testMerge(){
        // inputs
        List<String> input1 = Arrays.asList("a", "c", "e");
        List<String> input2 = Arrays.asList("b", "d", "f");

        List<String> expected1 = Arrays.asList("a", "b", "c", "d", "e", "f");
        assertEquals(null, expected1, ListExamples.merge(input1, input2));
        
    }
}
