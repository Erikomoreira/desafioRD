public class Main {

    public static void main(String[] args) {

        DigitalHouseManager dh = new DigitalHouseManager();

        dh.registrarProfessorAdjunto("Jose", "Silva", 1, 20);
        dh.registrarProfessorAdjunto("Adelmo", "Pacheco", 2, 10);
        dh.registrarProfessorTitular("Mario", "Andrade", 3, "JAVA");
        dh.registrarProfessorTitular("Lazaro", "Ramos", 4, "SQL");

        dh.registrarCurso("Full Stack", 20001, 3);
        dh.registrarCurso("Android", 20002, 2);

        dh.alocarProfessores(20001, 3, 1);
        dh.alocarProfessores(20002, 4, 2);

        dh.matricularAluno("Erik", "Moreira", 11);
        dh.matricularAluno("Joao", "Das Couves", 12);

        dh.matricularAluno("Lucas", "Ramalho", 13);
        dh.matricularAluno("Fernando", "Henrique", 14);

        dh.matricularAluno("Ana", "Gray", 15);

        dh.matricularAluno(11, 20001);
        dh.matricularAluno(14, 20001);

        dh.matricularAluno(12, 20002);
        dh.matricularAluno(13, 20002);
        dh.matricularAluno(15, 20002);

    }
}
