import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class AnagramTest
{
    @Test
    public void should_return_empty_string_for_no_characters()
    {
    	ArrayList<String> expected = new ArrayList<String>(Arrays.asList(""));
        ArrayList<String> actual = Anagram.Of("");
        assertArrayEquals(expected.toArray(), actual.toArray()); 
    }

    @Test
    public void should_return_character_for_one_character()
    {
    	ArrayList<String> expected = new ArrayList<String>(Arrays.asList("A")); 
    	ArrayList<String> actual = Anagram.Of("A");
    	assertArrayEquals(expected.toArray(), actual.toArray()); 
    }
}
