/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.subsystem;

/**
 *
 * @author JUANCA
 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileWriter {
    public void write (String fileName, String content){
        try{
            Files.write(Paths.get(fileName), content.getBytes());
            System.out.println("Escribiendo en " + fileName + ": " + content);
            
        } catch(IOException e){
            System.err.println("Error al escribir el archivooo: " + e.getMessage());
        }
    }
}
