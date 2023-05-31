package ContaCorrente;

public class ContaCorrenteAtributos {
    private int numeroConta;
    public int getNumeroConta() {
        return numeroConta;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public ContaCorrenteAtributos(int numeroConta, String nome){
        this.numeroConta=numeroConta;
        this.nome=nome;
        this.saldo=0.0;
    }
    public void alterarNome(String nome){
        this.nome=nome;
    }
    public void depositar(double valorDeposito){
        this.saldo+= valorDeposito;
    }
    public void sacar(double valorSaque ){
        if(valorSaque>this.saldo){
            System.out.println("O seu saque é maior que seu saldo.");
        }else{
            this.saldo-=valorSaque;
        }
    }
    
}
