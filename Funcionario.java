public class Funcionario {
    private double salario;
    private String nome;
    private int matricula;

    //Metódo Construtor
    public Funcionario (String nome, double salario, int matricula) {
        this.salario = validaSalario(salario);
        this.nome = nome;
        this.matricula = matricula;
    }

    //Metódo Construtor para funcionários sem matrícula(a matrícula será igual a -1)
    public static final int PRESTADOR_SERVICOS = -1;
    public Funcionario (String nome, double salario) {
        this(nome, salario, PRESTADOR_SERVICOS);
    }

    //Adição de dependentes
    private static final int LIMITE_DEPENDENTES = 10;
    private int contDependentes = 0;
    private Dependente[] vetDep = new Dependente[LIMITE_DEPENDENTES];

    public void addDep (Dependente d) {
        if ( contDependentes < LIMITE_DEPENDENTES) {
            vetDep[contDependentes] = d;
            contDependentes++;
        }
    }

    //Funções para set/get de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Funções para set/get de  matricula
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Funções para set/get de salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = validaSalario(salario);
    }

    //Validação de salario
    public static final double SALARIO_MINIMO = 380.00;
    public static final double SALARIO_PRESIDENTE = 24000.0;

    private double validaSalario(double salario) {
        if (salario > SALARIO_PRESIDENTE) {
            return SALARIO_PRESIDENTE;
        }

        else if (salario < SALARIO_MINIMO) {
            return SALARIO_MINIMO;
        }

        return salario;
    }

    //Imprime Funcionario e lista de dependentes
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Dependentes: ");
        for(int i = 0; i < contDependentes; i++) {
            this.vetDep[i].imprime();
        }
    }
}