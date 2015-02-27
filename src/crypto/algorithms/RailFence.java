package crypto.algorithms;

/**
 * RailFence.java
 * Created by Madalina.Cozma on 2/27/2015.
 */
public class RailFence {

    String Encryption(String plainText, int rails) throws Exception {
        int r = rails;
        int length = plainText.length();
        int c = length / rails;
        char mat[][] = new char[r][c];
        int index = 0;

        String cipherText = "";

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (index != length)
                    mat[j][i] = plainText.charAt(index ++);
                else
                    mat[j][i] =  '-';
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] != '-')
                    cipherText += mat[i][j];
            }
        }
        return cipherText;
    }


    String Decryption(String cipherText, int rails) throws Exception {
        int r = rails;
        int length = cipherText.length();
        int c = length / rails;
        char mat[][] = new char[r][c];
        int index = 0;

        String plainText = "";

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = cipherText.charAt(index ++);
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                plainText += mat[j][i];
            }
        }

        return plainText;
    }
}

