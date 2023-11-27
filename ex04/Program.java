
package ex04;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String str = "aaaaaaabbbbbbssssssaaaaa";
        Map<Character, Integer> myMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (Character c : str.toCharArray()) {
            myMap.put(c, myMap.getOrDefault(c, 0) + 1);
            max = max > myMap.getOrDefault(c, 0) ? max : myMap.getOrDefault(c, 0) + 1;
        }

        String[] res = printMap(myMap, max);
        for (int i = 0; i < res.length; i++) {
            char [] bar = res[i].toCharArray();
            for (int j = 0; j < bar.length; j++) {
                
            }
        }

        for (String x : res) {
            System.out.println(x);
        }

    }

    public static String[] printMap(Map<Character, Integer> mymap, Integer max) {
        String[] arr = new String[mymap.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : mymap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + "*".repeat(entry.getValue()));
            arr[i] = "*".repeat(entry.getValue()) +"entry.getValue()" + " ".repeat(max - entry.getValue()) ;
            i++;
        }
        return arr;
    }

}