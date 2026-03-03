import java.util.HashMap;
import java.util.Map;

public class UC8OOPSBannerApp {

    public static Map<Character, String[]> buildPatterns() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        patterns.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        patterns.put('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });

        return patterns;
    }

    public static void renderBanner(String word, Map<Character, String[]> patterns) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] charPattern = patterns.get(c);
                if (charPattern != null) {
                    line.append(charPattern[row]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = buildPatterns();
        String word = "OOPS";
        renderBanner(word, patterns);
    }
}