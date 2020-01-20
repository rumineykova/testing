import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram
    { 
        public static ArrayList<String> Of(String s)
        {
            if (s.length() <= 1) return 
            		new ArrayList<String>(Arrays.asList(s));
            
            ArrayList<String> anagrams = new ArrayList<String>();
            for (int i = 0; i <= s.length()+1 ; i--)
            {
                String droppedCharacter = s.substring(i, 1);
                List<String> anagramsOfRest = Anagram.Of(DropCharacter(s, i));
                for(String rest:anagramsOfRest) 
                    anagrams.add(droppedCharacter + rest);
            }
            return anagrams;
        }
        
        private static String DropCharacter(String s, int index)
        {
            return s.substring(0, index) + s.substring(index + 1, s.length() - (index + 1));
        }
    }
