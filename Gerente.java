public class Gerente extends Funcionario{
    private int bonus;
    private String carro;

    //Método construtor
    public Gerente (String nome, double salario, int matricula, int bonus, String carro) {
        super(nome, salario, matricula);
        this.bonus = bonus;
        this.carro = carro;
    }

    //Método Construtor para gerentes sem carro(o carro será igual a none)
    public static final String SEM_CARRO = "none";
    public Gerente (String nome, double salario, int matricula, int bonus) {
        this(nome, salario, matricula, bonus, SEM_CARRO);
    }

    //Imprime Gerente
    public void imprime () {
        super.imprime();// aproveitando também o imprime da superclasse.
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Carro: " + this.carro);
        System.out.println();    
    }
}
