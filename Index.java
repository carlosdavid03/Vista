package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Simulación de creación y eliminación de clientes
 * @author jrudasc
 */

public class Index {
    
        public static Iterator clientes;
        public static int cont = 0;
   
    public static void main(String[] arg) {
        
        ModeloBanco AV_Villas = new ModeloBanco("AV Villas");
        short a = 10000;
        
        
        List <Cuenta> listacuenta = new ArrayList<>();
        listacuenta.add(new Ahorro(1001,"Cuente Ahorro",250000));      
        listacuenta.add(new Corriente(1101,"Cuenta Corriente",150000));
        listacuenta.add(new Cheque(1201,"Cuenta Cheque",550000));
       
        List <Cuenta> listacuenta1 = new ArrayList<>();
        listacuenta1.add(new Ahorro(1002,"Cuenta Ahorro",550000));
        listacuenta.add(new Corriente(1102,"Cuenta Corriente",350000));
        listacuenta.add(new Cheque(1202,"Cuenta Cheque",50000));
        
        
        Cliente cliente1 = new Cliente("Jorge", "Rudas", 46468465, 2500000, 25);
        Transaccion transaccion1 = new Transaccion(0001, listacuenta, 1000);
        
        Cliente cliente2 = new Cliente("Lucas", "Arias", 12458796, 2100000, 30);
        Transaccion transaccion2 = new Transaccion(0002, listacuenta1, 1500);
        
        Cliente cliente3 = new Cliente("Sofia", "Rodriguez", 25458815, 3500000, 20);
        Transaccion transaccion3 = new Transaccion(0002, listacuenta1, 1500);
        
        AV_Villas.addCliente(cliente1);
        AV_Villas.addCliente(cliente2);
        AV_Villas.addCliente(cliente3);
        
        for (Cliente e : AV_Villas.getListClientes()) {
            System.out.println(e.getSaldoCuentaAhorros());
        }

        try {
            AV_Villas.recibirSolicitudCredito(cliente1, 1000000, 36);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        for (Cliente e : AV_Villas.getListClientes()) {
            System.out.println(e.getSaldoCuentaAhorros());
        }
        
        clientes = Cliente.iterator;
        
        long initialTime = System.currentTimeMillis();
        
        Cajera cajera1 = new Cajera("Cajera 1", cliente1, transaccion1, initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2, transaccion2, initialTime);
        Cajera cajera3 = new Cajera("Cajera 3", cliente3, transaccion3, initialTime);

        cajera1.start();
        cajera2.start();
        cajera3.start();
         
      /**
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        manejadorCliente.guardar(cliente1);
        manejadorCliente.guardar(transaccion1);
        
        manejadorCliente.guardar(cliente2);
        manejadorCliente.guardar(transaccion2);  
        
        manejadorCliente.guardar(cliente3);
        manejadorCliente.guardar(transaccion3);
        
        manejadorCliente.eliminar(cliente1);
        
        */
      
    }
    
    public static Cliente siguienteCliente() throws Exception {
        if (clientes.hasNext()) {
            return (Cliente) clientes.next();
        } else {
            throw new Exception("No hay mas clientes");
        }
    }
}
