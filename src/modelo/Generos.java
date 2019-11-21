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
public class Generos {
    private int id_genero;
    private String genero;
    
    public Generos(){
        
    }

    public Generos(int id_genero, String genero) {
        this.id_genero = id_genero;
        this.genero = genero;
    }

    public Generos(int id_genero) {
        this.id_genero = id_genero;
    }

    public Generos(String genero) {
        this.genero = genero;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Generos{" + "id_genero=" + id_genero + ", genero=" + genero + '}';
    }
    
    
}
