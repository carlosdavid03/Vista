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
public class Ahorro extends Cuenta {
    
    private int id_ahorro;
    private String nom_ahorro;

    public Ahorro(int id_ahorro, String nom_ahorro, int cantidad) {
        super(cantidad);
        this.id_ahorro = id_ahorro;
        this.nom_ahorro = nom_ahorro;
    }

    public int getId_ahorro() {
        return id_ahorro;
    }

    public void setId_ahorro(int id_ahorro) {
        this.id_ahorro = id_ahorro;
    }

    public String getNom_ahorro() {
        return nom_ahorro;
    }

    public void setNom_ahorro(String nom_ahorro) {
        this.nom_ahorro = nom_ahorro;
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
