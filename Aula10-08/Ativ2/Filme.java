public class Filme {
    String titulo;
    int duracao;
    double nota;
    Boolean assistido;


    void exibirFicha() {
        System.err.println("\nNome do Filme: " + titulo + "\nDuração do Filme: " + duracao + "min " + "\nNota: " + nota + "\nAssitido: " + assistido);
    }
    void marcarAssistido() {
        assistido = true;
        System.out.println("\nFilme Assistido!");

    }
    void avaliar(double novaNota) {
        if (novaNota > -1 && novaNota < 11){
            nota = novaNota;
            System.out.println("\nNota Atualizada!");
        } else {
            System.out.println("\nColoque uma nota entre 0 a 10");
        }
    }

}
