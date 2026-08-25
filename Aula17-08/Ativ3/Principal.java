public class Principal{
    
    public static void main(String[] args) {

        Autor a1 = new Autor("Chico Moedas","Japones");
        Autor a2 = new Autor("Tio Patinhas","Carioca");

        Livro l1 = new Livro("Pai Rico",a1,2007);
        Livro l2 = new Livro("Pai pobre",a1,2008);
        Livro l3 = new Livro("Como lavar dinheiro",a2,2010);

        l1.exibirFicha();
        l2.exibirFicha();
        l3.exibirFicha();

        l3.emprestar();
        l3.emprestar();

        l3.devolver();
        l3.devolver();

    }
}
