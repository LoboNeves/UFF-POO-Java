public class Util {
    public static void ordena(Comparador[] vet) {
        for(int i = 0; i < vet.length-1; i++) {
            for(int j = i+1; j < vet.length; j++) {
                if(vet[i].comparadoA(vet[j]) == Comparador.MAIOR) {
                    Comparador aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}
