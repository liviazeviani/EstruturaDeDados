package vetor;

public class Aula5 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.addVetor("um");
        vetor.addVetor("dois");
        vetor.addVetor("três");

        System.out.println(vetor.busca(3));
    }
}
