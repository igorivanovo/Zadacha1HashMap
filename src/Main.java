import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text0 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String text = text0.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                if (map.containsKey(letter)) {
                    int value = map.get(letter);
                    value++;
                    map.put(letter, value);
                } else {
                    map.put(letter, 1);
                }
            }
        }
        int maxValue = -1;
        int minValue = Integer.MAX_VALUE;
        char maxKey = 0;
        char minKey = 0;
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
            if (value < minValue) {
                minValue = value;
                minKey = key;
            }
        }
        System.out.println("Максимальный повтор символов в тексте  " + maxKey + " == " + maxValue + " раза");
        System.out.println("Минимальный повтор символов в тексте  " + minKey + " == " + minValue + " раза");

    }
}