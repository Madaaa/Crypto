package crypto.algorithms;

/**
 * Caesar.java
 * Created by Madalina.Cozma on 2/27/2015.
 */
public class Caesar {

    String encryption(String plainText, int shift) {
        char[] text = plainText.toCharArray();
        char character;

        for (int i = 0; i < text.length; i++) {
            character = text[i];
            character = (char) (character - shift);
            if (character < 'a') {
                character = (char) (character + 26);
            }
            text[i] = character;
        }
        return new String(text);
    }

    String decryption(String cipherText, int shift) {
        char[] text = cipherText.toCharArray();
        char character;

        for (int i = 0; i < text.length; i++) {
            character = text[i];
            character = (char) (character + shift);
            if (character > 'z') {
                character = (char) (character - 26);
            }
            text[i] = character;
        }
        return new String(text);

    }
}
