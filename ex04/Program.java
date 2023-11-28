
package ex04;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String str = "aaaaaaabbbbbbssssssaaaaa";
        char[][] stats = new char[127][2];

        int max = Integer.MIN_VALUE;
        for (Character c : str.toCharArray()) {
            stats[(int) c][0] = c;
            stats[(int) c][1]++;

        }

        for(char [] index: stats){
            System.out.println(index[0] + "=" + index[1] );
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

}************************