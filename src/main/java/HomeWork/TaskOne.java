package HomeWork;

import java.util.*;

/**
 * 1) Подсчитать количество искомого слова, через map (наполнением значение,
 * где искомое слово будет являться ключом), вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase(). equalsIgnoreCase()
 * (Усложнение - игнорировать пунктуацию)
 */
public class TaskOne {
    public static void main(String[] args) {

        String str = "Подсчитать количество искомого слова, через map (наполнением значение, \n" +
                " где искомое слово будет являться ключом), вносить все слова не нужно\n" +
                " Пример:\n" +
                " Россия идет вперед всей планеты. Планета — это не Россия.\n" +
                " Запрос: Россия\n" +
                " Ответ: Россия - 2";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово которое хотите найти: ");
        String strSearch = scanner.next();
        countWords(str, strSearch);
    }

    /**
     * @apiNote Подсчитывает количество искомого слова в строке
     * @param str входная строка
     * @param strSearch искомое слово
     */
    private static void countWords(String str, String strSearch) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        List<String> words;
        words = List.of(str.trim().split("\\p{P}?[ \\t\\n\\r]+"));

        for (String word : words) {
            if (word.equalsIgnoreCase(strSearch)) {
                if (!stringIntegerMap.containsKey(word)) {
                    stringIntegerMap.put(word, 1);
                } else {
                    stringIntegerMap.put(word, (stringIntegerMap.get(word) + 1));
                }
            }
        }
        System.out.println(stringIntegerMap.keySet() + " встречается " + stringIntegerMap.values() + " раз(а)");
    }
}

