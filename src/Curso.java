import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer quantideMaximaAlunos;
    private List<Aluno> listaAlunosMatriculados = new ArrayList<>();


    public Curso(){

    }

    public Curso (String nome, Integer codigoCurso, Integer quantideMaximaAlunos ){
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantideMaximaAlunos = quantideMaximaAlunos;

    }



    public Boolean adicionarUmAluno(Aluno umAluno){

        if(listaAlunosMatriculados.size() < quantideMaximaAlunos){
            listaAlunosMatriculados.add(umAluno);
            return true;
        }

        return false;

    }

    public void excluirAluno(Aluno umAluno){

        listaAlunosMatriculados.remove(umAluno);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Integer getQuantideMaximaAlunos() {
        return quantideMaximaAlunos;
    }

    public void setQuantideMaximaAlunos(Integer quantideMaximaAlunos) {
        this.quantideMaximaAlunos = quantideMaximaAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigoCurso=" + codigoCurso +
                '}';
    }
}
