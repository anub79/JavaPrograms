import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class CountCharOccurenceinString {

    public static void main(String args[]){
        countCharOccurenceinString("Java is a Language");
    }
    public static void countCharOccurenceinString(String str){
        char ch[]=str.toCharArray();
        Map<Character,Integer> charCount=new HashMap<>();
        for(char c:ch) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
Set<Map.Entry<Character,Integer>> entrySet=charCount.entrySet();
   for(Map.Entry<Character,Integer> entry:entrySet){
       if (entry.getValue()>1){
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
   }


}

        }





