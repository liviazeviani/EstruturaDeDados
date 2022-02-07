public class Aula7 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.addVetor("B");
        vetor.addVetor("C");
        vetor.addVetor("D");
        vetor.addVetor("E");

        System.out.println(vetor);

        vetor.addVetor(0, "A");

        System.out.println(vetor);

        vetor.addVetor(3, "D");

        System.out.println(vetor);

    }
}
