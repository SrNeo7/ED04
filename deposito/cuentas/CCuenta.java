package cuentas;
/**
 * Esta clase realiza operaciones sobre la cuenta bancaria de un usuario tales como consulta de datos
 * y otros movimientos bancarios
 * 
 * @author Jose Antonio Cabeza Sanchez
 * @version 2.0
 */
public class CCuenta {

/**
 * nombre:Atributo de tipo string que recoge el nombre del usuario
 * cuenta:Atributo de tipo string que recoge el numero de la cuenta del usuario
 * saldo:Atributo de tipo double que recoge el saldo de la cuenta del usuario
 * tipoInteres:Atributo tipo double que recoge el tipo de interes de la cuenta del usuario
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Constructor vacio
 */
    public CCuenta()
    {
    }
/**
 * Contructor de la clase CCuenta que crea un objeto de tipo CCuenta con los datos recogidos desde la 
 * clase Main
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Metodo get del atributo nombre
 * @return nombre
 */
    private String getNombre() {
		return nombre;
	}
/**
 * Metodo set del atributo nombre
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Metodo get del atributo cuenta
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Metodo set del atributo cuenta
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Metodo get del atributo saldo
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Metodo set del atributo saldo
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Metodo get del atributo tipoInteres
 * @return tipoInteres
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/**
 * Metodo set del atributo tipoInteres
 * @param tipoInteres
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
/**
 * Devuelve el valor del atributo saldo obtenido mediante una llamada a getSaldo
 * @return getSaldo
 */
	public double estado()
    {
        return getSaldo();
    }
/**
 * Suma un cantidad recibida desde la clase Main al atributo saldo
 * @param cantidad 
 * @throws Exception si cantidad es negativo devuelve un mensaje de error
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Resta una cantidad recibida desde la clase Main al atributo saldo 
 * @param cantidad
 * @throws Exception si cantidad es menor o igual 0 o es mayor que saldo devuelve un mensaje de error
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
