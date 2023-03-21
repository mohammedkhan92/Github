package HelloNameProject.HelloNameProject;

import java.util.HashMap;
import java.util.Map;

public class MianClass6 {

    public static void main(String[] args){
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        myMap.put("Ankita", 28);
        myMap.put("Vinod", 30);
        myMap.put("Fahad", 33);
        myMap.put("Malik", 27);

        System.out.println(myMap);
    }
}
