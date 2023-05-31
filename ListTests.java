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
    public void testSubtle() {
      List<String> s1 = Arrays.asList("a", "b", "a");
      List<String> s2 = Arrays.asList("a", "b");
      List<String> result1 = ListExamples.filter(s1, new IsA());
      List<String> result2 = ListExamples.filter(s2, new IsA());
      System.out.println(result1.size());
      System.out.println(result2.size());
      System.out.println(result1==result2);
        
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
