/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p81noelia;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author noelia
 */
public interface IDAO {

    // Método para obtener todos los registros de la tabla
    List<Factura> getAll() throws SQLException;

    // Método para obtener un registro a partir del código
    Factura findByCodigo(String codigo) throws SQLException;

    // Método para insertar un registro
    int insertFactura(Factura f) throws SQLException;

    // Método para insertar varios registros
    int insertFactura(List<Factura> lista) throws SQLException;

    // Método para borrar una factura
    int deleteFactura(Factura f) throws SQLException;

    // Método para borrar toda la tabla
    int deleteTabla() throws SQLException;

    // Método para modificar una persona. Se modifica a la factura que tenga ese código
    // con los nuevos datos que traiga la factura 'nuevosDatos'
    int updateFactura(String codigo, Factura nuevosDatos) throws SQLException;
}
