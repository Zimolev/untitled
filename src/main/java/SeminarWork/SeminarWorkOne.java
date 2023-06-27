package SeminarWork;

import java.util.HashMap;
import java.util.Map;

public class SeminarWorkOne {
    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        String str = "wqeqw qweqweqe,  sdfdsf fdgfdg";
        for (int i = 0; i < str.length(); i++) {
            if (!characterIntegerMap.containsKey(str.charAt(i))){
                characterIntegerMap.put(str.charAt(i), 1);
            }
            else {
                characterIntegerMap.put(str.charAt(i),
                        characterIntegerMap.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> val : characterIntegerMap.entrySet()) {
            System.out.println(val.getKey() + " встречается " + val.getValue() + " раз");
        }
    }
}
