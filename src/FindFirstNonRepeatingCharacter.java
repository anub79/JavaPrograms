import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    public static void main(String args[]){
        String str="AABBSDFGVV";
   for(int i=0;i<str.length();i++){
     boolean unique=true;
     for(int j=0;j<str.length();j++){
         if(i != j && str.charAt(i)==str.charAt(j)){
                   unique=false;
             System.out.println("The repeating characters in String : "+str.charAt(i));
         }
     }
         if(unique){
             System.out.println("The non repeating characters in String are :"+str.charAt(i));
             break;
         }}
             char ch[] = str.toCharArray();

             Map<Character, Integer> alphaMap = new LinkedHashMap<>();
             for (char c : ch) {
                 if (alphaMap.containsKey(c)) {
                     alphaMap.put(c, alphaMap.get(c) + 1);
                 } else {

                     alphaMap.put(c, 1);

                 }
             }
             System.out.println(alphaMap);
             for(Map.Entry<Character,Integer> entrySet:alphaMap.entrySet()) {
                 //if(entrySet.getValue()==1) {
                 System.out.println(entrySet.getKey()+"="+entrySet.getValue());
                 //break;


             }
     }

   }





