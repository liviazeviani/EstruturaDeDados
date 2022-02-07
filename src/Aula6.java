public class Aula6 {

    public static void main (String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        vetor.addVetor("um");
        vetor.addVetor("dois");
        vetor.addVetor("três");

        System.out.println(vetor.buscaElemento("um"));
        System.out.println(vetor.buscaElemento("elemento"));
    }
}
