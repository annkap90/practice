package WorkWithString;

import java.util.*;

public class TextManipulator {

    private String text;

    public TextManipulator(String text){
        this.text = text;
    }

    public List<String> getFirstNUniqueWords(int n){
        List<String> finalResult = new ArrayList<String>();
        Set<String> uniqueWordsSet = new LinkedHashSet<String>(Arrays.asList(text.toLowerCase().replaceAll("[-+.^:,?!;]", "").split(" ")));
        List<String> uniqueWordsList = new ArrayList(uniqueWordsSet);
        for(int i=0; i<n; i++){
            finalResult.add(uniqueWordsList.get(i));
        }
        System.out.println(uniqueWordsSet);
        return finalResult;
    }

    public Map<String, Integer> getWordFrequencies(){
        if(!text.isEmpty() && text!=null) {
            List<String> wordsList = new LinkedList(Arrays.asList(text.toLowerCase().replaceAll("[-+.^:,?!;]", "").split(" ")));
            int wordsArrayLength = wordsList.size();
            Map<String, Integer> mapResult = new HashMap<>();
            for (int i = 0; i < wordsArrayLength; i++) {
                mapResult.put(wordsList.get(i), Collections.frequency(wordsList, wordsList.get(i)));
            }
            System.out.println(mapResult);
            return mapResult;
        } else {
            throw new IllegalArgumentException("Please enter the text");
        }
    }

    public long getLengthInChars(){
        return text.toLowerCase().replaceAll("[-+.^:,?!; ]", "").length();
    }



}
