
public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}