//Programa para testar criação de classes abstratas e suas subclasses, sendo elas Comum, Poupança, Especial, Banco e suas contas, como a impressão de ambos.
public class LAB3 {
    public static void main (String[] args) {
        //Criando contas e um banco
        Comum c1 = new Comum("Alfredo", 123, 1000.00, 123);
        Poupanca p1 = new Poupanca("Ricardo", 456, 1500.00, 456, 0.03);
        Especial e1 = new Especial("Andressa", 789, 2000.00, 789, 0.05);
        Banco b1 = new Banco("Banco Teste");
        
        //Realizando operações nas contas
        c1.creditoDebito(-100);
        p1.aplicarJuros();
        e1.creditoDebito(-2500);
        e1.aplicarJurosCheque();

        //Adicionando contas ao banco
        b1.addConta(c1);
        b1.addConta(p1);
        b1.addConta(e1);

        b1.imprime();
    }
}