public class Aluno {
    private String Nome;
    private String Matricula;
    private int idade;
    public Aluno(String Nome,String Matricula,int idade){
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.idade = idade;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " - Nome: " + this.Nome + " - matricula: " + this.Matricula +" - idade: "+ this.idade;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
