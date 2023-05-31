package Bola;

public class BolaAtributos {
    private String cor,material;
    private double circunferencia;
   
    public BolaAtributos(String cor,String material,double circunferencia){
        this.material = material;
        this.circunferencia = circunferencia;
        this.cor=cor;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCircunferencia() {
    return circunferencia;
    }
    public void setCircunferencia(double circunferencia) {
    this.circunferencia = circunferencia;
    }
    public void trocaCor(String novaCor){
        this.cor=novaCor;
    }
    public void mostraCor(){
        System.out.println("Cor da bola é:" + cor);
    }
    
        

}

