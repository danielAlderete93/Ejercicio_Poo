package ejercicio3.entidad;

public class Operacion {
    private Double operador1;
    private Double operador2;

    public Operacion(Double operador1, Double operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public Operacion() {
    }

    public Double getOperador1() {
        return operador1;
    }

    public void setOperador1(Double operador1) {
        this.operador1 = operador1;
    }

    public Double getOperador2() {
        return operador2;
    }

    public void setOperador2(Double operador2) {
        this.operador2 = operador2;
    }

    public Double sumar(){
        return operador1+operador2;
    }

    public Double restar(){
        return operador1-operador2;
    }

    public Double multiplicar(){
        return operador1*operador2;
    }

    public Double dividir(){
        return operador1/operador2;
    }

}
