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
public class Lector {
    
    private int id_lector;
    private String nombre;
    private String primerAp;
    private String segundoAp;
    private String fecha;
    private String telefono;
    private String calle;
    private String NoCalle;
    private String colonia;

    public Lector() {
    }

    public Lector(int id_lector, String nombre, String primerAp, String segundoAp, String fecha, String telefono, String calle, String NoCalle, String colonia) {
        this.id_lector = id_lector;
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.fecha = fecha;
        this.telefono = telefono;
        this.calle = calle;
        this.NoCalle = NoCalle;
        this.colonia = colonia;
    }

    public int getId_lector() {
        return id_lector;
    }

    public void setId_lector(int id_lector) {
        this.id_lector = id_lector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return NoCalle;
    }

    public void setNoCalle(String NoCalle) {
        this.NoCalle = NoCalle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Override
    public String toString() {
        return "Lector{" + "id_lector=" + id_lector + ", nombre=" + nombre + ", primerAp=" + primerAp + ", segundoAp=" + segundoAp + ", fecha=" + fecha + ", telefono=" + telefono + ", calle=" + calle + ", NoCalle=" + NoCalle + ", colonia=" + colonia + '}';
    }
    
    
    
}
