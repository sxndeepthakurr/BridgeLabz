public class StringFunctions {
    // 1. Count Vowels and Consonants
    public static void countVC(String str) {
        int v = 0, c = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }

    // 2. Reverse a String
    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    // 3. Check Palindrome
    public static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    // 4. Remove Duplicates
    public static String removeDup(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                res.append(ch);
            }
        }
        return res.toString();
    }

    // 5. Longest Word in Sentence
    public static String longestWord(String line) {
        String[] words = line.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        return longest;
    }

    // 6. Count Substring Occurrences
    public static int countSub(String str, String sub) {
        int count = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }

    // 7. Toggle Case
    public static String toggleCase(String str) {
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                res.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                res.append(Character.toUpperCase(ch));
            else
                res.append(ch);
        }
        return res.toString();
    }

    // 8. Lexicographical Compare
    public static String compareStr(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return (a.charAt(i) < b.charAt(i)) ? "\"" + a + "\" comes before \"" + b + "\"" 
                                                  : "\"" + b + "\" comes before \"" + a + "\"";
            }
        }
        if (a.length() == b.length()) return "Strings are equal";
        return (a.length() < b.length()) ? "\"" + a + "\" comes before \"" + b + "\"" 
                                         : "\"" + b + "\" comes before \"" + a + "\"";
    }

    // 9. Most Frequent Character
    public static char mostFreq(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;
        int max = 0;
        char res = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                res = (char) i;
            }
        }
        return res;
    }

    // 10. Remove Specific Character
    public static String removeChar(String str, char ch) {
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) res.append(c);
        }
        return res.toString();
    }

    // 11. Anagram Check
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[256];
        for (char ch : a.toCharArray()) freq[ch]++;
        for (char ch : b.toCharArray()) freq[ch]--;
        for (int n : freq) if (n != 0) return false;
        return true;
    }

    // 12. Replace Word in Sentence
    public static String replaceWord(String line, String oldW, String newW) {
        String[] words = line.split(" ");
        StringBuilder res = new StringBuilder();
        for (String w : words) {
            res.append(w.equals(oldW) ? newW : w).append(" ");
        }
        return res.toString().trim();
    }

    // Main Method for Testing
    public static void main(String[] args) {
        countVC("Hello World");
        System.out.println("Reversed: " + reverse("Java"));
        System.out.println("Is Palindrome: " + isPalindrome("madam"));
        System.out.println("No Duplicates: " + removeDup("programming"));
        System.out.println("Longest Word: " + longestWord("The quick brown fox jumps"));
        System.out.println("Sub Count: " + countSub("ababab", "ab"));
        System.out.println("Toggle: " + toggleCase("HeLLo123"));
        System.out.println(compareStr("apple", "banana"));
        System.out.println("Most Frequent: " + mostFreq("success"));
        System.out.println("Removed 'l': " + removeChar("Hello World", 'l'));
        System.out.println("Are Anagrams: " + isAnagram("listen", "silent"));
        System.out.println("Replaced: " + replaceWord("I love Java and Java is powerful", "Java", "Python"));
    }
}
