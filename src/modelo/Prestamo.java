/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author erik
 */
public class Prestamo {
    
    private int id_libro_prestamo;
    private int id_lector_prestamo;
    private String fecha_prestamo;
    private String fecha_devolucion;
    private boolean multa;
    
    public Prestamo(){
        
    }

    public Prestamo(int id_libro_prestamo, int id_lector_prestamo, String fecha_prestamo, String fecha_devolucion, boolean multa) {
        this.id_libro_prestamo = id_libro_prestamo;
        this.id_lector_prestamo = id_lector_prestamo;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.multa = multa;
    }

    public int getId_libro_prestamo() {
        return id_libro_prestamo;
    }

    public void setId_libro_prestamo(int id_libro_prestamo) {
        this.id_libro_prestamo = id_libro_prestamo;
    }

    public int getId_lector_prestamo() {
        return id_lector_prestamo;
    }

    public void setId_lector_prestamo(int id_lector_prestamo) {
        this.id_lector_prestamo = id_lector_prestamo;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public boolean isMulta() {
        return multa;
    }

    public void setMulta(boolean multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id_libro_prestamo=" + id_libro_prestamo + ", id_lector_prestamo=" + id_lector_prestamo + ", fecha_prestamo=" + fecha_prestamo + ", fecha_devolucion=" + fecha_devolucion + ", multa=" + multa + '}';
    }
    
    
    
}
