public class Banco {
    private String nome;

    //Método Construtor
    public Banco (String nome) {
        this.nome = nome;
    }

    //Adição de contas
    private static final int LIMITE_CONTAS = 50;
    private int contContas = 0;
    private Conta[] vetContas = new Conta[LIMITE_CONTAS];

    public void addConta (Conta f) {
        if (contContas < LIMITE_CONTAS) {
            vetContas[contContas] = f;
            contContas++;
        }
    }

    //Imprime Banco e lista de contas
    public void imprime(){
        System.out.println("Banco: " + this.nome);
        System.out.println("Contas: ");
        for(int i = 0; i < contContas; i++) {
            this.vetContas[i].imprime();
        }
    }   
}
