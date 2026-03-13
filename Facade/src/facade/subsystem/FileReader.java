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
import java.nio.IOException;

public class FileReader {
    public String read(String fileName){
        try{
            // Lee los bytes y los pasa a string
            System.out.println("Leyendo este archivo: " + fileName);
            return new String(Files.readAllBytes(Paths.get(fileName)));
        }catch (IOException e){
            System.err.println("Error leyendo el archivo" + e.getMessage());
            return"";
        }    
    }
}
