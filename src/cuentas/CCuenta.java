package cuentas;
/**
 * Esta clase define los objetis de tipo cuenta con sus propiedades nombre, cuenta, saldo y tipo de interés
 * Incorpora los métodos ingresar y retirar que permiten actualizar el saldo de la cuenta
 * @author Rubén
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método grtter para el atributo nombre
     * @return  nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para el etributo nombre
     * @param nombre  del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para el atributo cuenta
     * @return cuenta (número de cuenta)
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter para el atributo cuente
     * @param cuenta (número de cuenta)
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Métofo getter para el atributo saldo
     * @return  saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter para el atributo saldo
     * @param saldo disponible
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter para el atributo tipoInterés
     * @return  tipoInterés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter para el atributo tipoInterés
     * @param tipoInterés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Constructor por defecto de la clase cuenta
     */
    public CCuenta() {
    }
    
    /**
     * Constructor de la clase cuenta
     * @param nom nombre de la cuenta
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     * Este método hace lo mismo que getSaldo();
     * @return saldo de la cuenta 
     */
    public double estado() {
        return getSaldo();
    }
    
    /**
     * Método que ingresa una cantidad, comprueba si es lógica (>0) y actualiza el saldo
     * @param cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método que retira una cantidad de la cuenta comprobando si es posible hacerlo y actualiza el saldo
     * @param cantidad a retirar
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
