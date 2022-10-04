import java.util.HashMap;
import java.util.Map;

public class CheckVowels {
    public static void main(String args[]){
        checkVowels("This is a String");

    }
    public static void checkVowels(String s){
        int count=0;
        for(char c:s.toCharArray()){
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                    }

                    }
System.out.println("Count of vowels in the String is: "+count);
            }
        }




