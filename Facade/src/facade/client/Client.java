/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.client;
import facade.FileFacade;
/**
 *
 * @author JUANCA
 */
public class Client {
    public static void main(String[] args){
    String filePath = "test.txt";
    String originalContent = "¡Hola, patrón facade en Java! blblb";
    
    Facade facade = Facade.getInstance();
    
    System.out.println("\n iniciando la escritura");
    facade.writeEncryptedFile(filePath, originalContent);
    
    System.out.println("\n Iniciando lectura");
    
    String result = facade.readDecryptedFile(filePath);
    System.out.println("\n Contenido mostrado al cliente:) + result);
    }
}
