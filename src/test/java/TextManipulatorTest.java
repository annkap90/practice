import WorkWithString.TextManipulator;
import org.junit.Test;
import java.util.Map;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TextManipulatorTest {

    @Test
    public void getWordFrequenciesTestPositive(){
        String testText = "Hello sir! hello";
        TextManipulator textManipulator = new TextManipulator(testText);
        Map<String, Integer> wordFrequencies = textManipulator.getWordFrequencies();
        assertEquals(wordFrequencies.get("hello"), new Integer(2));
        assertEquals(wordFrequencies.get("sir"), new Integer(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWordFrequenciesNegative(){
        String testText = "";
        TextManipulator textManipulator = new TextManipulator(testText);
        textManipulator.getWordFrequencies();
    }
}
