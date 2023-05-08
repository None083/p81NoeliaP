/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p81noelia;

import java.time.LocalDate;


public class Factura {
    
    private String codigo;
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporte;

    public Factura() {
    }


    public Factura(String codigo, LocalDate fechaEmision, String descripcion, double totalImporte) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporte= totalImporte;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fechaEmision=" + fechaEmision + ", descripcion=" + descripcion + ", totalImporte=" + totalImporte + '}';
    }

    

    

    
    
    
}
