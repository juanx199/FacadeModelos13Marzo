/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.subsystem;

/**
 *
 * @author JUANCA
 */
public class FileEncryptor {
    private static final int SHIFT = 10;
    public String encrypt(String data){
        System.out.print("[FileEncryptor] Cifrando..");
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()){
            encrypted.append((char)(c + SHIFT));
        }
        return encrypted.toString();
    }

    public String decrypt (String data){
        System.out.println("[FileEncryptor] Desencritpando ...");
        StringBuilder decrypted = new StringBuilder();
        for (char c : data.toCharArray()){
            decrypted.append((char) (c-SHIFT));
        }
        return decrypted.toString();
    }
}
