// Programa para testar funcionamento de exceções, criando conta, usado o método da exceção e testado quando cai na exceção.
public class LAB5 {
    public static void main(String[] args) {
        //Criando conta
        Comum c = new Comum("Alfredo", 123, 1000.00, 123);

        //Realizando operação de sacar permitida
        try {
            c.sacar(1000.00);
            System.out.println("Transacao efetuada");
        } catch (FundosInsuficientes e) {
            System.out.println(e); //Printando mensagem da exceção
            System.out.println("Transacao negada");
        }

        System.out.println();
        
        //Realizando operação de sacar negada
        try {
            c.sacar(100.00);
            System.out.println("Transacao efetuada");
        } catch (FundosInsuficientes e) {
            System.out.println(e); //Printando mensagem da exceção
            System.out.println("Transacao negada");
        }
    }
}
