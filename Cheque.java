/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;



/**
 *
 * @author Sala 8
 */
public class Cheque extends Cuenta{
    
    private int id_cheque;
    private String nom_cheque;

    public Cheque(int id_cheque, String nom_cheque, int cantidad) {
        super(cantidad);
        this.id_cheque = id_cheque;
        this.nom_cheque = nom_cheque;
    }

    public int getId_cheque() {
        return id_cheque;
    }

    public void setId_cheque(int id_cheque) {
        this.id_cheque = id_cheque;
    }

    public String getNom_cheque() {
        return nom_cheque;
    }

    public void setNom_cheque(String nom_cheque) {
        this.nom_cheque = nom_cheque;
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
