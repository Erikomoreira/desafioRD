import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DigitalHouseManager {

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso,
                               Integer quantidadeMaximaDeAlunos){

        Curso c = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);

        this.listaCurso.add(c);

    }

    public void excluirCurso(Integer codigoCurso){

        for (Curso curso : listaCurso) {

            if(curso.getCodigoCurso().equals(codigoCurso)){
                this.listaCurso.remove(curso);
            }

        }

    }

    public void registrarProfessorAdjunto(String nome, String
            sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

        ProfessorAdjunto p = new ProfessorAdjunto(nome,sobrenome,0,codigoProfessor,quantidadeDeHoras);

        this.listaProfessores.add(p);

    }

    public void registrarProfessorTitular(String nome, String
            sobrenome, Integer codigoProfessor, String especialidade){

        ProfessorTitular p = new ProfessorTitular(nome,sobrenome,0, codigoProfessor,especialidade);

        this.listaProfessores.add(p);

    }

    public void excluirProfessor(Integer codigoProfessor){

        for (Professor professor : this.listaProfessores) {

            if(professor.getCodigoProfessor().equals(codigoProfessor)){
                this.listaProfessores.remove(professor);
            }

        }

    }


    public void matricularAluno(String nome, String sobrenome,
                                Integer codigoAluno){

        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);
        this.listaAlunos.add(aluno);

    }

    public void matricularAluno(Integer codigoAluno, Integer
            codigoCurso){

        Aluno a = localizarAluno(codigoAluno);
        Curso c = localizarCurso(codigoCurso);

        if (!(c == null) && !(a == null) && c.getListaAlunosMatriculados().size() < c.getQuantideMaximaAlunos()){

            c.adicionarUmAluno(a);

            Matricula m = new Matricula(a,c);

            this.listaMatricula.add(m);

            System.out.println("Matricula realizada com sucesso");

        }else {

            System.out.println("Não foi possível realizar a matrícula porque não há vagas");

        }

    }

    public void alocarProfessores(Integer codigoCurso, Integer
            codigoProfessorTitular, Integer codigoProfessorAdjunto){

        Curso c = localizarCurso(codigoCurso);
        ProfessorTitular pt = (ProfessorTitular) localizarProfessor(codigoProfessorTitular);
        ProfessorAdjunto pj = (ProfessorAdjunto) localizarProfessor(codigoProfessorAdjunto);

        if(!(c == null) && !(pt == null) && !(pj == null)){

            c.setProfessorAdjunto(pj);
            c.setProfessorTitular(pt);

        }

    }

    private Professor localizarProfessor(int codigoProfessor) {

        for (Professor professor : this.listaProfessores) {

            if(professor.getCodigoProfessor().equals(codigoProfessor)){

               return professor;

            }

        }

        return null;
    }

    private Aluno localizarAluno(int codigoAluno) {

        for (Aluno aluno : this.listaAlunos) {

            if(aluno.getCodigoAluno().equals(codigoAluno)){

                return aluno;

            }

        }

        return null;
    }

    private Curso localizarCurso(int codigoCurso) {

        for (Curso curso : this.listaCurso) {

            if(curso.getCodigoCurso().equals(codigoCurso)){

                return curso;

            }

        }

        return null;
    }

}
