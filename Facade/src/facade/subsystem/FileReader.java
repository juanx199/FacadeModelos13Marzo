/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.subsystem;

/**
 *
 * @author JUANCA
 */
public class FileReader {
    public String read(String fileName){
        System.out.print("Leyendo el archivo:" + fileName);
        
        return "Contenido recuperado del archivo";
    }
}
