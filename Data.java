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
public class Data {
    
    private final String ruta = "C:\\Users\\Sala 8\\Desktop\\Banco.txt";
    private final String ruta1 = "C:\\Users\\Sala 8\\Desktop\\Datos.txt";
    private final float tasaPorDefecto = 0.024f;
    private final float porcentajeCapacidadPago = 0.3f;

    public Data() {
    }

    public String getRuta() {
        return ruta;
    }

    public String getRuta1() {
        return ruta1;
    }

    public float getTasaPorDefecto() {
        return tasaPorDefecto;
    }

    public float getPorcentajeCapacidadPago() {
        return porcentajeCapacidadPago;
    }

    public void Save() {

    }
    
}
