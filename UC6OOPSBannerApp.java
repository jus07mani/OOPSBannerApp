public class UC6OOPSBannerApp {

    // Helper method for 'O'
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "*****"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*****")
        };
    }

    // Helper method for 'P'
    public static String[] getPPattern() {
        return new String[] {
            String.join("", "*****"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*****"),
            String.join("", "*    "),
            String.join("", "*    "),
            String.join("", "*    ")
        };
    }

    // Helper method for 'S'
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "*****"),
            String.join("", "*    "),
            String.join("", "*    "),
            String.join("", "*****"),
            String.join("", "    *"),
            String.join("", "    *"),
            String.join("", "*****")
        };
    }

    public static void main(String[] args) {
        // Build banner lines by combining character patterns
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern  = getPPattern();
        String[] sPattern  = getSPattern();

        // Assemble the banner line by line
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", oPattern1[i], oPattern2[i], pPattern[i], sPattern[i]);
        }

        // Print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}