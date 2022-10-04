import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsinAnArray {

    public static void main(String[] args) {
        String infra[] = {"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Saucelabs", "Azure", "GCP"};
    /*System.out.println("Using Bruteforce method");
    for(int i=0;i<infra.length;i++)
        {
            for(int j=i+1;j< infra.length;j++){
                if(infra[i]==infra[j]){

                    System.out.print(infra[i]+", ");
                }
            }
        }*/
        //Using HashSet
        Set<String> data = new HashSet<>();
        for (String e : infra) {
            if (data.add(e) == false) {
                System.out.println(e);
            }
        }
        //Using HAshMap logic
        Map<String, Integer> hmap = new HashMap<>();
        for (String e : infra) {
            if (hmap.containsKey(e)) {
                System.out.println(e + " ");
            } else {
                hmap.put(e, 1);
            }
        }
// Print all duplicate elements from Map

       // Set<Map.Entry<String, Integer>> entrySe = infra.entrySet();

        Set<Map.Entry<String, Integer>> entrySet = hmap.entrySet();
			for (Map.Entry<String, Integer> entry : entrySet) {

				if (entry.getValue() > 1) {
					System.out.println(entry.getKey());
				}


    }
    }
}
