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
public class Controlador {
    
    ModeloBanco Banco;

    public Controlador() {
        Banco = new ModeloBanco("AV Villas");

        Cliente cliente1 = new Cliente("Jorge", "Rudas", 46468465, 500000, 2500000);
        Cliente cliente2 = new Cliente("Lucas", "Arias", 12458796, 210000, 1500000);
        Cliente cliente3 = new Cliente("Sofia", "Rodriguez", 25458815, 356000, 2000000);

        Banco.addCliente(cliente1);
        Banco.addCliente(cliente2);
        Banco.addCliente(cliente3);
    }
    
    public ModeloBanco getBanco() {
        return Banco;
    }

    public void setBanco(ModeloBanco Banco) {
        this.Banco = Banco;
    }
    
    
    
}
