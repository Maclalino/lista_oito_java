package BichinhoVirtual;
public class BichinhoMain{
    public static void main(String[] args) {
        BichinhoAtributos bichinhoAtributos= new BichinhoAtributos("Cleiton", 2, 8, 4) ;
        System.out.println("Nome: "+ bichinhoAtributos.getNome());
        System.out.println("Idade: "+ bichinhoAtributos.getIdade());
        System.out.println("Fome: "+ bichinhoAtributos.getFome());
        System.out.println("Saúde: "+ bichinhoAtributos.getSaude());
        System.out.println("Humor: "+bichinhoAtributos.calcularHumor());
       
        bichinhoAtributos.alterarFome(2);
        bichinhoAtributos.alterarIdade(9);
        bichinhoAtributos.alterarNome("Gugu");
        bichinhoAtributos.alterarSaude(7);
        System.out.println("Nome: "+ bichinhoAtributos.getNome());
        System.out.println("Idade: "+ bichinhoAtributos.getIdade());
        System.out.println("Fome: "+ bichinhoAtributos.getFome());
        System.out.println("Saúde: "+ bichinhoAtributos.getSaude());
        System.out.println("Humor: "+bichinhoAtributos.calcularHumor());
       
    }
}