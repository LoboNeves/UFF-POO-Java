public class Departamento {
    private String nome;

    //Método Construtor
    public Departamento (String nome) {
        this.nome = nome;
    }

    //Adição de funcionários
    private static final int LIMITE_FUNCIONARIOS = 50;
    private int contFuncionarios = 0;
    private Funcionario[] vetFuncionarios = new Funcionario[LIMITE_FUNCIONARIOS];

    public void addFuncionario (Funcionario f) {
        if (contFuncionarios < LIMITE_FUNCIONARIOS) {
            vetFuncionarios[contFuncionarios] = f;
            contFuncionarios++;
        }
    }

    //Imprime Departamento e lista de funciorarios
    public void imprime(){
        System.out.println("Departamento: " + this.nome);
        System.out.println("Funcionarios: ");
        for(int i = 0; i < contFuncionarios; i++) {
            this.vetFuncionarios[i].imprime();
        }
    }    
}
