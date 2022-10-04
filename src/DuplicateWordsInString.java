import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        duplicateWordsInString("Java is the best languge amongst all@languages is--Java");
        duplicateWordsInString("100 200 300 300 200 100");
        duplicateWordsInString(" ");
        duplicateWordsInString(null);

    }
    public static void duplicateWordsInString(String str) {
      if(str==null){
          System.out.println("Null String");
          return;
      }
      String words[]=str.split("[, ? . @ ,--]+");
      //Create one HashMap
        Map<String,Integer> wordCount =new HashMap<String,Integer>();
        //every word in given array
        for(String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }else{wordCount.put(word,1);
            }
        }
        //extracting all keys of word map
        Set<String> wordsInString=wordCount.keySet();
        //Loop through all the words in wordCount
        for(String word:wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word + " : " + wordCount.get(word));
            }
        }



    }
}
