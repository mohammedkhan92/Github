package HelloNameProject.HelloNameProject;

import java.util.HashMap;
import java.util.Map;

public class Mainclass5 {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("Telangana", "Hyderabad");
        myMap.put("Karnataka", "Banglore");
        myMap.put("Tamilnadu", "Chennai");
        myMap.put("Maharashtra", "Mumbai");

        System.out.println(myMap);
    }
}