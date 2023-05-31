package BichinhoVirtual;
public class BichinhoAtributos{
    private String nome;
    public String getNome() {
        return nome;
    }

    private int fome;
    public int getFome() {
        return fome;
    }

    private int idade;
    public int getIdade() {
        return idade;
    }

    private int saude;
    public int getSaude() {
        return saude;
    }

    public BichinhoAtributos(String nome, int fome, int idade, int saude){
        this.nome=nome;
        this.fome=fome;
        this.idade=idade;
        this.saude=saude;
    }

    public void alterarNome(String nome){
        this.nome=nome;
    }
    public void alterarFome(int fome){
        this.fome=fome;
    }
    public void alterarSaude(int saude){
        this.saude=saude;
    }
    public void alterarIdade(int idade){
        this.idade=idade;
    }

    public String calcularHumor(){
        if(fome <=5 && saude >=7){
            return "Feliz";
        }else if (fome <=5 && saude <7){
            return "Neutro";
        }else{
            return "Triste";
        }
    }
}