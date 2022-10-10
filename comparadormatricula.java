import java.util.Comparator;

public class comparadormatricula implements Comparator <Aluno> {

    @Override
    public int compare(Aluno Aluno1, Aluno Aluno2) {
        // TODO Auto-generated method stub
        return Aluno1.getMatricula().compareTo(Aluno2.getMatricula());
    }
    
}
