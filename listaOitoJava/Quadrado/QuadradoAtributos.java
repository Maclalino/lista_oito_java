package Quadrado;

public class QuadradoAtributos {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public QuadradoAtributos(double lado){
        this.lado= lado;
    }
    public void mudarLado(double mudadolado){
        this.lado=mudadolado;
    }
    public double retornarLado(){
        return lado;
    }
    public double calcularArea(){
        return lado* lado;
    }

}
