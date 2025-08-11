package labsession8;

public class ExpandCharacters {

	public static void main(String[] args) {
		String input = "a2b3c4";
        String output = "";

        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);           // e.g., 'a'
            int count = input.charAt(i + 1) - '0'; // convert char digit to int

            for (int j = 0; j < count; j++) {
                output += ch;
            }
        }

        System.out.println(output); // Output: aabbbcccc
    }
}
