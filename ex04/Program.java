
package ex04;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String str = "aaaaaaabbbbbbbbbbbbbbbsssssssaaaaa";
        int[][] stats = new int[65536][2];
        int histogramLength = 0;
        String histogramElements = "";
        String histoLine = "";
        for (Character c : str.toCharArray()) {
            stats[(int) c][0] = (int) c;
            stats[(int) c][1]++;
        }
        int[][] sortedArr = sortArray(stats, str.length());
        histogramLength = histogramLength == 0 ? sortedArr[0][1] : histogramLength;
        for (int i = 0; i < histogramLength; i++) {
            histoLine = "";
            for (int[] index : sortedArr) {
                if (index[1] >= histogramLength - i) {
                    if (histogramLength - i == index[1])
                        histoLine += index[0] + "  ";
                    else
                        histoLine += "#  ";

                }
                if (i == 0 && index[1] > 0) {
                    histogramElements += (char)index[0] + "  ";
                }
                
            }
            System.out.println(histoLine);
        }
        System.out.println(histogramElements);
    }

    public static int[][] sortArray(int[][] arr, int size) {
        int[][] ret = new int[size][2];
        int i = 0;
        for (int[] index : arr) {
            if (index[1] > 0) {
                if (i == 0) {
                    ret[i][0] = index[0];
                    ret[i][1] = index[1];
                } else {
                    if (index[1] > ret[i - 1][1]) {
                        int[] tmp = new int[2];
                        tmp = ret[i - 1];
                        ret[i - 1] = index;
                        ret[i] = tmp;
                    } else
                        ret[i] = index;
                }
                i++;

            }
        }
        return ret;
    }

    public static String[] printMap(Map<Character, Integer> mymap, Integer max) {
        String[] arr = new String[mymap.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : mymap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + "*".repeat(entry.getValue()));
            arr[i] = "*".repeat(entry.getValue()) + "entry.getValue()" + " ".repeat(max - entry.getValue());
            i++;
        }
        return arr;
    }

}