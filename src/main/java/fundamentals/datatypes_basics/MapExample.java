package fundamentals_java.datatypes_basics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Nina");
        map.put(101, "Test");
        map.put(102, "Ina");
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // comparing by key
        System.out.println("Comparing by key");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        // comparing by key reverse
        System.out.println("Comparing by key reverse");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
        //comparing by value
        System.out.println("Comparing by value");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        //comparing by value desc
        System.out.println("Comparing by value desc");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

}
