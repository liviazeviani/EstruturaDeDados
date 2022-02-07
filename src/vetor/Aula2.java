package vetor;

public class Aula2 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);
        try {
            vetor.addVetor("element");
            vetor.addVetor("element 2");
            vetor.addVetor("element 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
