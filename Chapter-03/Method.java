public class Method {
    public static void main(String[] args) {

        String name = "       TUSHAR sharma TuShArShArMa         ";
        System.out.println(name);

        // Length of string
        int length = name.length();
        System.out.println(length);

        // Lower case
        System.out.println(name.toLowerCase());

        // Upper case
        System.out.println(name.toUpperCase());

        // Trim spaces
        System.out.println(name.trim());

        // Substring
        System.out.println(name.substring(8));
        System.out.println(name.substring(9, 23));

        // Replace characters
        System.out.println(name.replace('A', 'X'));

        // Starts with
        System.out.println(name.startsWith("  "));

        // Ends with
        System.out.println(name.endsWith("hh"));

        // Character at index
        System.out.println(name.charAt(8));

        // Index of character
        System.out.println(name.indexOf("u"));
        System.out.println(name.indexOf("U", 9));
    }
}
