/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sala 8
 */
public class Transaccion extends Cuenta{
    
    private int id_transacion;
    List <Cuenta> cantidap;

    public Transaccion(int id_transacion, List<Cuenta> cantidap, int cantidad) {
        super(cantidad);
        this.id_transacion = id_transacion;
        this.cantidap = cantidap;
    }

    public int getId_transacion() {
        return id_transacion;
    }

    public void setId_transacion(int id_transacion) {
        this.id_transacion = id_transacion;
    }

    public List<Cuenta> getCantidap() {
        return cantidap;
    }

    public void setCantidap(List<Cuenta> cantidap) {
        this.cantidap = cantidap;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
  

  public void depositar(){
        
      Corriente cor= new Corriente(101,"Cuenta Corriente", 1000);
      Ahorro aho= new Ahorro(102,"Cuenta Ahorro", 2000);
      
        if(cor.getNom_corriente().equals("Cuenta Corriente") && aho.getNom_ahorro().equals("Cuenta Ahorro")){
            
            int total = 0;
            total=total+cantidad;
        
            System.out.println("El total en la cuenta es: " + total);
       }
   } 
  
    public void retirar(){
         
        Corriente cor = new Corriente(101,"Cuenta Corriente", 1000);
        Ahorro aho = new Ahorro(102,"Cuenta Ahorro", 2000);
        Cheque che = new Cheque(103,"Cuenta Cheque", 3000);
        
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Escriba el valor que va a retirar: ");

        double total;
        total = cantidad;
        
            if(cor.getNom_corriente().equals("Cuenta Corriente")){

                double valor_retiro = teclado.nextInt();
                total=valor_retiro-total;

                System.out.println("El total en la cuenta es: " + total);
            }
            if(aho.getNom_ahorro().equals("Cuenta Ahorro") && che.getNom_cheque().equals("Cuenta Cheque")){

                double valor_retiro = teclado.nextInt();
                total=total-valor_retiro;

                System.out.println("El total en la cuenta es: " + total);

            }
    }
    
}
