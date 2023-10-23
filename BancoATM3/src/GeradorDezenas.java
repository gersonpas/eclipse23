import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeradorDezenas {
    public static void main(String[] args) {
        ArrayList<Integer> dezenas = new ArrayList<>();
        Random rand = new Random();

        // Gere seis dezenas únicas
        while (dezenas.size() < 6) {
            int dezena = rand.nextInt(60) + 1; // Gera números entre 1 e 60

            // Verifica se a dezena gerada já está na lista
            if (!dezenas.contains(dezena)) {
                dezenas.add(dezena);
            }
        }

        // Ordene as dezenas em ordem crescente
        Collections.sort(dezenas);

        // Apresente as dezenas
        System.out.println("As seis dezenas sorteadas são:");
        for (int dezena : dezenas) {
            System.out.printf("%02d ", dezena); // Formata para ter dois dígitos
        }
    }
}
