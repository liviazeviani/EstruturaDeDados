public class Aula3 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

            vetor.addVetor("elemento 1");
            vetor.addVetor("elemento 2");
            vetor.addVetor("elemento 3");

        System.out.println(vetor.getTamanho());

        System.out.println(vetor);

    }
}
