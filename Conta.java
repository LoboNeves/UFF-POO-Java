public abstract class Conta implements Comparador{
    protected String nome;
    protected int cpf;
    protected double saldo;
    protected int numeroConta;

    //Método Construtor
    public Conta (String nome, int cpf, double saldo, int numeroConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //Método Comparador
    public int comparadoA(Comparador x) {
        Conta f = (Conta) x;
        if (saldo > f.saldo) return MAIOR;
        else if (saldo < f.saldo) return MENOR;
        return IGUAL;
    }    

    //Imprime Conta
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Num.Conta: " + this.numeroConta);
    }

    //Método abstrato para ser implementado nas subclasses
    protected abstract double creditoDebito (double valor);
}
