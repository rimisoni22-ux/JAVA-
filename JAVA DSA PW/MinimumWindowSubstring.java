import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        // Step 1: Build frequency map for T
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sliding window
        Map<Character, Integer> windowFreq = new HashMap<>();
        int have = 0; // number of unique characters that meet required frequency
        int need = tFreq.size(); // total unique characters in T
        int left = 0, minLen = Integer.MAX_VALUE, minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            // Check if current character matches the needed frequency
            if (tFreq.containsKey(c) && windowFreq.get(c).intValue() == tFreq.get(c).intValue()) {
                have++;
            }

            // Try to shrink the window
            while (have == need) {
                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                // Remove char at left from window
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (tFreq.containsKey(leftChar) && windowFreq.get(leftChar).intValue() < tFreq.get(leftChar).intValue()) {
                    have--;
                }
                left++; // shrink from the left
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    // For testing
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // Output: BANC
        System.out.println(minWindow("AABBBCAC", "ABC"));      // Output: BCA
    }
}
