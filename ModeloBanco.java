/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fuller 101
 */
public class ModeloBanco {
    
    private String nombre;
    private final float tasaPorDefecto = 0.024f;
    private final float porcentajeCapacidadPago = 0.3f;
    private List<Cliente> ListClientes;

    public ModeloBanco(String nombre, List<Cliente> ListClientes) {
        this.nombre = nombre;
        this.ListClientes = ListClientes;
    }
    
     public ModeloBanco(String nombre) {
        this.nombre = nombre;
        this.ListClientes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListClientes() {
        return ListClientes;
    }

    public void setListClientes(List<Cliente> ListClientes) {
        this.ListClientes = ListClientes;
    }

   public void addCliente(Cliente c) {
        ListClientes.add(c);
    }

    private boolean validarViabilidadSolicitudCredito(Cliente e, int monto, int plazo) {
        if (e.getIngreso() * porcentajeCapacidadPago * plazo > e.getSaldoCuentaAhorros()) {
            return e.getIngreso() * porcentajeCapacidadPago > monto / plazo;
        } else {
            return false;
        }
    }

    private void aprobarSolicitudCredito(Cliente e, int monto, int plazo) {
        e.setSaldoCuentaAhorros(monto);
    }

    public void recibirSolicitudCredito(Cliente e, int monto, int plazo) throws Exception {
        if (validarViabilidadSolicitudCredito(e, monto, plazo)) {
            aprobarSolicitudCredito(e, monto, plazo);
            System.out.println("La solicitud recibida por " + e.getNombres());
        } else {
            throw new Exception("Solicitud rechazada");
        }
    }

    
}
