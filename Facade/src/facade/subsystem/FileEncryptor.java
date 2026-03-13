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
    public String encrypt(String data){
        return "[Encriptado]" + data + "[Encriptado]";
    }
    
    public String decrypt (String data){
        System.out.println("Desencriptando ...");
        return data.replace("[Encriptado]", "");
    }
}
