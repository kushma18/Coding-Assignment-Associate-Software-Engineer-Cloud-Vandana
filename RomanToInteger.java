import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanMap.get(c);

            if (value < prevValue) {
                result -= value; 
            } else {
                result += value; 
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RomanToInteger converter = new RomanToInteger();
        String romanNumeral = sc.next(); 
        int result = converter.romanToInt(romanNumeral);
        System.out.println("The integer representation of " + romanNumeral + " is: " + result);
    }
}
