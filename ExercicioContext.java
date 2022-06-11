import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

public class ExercicioContext {

    public static void main(String[] args) {

        int contagem = 0;

        LocalDateTime tempoInicial = LocalDateTime.now();

        HashSet<Integer> numbers = new HashSet<>();

        while (contagem < 10000) {
            numbers.add(contagem);
            System.out.println(contagem);
            contagem++; }

        while (contagem >= 5000) {
            numbers.remove(contagem);

            System.out.println(contagem);
            contagem--;
        }
        LocalDateTime tempoFinal = LocalDateTime.now();

        long TempoDecorrido = ChronoUnit.MILLIS.between(tempoInicial, tempoFinal);
        System.out.println("Tempo decorrido = " + TempoDecorrido + " milesegundos");
    }
}
