/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade;
import facade.subsystem.*;
/**
 *
 * @author JUANCA
 */
public class FileFacade {
    private static FileFacade instance;
    
    private FileReader reader;
    private FileWriter writer;
    private FileEncryptor encryptor;
    
    private FileFacade(){
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.encryptor = new FileEncryptor();
    }
    public static FileFacade getInstance(){
        if(instance == null){
            instance = new FileFacade();
        }
        return instance;
    }
    public void writeEncryptedFile(String fileName, String content){
        String encryptedContent = encryptor.encrypt(content);
        writer.write(fileName, encryptedContent);
    }
    public String readDecryptedFile(String fileName){
        String content = reader.read(fileName);
        return encryptor.decrypt(content);
    }
}
