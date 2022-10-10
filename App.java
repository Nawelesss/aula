import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        List <Aluno> listal = new ArrayList<>();
        listal.add(new Aluno("josé", "1234", 15));
        listal.add(new Aluno("victor", "5349", 18));
        listal.add(new Aluno("Adriana", "2348", 16));
        listal.forEach(al -> System.out.println(al));
        System.out.println("--------");
        listal.sort(new comparadormatricula());
        
        listal.forEach(al -> System.out.println(al));
        System.out.println("------");
        listal.removeIf(al -> al.getNome().equals("josé"));
        listal.forEach(al -> System.out.println(al));
        System.out.println("--------");
        listal.stream().filter(al -> al.getMatricula().contains("2"))
            .forEach(al -> System.out.println(al)); 
        System.out.println("--------");
        IntSummaryStatistics resumo=    listal.stream().collect(Collectors.summarizingInt(Aluno::getIdade));
        System.out.println("media: "+ resumo.getAverage());

    }
}
