package Class;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Names {
    
    private Map<String, Integer> employersMap = new HashMap<>();
    private String[] employers = new String[] {

            "Иван", "Иванов","Светлана",
            "Петрова","Кристина",
            "Белова","Анна",
            "Мусина","Анна",
            "Крутова","Иван",
            "Юрин","Петр",
            "Лыков","Павел",
            "Чернов","Петр",
            "Чернышов","Мария",
            "Федорова","Марина",
            "Светлова","Мария",
            "Савина","Мария",
            "Рыкова","Марина", 
            "Лугова","Анна", "Владимирова",
            "Иван", "Мечников","Петр",
            "Петин ","Иван", "Ежов"
        
        };

    public void findDoubleName(){

        for (int i = 0; i < employers.length; i += 2) {

            if (employersMap.containsKey(employers[i])) {

                employersMap.replace(employers[i], employersMap.get(employers[i]) + 1);

            } else {

                employersMap.put(employers[i], 1);

            }

        }

        System.out.println(employersMap);

        Map<String, Integer> employersMapSorted = new LinkedHashMap<>();

        int max = 1;

        for (int i : employersMap.values()) {

            if (i > max) {

                max = i;

            }

        }

        for (int i = max; i > 0; i--) {

            for (Map.Entry<String, Integer> value : employersMap.entrySet()) {

                String k = value.getKey();

                if (employersMap.get(k) == i) {

                    employersMapSorted.put(k, employersMap.get(k));

                }

            }

        }

        System.out.println(employersMapSorted);

    }
}
