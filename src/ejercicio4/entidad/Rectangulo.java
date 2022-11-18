package ejercicio4.entidad;

public class Rectangulo {
    private Integer base;
    private Integer altura;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }


}
