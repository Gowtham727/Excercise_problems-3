 class LongestCommonPrefix {
    public static String Prefix(String[] string) {
        if (string == null || string.length == 0) {
            return "";
        }

        String prefix = string[0];
        for (int i = 1; i < string.length; i++) {
            while (string[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
public class Ex11 {
    public static void main(String args[])
    {
                String[] words = {"flower", "flow", "flight"};
                System.out.println("Longest Common Prefix: " + Prefix(words));
            }


    }
}
