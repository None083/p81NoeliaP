/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p81noelia;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        FacturaDAO facturaDao = new FacturaDAO();
        List<Factura> listaFacturas = new ArrayList<>();

        ServicioFactura.lecturaFactura("facturas.csv", listaFacturas);

        facturaDao.insertFactura(listaFacturas);

        listaFacturas = facturaDao.getAll();
        
        for (Factura f : listaFacturas) {
            System.out.println(f);
        }
        System.out.println("---------------------Borro la factura 1-------------------------------");
        
        facturaDao.deleteFactura(new Factura("1", LocalDate.MIN, "", 0));

        listaFacturas = facturaDao.getAll();
        
        for (Factura f : listaFacturas) {
            System.out.println(f);
        }
        
        System.out.println("-----------------------Busco la factura 3-----------------------------");
        
        System.out.println(facturaDao.findByCodigo("3"));
        
        System.out.println("--------------------------Inserto una nueva factura----------------------------");

        facturaDao.insertFactura(new Factura("100", LocalDate.now(), "holi", 813));
        
        listaFacturas = facturaDao.getAll();
        
        for (Factura f : listaFacturas) {
            System.out.println(f);
        }
        
        System.out.println("------------------Actualizo datos de una factura-------------------------");
        
        facturaDao.updateFactura("2", new Factura("89", LocalDate.now(), "cositas", 38));
        
        listaFacturas = facturaDao.getAll();
        
        for (Factura f : listaFacturas) {
            System.out.println(f);
        }
        
        System.out.println("---------------Borro todos los datos de la tabla----------------------");
        
        System.out.println("Número de filas borradas: " + facturaDao.deleteTabla());
        
    }

}
