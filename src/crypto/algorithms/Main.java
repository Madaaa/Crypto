package crypto.algorithms;

import java.util.Scanner;
import java.util.Scanner.*;

/**
 * Main.java
 * Created by Madalina.Cozma on 2/27/2015.
 */
public class Main {
    public static void main(String []args) throws Exception {
        RailFence rf = new RailFence();
        Scanner scn = new Scanner(System.in);
        int rails;

        String plainText, cipherText, decryptedText;

        System.out.println("enter plain text");
        plainText = scn.nextLine();

        System.out.println("Enter rails for Encryption:");
        rails = scn.nextInt();

        cipherText = rf.Encryption(plainText, rails);
        System.out.println("Encrypted text is:\n" + cipherText);

        decryptedText = rf.Decryption(cipherText, rails);

        System.out.println("Decrypted text is:\n" + decryptedText);
    }
}
