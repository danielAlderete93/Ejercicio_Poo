package ejercicio2.entidades;

public class Circunferencia {
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double area() {
        return Math.pow(this.radio, 2) * Math.PI;
    }

    public Double perimetro() {
        return 2 * this.radio * Math.PI;
    }

}
