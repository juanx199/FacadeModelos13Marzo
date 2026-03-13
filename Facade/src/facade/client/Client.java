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
    String originalContent = "Ejemplo de Facade trabajo de modelos blblbl";
    
    FileFacade facade = FileFacade.getInstance();
    
    System.out.println(" iniciando la escritura");
    facade.writeEncryptedFile(filePath, originalContent);
    
    System.out.println("\n Iniciando lectura");
    
    
    String result = facade.readDecryptedFile(filePath);
    System.out.println("\n Cliente:" + result);
    }
}