package crypto.algorithms;

/**
 * RailFence.java
 * Created by Madalina.Cozma on 2/27/2015.
 */
public class RailFence {

    String encryption(String text, int lines) throws Exception {
        int r = lines;
        int length = text.length();
        int c = length / lines;
        char m[][] = new char[r][c];
        int index = 0;

        String cipherText = "";

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (index != length)
                    m[j][i] = text.charAt(index ++);
                else
                    m[j][i] =  '-';
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] != '-')
                    cipherText += m[i][j];
            }
        }
        return cipherText;
    }


    String decryption(String cipherText, int lines) throws Exception {
        int r = lines;
        int length = cipherText.length();
        int c = length / lines;
        char m[][] = new char[r][c];
        int index = 0;

        String text = "";

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = cipherText.charAt(index ++);
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                text += m[j][i];
            }
        }

        return text;
    }
}

