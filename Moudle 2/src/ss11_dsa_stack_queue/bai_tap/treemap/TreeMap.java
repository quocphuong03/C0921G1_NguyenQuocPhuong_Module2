package ss11_dsa_stack_queue.bai_tap.treemap;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static Map<Character, Integer> checkDisplay(String string) {
        char[] array = string.toLowerCase().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {

            if (!map.containsKey(array[i])) {

                map.put(array[i], 1);
            } else {

                map.replace(array[i], map.get(array[i]) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println("Nhập từ cần check số lần xuất hiện : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (Map.Entry<Character, Integer> check : checkDisplay(string).entrySet()) {
            System.out.println(check);
        }
    }
}
