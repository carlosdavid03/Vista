package actividad_patrones_basicos;

/**
 * Esta clase encapsula las propiedades y comportamientos de un cliente
 * @author jrudascas
 */
public class Cliente {

    public Cliente(){
    }
    private String nombres;
    private String apellidos;
    private int cedula;
    private int saldoCuentaAhorros=0;
    private int ingreso;
    private int edad;

    public Cliente(String nombres, String apellidos, int cedula, int ingreso, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ingreso = ingreso;
        this.edad = edad;
    }
    /**
     * Este metodo permite realizar un debito sobre el saldo de su cuenta
     * @param monto Monto a debitar
     */
    
   public void retirarDineroCA(int monto) {
        saldoCuentaAhorros = saldoCuentaAhorros - monto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }

    public void setSaldoCuentaAhorros(int saldoCuentaAhorros) {
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  
}