public class StringManipulatorMika {

    public StringManipulatorMika() {

    }

    public String reverse(String input) {

        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return reversedString;
    }

    public String capitalize(String input) {
        return input.toUpperCase();
    }
}
