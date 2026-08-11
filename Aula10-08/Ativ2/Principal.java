public  class Principal {

    public static void main(String[] args) {
        Filme f1 = new Filme();
        Filme f2 = new Filme();
        Filme f3 = new Filme();

        f1.titulo = "Titanic";
        f1.duracao = 40;
        f1.nota = 8;
        f1.assistido = true;

        f2.titulo = "Homem Aranha";
        f2.duracao = 120;
        f2.nota = 5;
        f2.assistido = true;

        f3.titulo = "Obsessão";
        f3.duracao = 10;
        f3.nota = 6;
        f3.assistido = false;

        f1.exibirFicha();
        f2.exibirFicha();
        f3.exibirFicha();

        f2.avaliar(12);
        f2.avaliar(10);
        f2.exibirFicha();

        f3.marcarAssistido();
        f3.exibirFicha();

    }
}