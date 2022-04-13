import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

        }

        System.out.println(Arrays.toString(vetor));
        Sort(vetor);

    }

    public static void Sort(int vetor[]) {
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
