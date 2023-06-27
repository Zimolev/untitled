package SeminarWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 3) Написать перевод их Римских цифр в арабские:
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * Примеры:
 * 1)	ввод: s = "LVIII"
 * вывод: 58
 * разбор: L = 50, V= 5, III = 3.
 * 2)	ввод: s = "MCMXCIV"
 * вывод: 1994
 * разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class SeminarWorkThree {
    public static void main(String[] args) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римскую цифру в формате I, V, X, L, C, D, M: ");
        String str = scanner.next();
        System.out.println("arabicNumbers(romanNumerals, str) = " + arabicNumbers(romanNumerals, str));
    }

    /**
     * @apiNote перевод их Римских цифр в арабские
     * @param map словарь с принадлежностью римской цифре арабской
     * @param str римские цифры
     * @return арабское число
     */
    public static Integer arabicNumbers(Map<Character, Integer> map, String str) {
        int result = map.get(str.charAt(str.length()-1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result -= map.get(str.charAt(i));
            } else {
                result += map.get(str.charAt(i));
            }
        }
        return result;
    }
}
