public class UniqueChars {
    public static void main(String[] args) {
        

        String input = String.join(" ", args);
        System.out.println(uniqueChars(input));
    }

    public static String uniqueChars(String s) {
        int i = 0;
        int length = s.length();
        String b = "";

        while (i < length) {
            char c = s.charAt(i);

            if (c == ' ' || b.indexOf(String.valueOf(c)) == -1) {
                b += c;
            }
            
            i++;
        }

        return b;
    }
}
