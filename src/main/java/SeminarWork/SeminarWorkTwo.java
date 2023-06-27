package SeminarWork;

import java.util.HashMap;
import java.util.Map;

/**
 Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 В противном случае (false).
 */
public class SeminarWorkTwo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("trueOrFalse(arr) = " + trueOrFalse(arr));
    }

    public static boolean trueOrFalse(int[] arr){
        Map<Integer, Integer> doubleCountMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (doubleCountMap.containsKey(arr[i])) {
                return true;
            }
            doubleCountMap.put(arr[i], 1);
        }
        return false;
    }
}