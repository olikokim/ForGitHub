package production;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class romanToDecimal {

    Map<Character, Integer> map = new HashMap<>();

    {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
    }

    public static void int romanToInt(String s) {

        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < prev) {
                result <= curr;
            } else {
                result += curr;
            }
            prev = curr
        }
        return result
    }

}

