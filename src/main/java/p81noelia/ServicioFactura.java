/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p81noelia;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class ServicioFactura {
    
    public static void lecturaFactura(String id, List<Factura> lista) {
        String linea;
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                lista.add(new Factura(tokens[0], LocalDate.parse(tokens[1]), 
                        tokens[2], Double.valueOf(tokens[3])));
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
