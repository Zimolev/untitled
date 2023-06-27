package HomeWork;
import java.util.*;
import java.util.stream.Collectors;

/**
 Пусть дан список сотрудников:

 Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина
 Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов
 Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
 Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов

 Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */
public class TaskTwo {
    public static void main(String[] args) {
        Map<String, Integer> nameStaff = new HashMap<>();
        String[] staff = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };
        countName(staff, nameStaff);
        sortedStaff(nameStaff);
    }

    /**
     * @param people
     * @param nameStaff
     * @apiNote Функция, считающая кол-во повторений имен сотрудников
     */
    public static void countName(String[] people, Map<String, Integer> nameStaff) {
        for (String person : people) {
            String name = person.split(" ")[0];
            if (nameStaff.containsKey(name)) {
                nameStaff.put(name, nameStaff.get(name) + 1);
            } else {
                nameStaff.put(name, 1);
            }
        }
    }

    /**
     * @apiNote Функция сотртировки по убыванию популярности имени
     * САМ НЕ СМОГ СДЕЛАТЬ, НАШЕЛ РЕШЕНИЕ В ИНЕТЕ, НО НЕ ПОНИМАЮ ЧТО И КАК ОНА ДЕЛАЕТ
     * @param namePeople
     */
    public static void sortedStaff(Map<String, Integer> namePeople) {
        Map<String, Integer> sortedName = namePeople.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedName.entrySet().forEach(System.out::println);

    }
}
