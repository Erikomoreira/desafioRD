public class ProfessorAdjunto  extends Professor{

    private Integer horasMonitoria;

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }


    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer horasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
