import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDoDia;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDoDia = new Date();
    }

}
