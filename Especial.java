public class Especial extends Conta {
    protected double jurosCobrados;
    protected final double LIMITE_CHEQUE_ESPECIAL = 2000;

    //Chamando método construtor da superclasse(Conta)
    public Especial (String nome, int cpf, int saldo, int numeroConta, double jurosCobrados) {
        super(nome, cpf, saldo, numeroConta);
        this.jurosCobrados = jurosCobrados;
    }

    //Implementação da função para conta especial
    protected double creditoDebito (double valor) {
        if (valor >= 0) saldo += valor;
        else if(saldo - valor >= 0 - LIMITE_CHEQUE_ESPECIAL) saldo -= valor;
        else System.out.println("Operacao invalida");

        return saldo;
    };

    //Aplicação de juros do chegue especial no saldo
    protected void aplicarJurosCheque (double juros) {
        this.saldo = saldo * (1 + jurosCobrados);
    } 

    //Imprime Conta Especial
    public void imprime(){
        super.imprime();// aproveitando também o imprime da superclasse.
        System.out.println("Taxa de juros cobrados: " + this.jurosCobrados);
        System.out.println();
    }
}
