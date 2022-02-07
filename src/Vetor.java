import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho; //controlar o tamanho real do vetor

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//   public void addVetor(String elemento){
//       for (int i=0; i<this.elementos.length; i++){
//           if(this.elementos[i] == null){
//               this.elementos[i] = elemento;
//               break;
//           }
//       }
//   }

    public void addVetor(String elemento) throws Exception {

        //verificar se o tamanho é menor que a capacidade do vetor de elementos

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Não é possível adicionar um novo elemento");
        }

    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        //utilizando uma classe própria do Java: StringBuilder

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i =0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
