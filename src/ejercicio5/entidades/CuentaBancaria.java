package ejercicio5.entidades;

public class CuentaBancaria {
    //Atributos
    private Integer nroCuenta;
    private Long dni;
    private Double saldo;

    private Double interesExtraccion;
    //Constructor


    public CuentaBancaria(Integer nroCuenta, Long dni, Double saldo, Double interesExtraccion) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interesExtraccion = interesExtraccion;
    }

    public CuentaBancaria() {
    }

    //Accessors
    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getInteresExtraccion() {
        return interesExtraccion;
    }

    public void setInteresExtraccion(Double interesExtraccion) {
        this.interesExtraccion = interesExtraccion;
    }
}
