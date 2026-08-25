public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    public Livro(String titulo,Autor autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;

    }

    void exibirFicha(){
        System.out.println("\nLivro: "+titulo+"\nAutor: "+autor.nome+"\nAno: "+ano);
    }

    void emprestar(){
        if (emprestado == true){
            System.out.println("\nO livro já está emprestado");
            return;
        }
        emprestado = true;
        System.out.println("\nLivro retirado com Sucesso");
    }

    void devolver(){
        if (emprestado == false) {
            System.out.println("\nO livro já está disponivel");
            return;
        }
        emprestado = false;
        System.out.println("\nSeu livro foi devolvido");
    }
}
