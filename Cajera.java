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
public class Cajera {
    
    private String nombre;
    private Cliente cliente;
    private Transaccion transaccion;
    private long initialTime;

    public Cajera(String nombre, Cliente cliente, Transaccion transaccion, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.transaccion = transaccion;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void procesarCompra() {

        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombres() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        for (int i = 0; i < this.transaccion.getCantidap().size(); i++) {
            this.esperarXsegundos(transaccion.getCantidap().size()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " del cliente " + this.cliente.getNombres() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");
        }

        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                + this.cliente.getNombres() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

   

    
    
    
}
