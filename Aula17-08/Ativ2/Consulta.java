import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;

    public Consulta(Paciente nome, LocalDate data, double valor) {
        this.paciente = nome;
        this.data = data;
        this.valor = valor;
    }

    public void exibirComprovante(){
        System.out.println("#COMPROVANTE#\nPaciente: "+paciente.nome+"Contato: "+paciente.telefone+"\nData: "+data+"\nValor: "+valor);
    }

    public void remarcar(LocalDate novaData){
        data = novaData;
    }
    
}
