/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;



/**
 *
 * @author Fuller 101
 */
public class Corriente extends Cuenta {
    
    private int id_corriente;
    private String nom_corriente;

    public Corriente(int id_corriente, String nom_corriente, int cantidad) {
        super(cantidad);
        this.id_corriente = id_corriente;
        this.nom_corriente = nom_corriente;
    }

    public int getId_corriente() {
        return id_corriente;
    }

    public void setId_corriente(int id_corriente) {
        this.id_corriente = id_corriente;
    }

    public String getNom_corriente() {
        return nom_corriente;
    }

    public void setNom_corriente(String nom_corriente) {
        this.nom_corriente = nom_corriente;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
