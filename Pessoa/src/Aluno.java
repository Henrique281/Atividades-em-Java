public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, String curso, int idade, int matricula, double altura){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.altura = altura;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
