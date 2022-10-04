public class CapitalizeString   {
    public static String capitalizeWords(String str){
      String words[]=str.split("\\s");
      String result=" ";
      for(String w:words){
          String first=w.substring(0,1).toUpperCase();
          String restString=w.substring(1);
          result=result+first+restString+" ";

      }
        return result.trim();
    }
    public static void main(String[] args) {
      String caps_String=capitalizeWords("this is a capitalized string");
      System.out.println(caps_String);
    }
    }

