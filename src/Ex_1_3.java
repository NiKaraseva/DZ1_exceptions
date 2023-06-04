import java.util.HashMap;
import java.util.Map;

public class Ex_1_3 {

    // 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    // 1.3 Метод который принимает 2 строки и проверяет, являются ли они изоморфными.
    public static boolean checkIzo(String s1, String s2){

        if (s1.length() != s2.length()){
            throw new RuntimeException("Строки разной длины, введите строки одинаковой длины");
        }
        Map<Character, Character> map = new HashMap<>(); {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            for (int i = 0; i < c1.length; i++) {
                if (map.containsKey(c1[i])){
                    if (c2[i] != map.get(c1[i])) {
                        return false;
                    }
                }
                else {
                    map.put(c1[i], c2[i]);
                }
            }
        }
        return true;
    }
}
