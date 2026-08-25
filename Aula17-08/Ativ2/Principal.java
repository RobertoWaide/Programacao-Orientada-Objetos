import java.time.LocalDate;

public class Principal{

    public static void main(String[] args) {
    
    Paciente p1 = new Paciente("Flavio","5596969697");
    Consulta c1 = new Consulta(p1,LocalDate.of(2026, 6, 7),500);

    Paciente p2 = new Paciente("Alberto", "51988274123");
    Consulta c2 = new Consulta(p2,LocalDate.of(2025, 3, 17),60);
    
    c1.exibirComprovante();
    c2.exibirComprovante();

    c1.remarcar(LocalDate.of(2027, 5, 7));
    c1.exibirComprovante();
}
}