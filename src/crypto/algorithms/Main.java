package crypto.algorithms;

import java.util.Scanner;
import java.util.Scanner.*;

/**
 * Main.java
 * Created by Madalina.Cozma on 2/27/2015.
 */
public class Main {
    public static void main(String []args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int lines;
        String plainText, cipherText, decryptedText;

        System.out.println("== Rail Fence ==");
        RailFence railFence = new RailFence();

        System.out.print("Dati textul pentru criptat/decriptat: ");
        plainText = scanner.nextLine();

        System.out.print("Dati numarul de linii: ");
        lines = scanner.nextInt();

        cipherText = railFence.encryption(plainText, lines);
        System.out.println("Textul criptat este: " + cipherText);

        decryptedText = railFence.decryption(cipherText, lines);

        System.out.println("Textul decriptat este: " + decryptedText);

        int lines2;
        String plainText2, cipherText2, decryptedText2;
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("== Caesar ==");
        Caesar caesar = new Caesar();

        System.out.print("Dati textul pentru criptat/decriptat: ");
        plainText2 = scanner2.nextLine();

        System.out.print("Dati numarul de shiftari: ");
        lines2 = scanner2.nextInt();

        cipherText2 = caesar.encryption(plainText2, lines2);
        System.out.println("Textul criptat este: " + cipherText2);

        decryptedText2 = caesar.decryption(cipherText2, lines2);
        System.out.println("Textul decriptat este: " + decryptedText2);




    }
}
