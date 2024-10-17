public class CaesarCipher {
    public StringBuilder cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLowerCase(character)) {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else if(Character.isUpperCase(character)) {
                int originalAlphabetPosition = character - 'A';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('A' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result;
    }
    public StringBuilder decipher(String message, int offset) {
        return cipher(message, 26 - (offset % 26));
    }



    public StringBuilder cipherRus(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLowerCase(character)) {
                int originalAlphabetPosition = character - 'а';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 33;
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else if (Character.isUpperCase(character)) {
                int originalAlphabetPosition = character - 'А';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 33;
                char newCharacter = (char) ('А' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result;
    }
    public  StringBuilder decipherRus(String message, int offset) {
        return cipherRus(message, 33 - (offset % 33));
    }



    public void bruteForceDecipher(String message) {
        System.out.println("Brute Force Decipher Results:");
        for (int offset = 1; offset < 26; offset++) {
            StringBuilder decipheredMessage = decipher(message, offset);
            System.out.println("Offset: " + offset + " - " + decipheredMessage);
        }
    }
    public void bruteForceDecipherRus(String message) {
        System.out.println("Brute Force Decipher Results (Russian):");
        for (int offset = 1; offset < 33; offset++) {
            StringBuilder decipheredMessage = decipherRus(message, offset);
            System.out.println("Offset: " + offset + " - " + decipheredMessage);
        }
    }



    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        StringBuilder cipheredMessage = cipher.cipher("He told me i could never teach a llama to drive", 3);
        StringBuilder decipheredMessage = cipher.decipher("Kh wrog ph l frxog qhyhu whdfk d oodpd wr gulyh", 3);
        CaesarCipher cipherRus = new CaesarCipher();
        StringBuilder cipheredMessageRus = cipherRus.cipherRus("Он сказал мне, что я никогда не смогу научить ламу водить машину", 3);
        StringBuilder decipheredMessageRus = cipher.decipherRus("Ср фнгкго при, ъхс б рлнсжзг ри фпсжц ргцълхя огпц есзлхя пгылрц", 3);


        System.out.println(cipheredMessage);
        System.out.println(decipheredMessage);
        System.out.println(cipheredMessageRus);
        System.out.println(decipheredMessageRus);

        cipher.bruteForceDecipher("Kh wrog ph l frxog qhyhu whdfk d oodpd wr gulyh");
        cipher.bruteForceDecipherRus("Ср фнгкго при, ъхс б рлнсжзг ри фпсжц ргцълхя огпц есзлхя пгылрц");

    }
}
