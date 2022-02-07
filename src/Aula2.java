public class Aula2 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);
        try {
            vetor.addVetor("elemento 1");
            vetor.addVetor("elemento 2");
            vetor.addVetor("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
