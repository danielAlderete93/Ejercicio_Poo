package ejercicio6.entidad;

public class Cafetera {
    private Integer capMaxima;
    private Integer cantActual;

    public Cafetera() {
    }

    public Cafetera(Integer capMaxima, Integer cantActual) {
        this.capMaxima = capMaxima;
        this.cantActual = cantActual;
    }

    public Integer getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(Integer capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Integer getCantActual() {
        return cantActual;
    }

    public void setCantActual(Integer cantActual) {
        this.cantActual = cantActual;
    }

}
