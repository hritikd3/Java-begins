// import java.io.FileReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class LabPractical {
//     public static void main(String[] args) throws Exception {
//         String temp = "";
//         ArrayList<String> arr = new ArrayList<>();
//         FileReader fr = new FileReader("D:\\test.txt");

//         int i;
//         while ((i = fr.read()) != -1)
//             temp += (char) i;

//         String[] words = temp.split(" ");
//         arr.addAll(Arrays.asList(words));

//         // List of keywords and special characters
//         List<String> keywords = Arrays.asList("if", "else", "while", "for", "switch", "case");
//         List<Character> specialChars = Arrays.asList('!', '@', '#', '$', '%', '&');

//         for (String word : arr) {
//             if (word.isEmpty()) {
//                 System.out.println("Consume Space");
//             } else if (keywords.contains(word)) {
//                 System.out.println("Keyword: " + word);
//             } else if (hasSpecialCharacter(word, specialChars)) {
//                 System.out.println("Special Character: " + word);
//             } else {
//                 System.out.println("Word: " + word);
//             }
//         }
//     }

//     // Method to check if a word contains any special characters
//     public static boolean hasSpecialCharacter(String word, List<Character> specialChars) {
//         for (char c : word.toCharArray()) {
//             if (specialChars.contains(c)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class LabPractical {
    public static void main(String[] args) throws Exception {
        String temp = "";
        ArrayList<String> words = new ArrayList<>();
        FileReader fr = new FileReader("D:\\test.txt");

        int i;
        while ((i = fr.read()) != -1)
            temp += (char) i;

        // Split the input text into words
        words.addAll(Arrays.asList(temp.split("\\s+")));

        // List of keywords and special characters
        List<String> keywords = Arrays.asList("if", "else", "while", "for", "switch", "case");
        List<Character> specialChars = Arrays.asList('!', '@', '#', '$', '%', '&');

        for (String word : words) {
            if (word.isEmpty()) {
                System.out.println("Consume Space");
            } else if (keywords.contains(word)) {
                System.out.println("Keyword: " + word);
            } else {
                // Check if the word contains any special character
                boolean hasSpecialChar = false;
                for (char c : word.toCharArray()) {
                    if (specialChars.contains(c)) {
                        hasSpecialChar = true;
                        break;
                    }
                }

                if (hasSpecialChar) {
                    System.out.println("Special Character: " + word);
                } else {
                    System.out.println("Word: " + word);
                }
            }
        }
    }
}
