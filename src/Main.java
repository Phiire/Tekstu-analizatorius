import java.util.Scanner; //pridedamas skeneris

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentence: ");
        String inputText = scanner.nextLine(); //Čia pavadinamas skeneris ir šioje vietoje įrašomas sakinys
        scanner.close(); //uždaromas skeneris optimizacijai
        int wordCount = inputText.split(" ").length; //suskaičiuojamas žodžių kiekis
        System.out.println("Your sentence has:\n" + wordCount + " words;");

        int symbolCount = inputText.length(); //Suskaičiuojamas simbolių kiekis
        System.out.println(symbolCount + " symbols;");

        int countMax = 0; // Man draugas padėjo su šitu didžiausio simbolio suradimo kodu, kadangi nelabai suprantu
        char letterMax = 'a';
        for (int letter = 0; letter <= 26; letter++) {
            int countCur = 0;
            for (int position = 0; position < inputText.length(); position++) {
                if (inputText.charAt(position) == (char) ((int) 'a' + letter)) {
                    countCur += 1;
                }
            }
            if (countCur > countMax) {
                letterMax = (char) ((int) 'a' + letter);
                countMax = countCur;
            }
        }
        System.out.println("Daugiausiai pasikartojantis simbolis - " + letterMax + ";");

        StringBuilder reverseSentence = new StringBuilder(inputText);
        reverseSentence.reverse(); //sakinys parašomas atbulai
        System.out.println("This sentence in reverse would be - \"" + reverseSentence + "\".");


    }
}