public class Principal {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Titular titular1 = new Titular("Julia", "1500", null);
        Titular titular2 = new Titular("Marcos", "2000", null);
        Titular titular3 = new Titular("Pedro", "3000", null);
        
        banco.abrirConta(titular1, 500);
        banco.abrirConta(titular2, 1000);
        banco.abrirConta(titular3, 250);

        exibir(banco.buscarConta(1));

        banco.depositar(1,500);
        banco.depositar(1,50);
        banco.aplicarPercentual(1,130);
        banco.aplicarPercentual(1,50);
        
        exibir(banco.buscarConta(1));
        
        banco.sacar(1,750);
        banco.sacar(1,450);
        banco.aplicarPercentual(1,-10);
        banco.aplicarPercentual(1,30);

        titular1.setTitular("Marcos");

        exibir(banco.buscarConta(2));

        banco.exibirExtrato(1);
        banco.totalDepositado(1);
        banco.maiorSaque(1);

    }

    static void exibir(ContaBancaria conta){
        System.out.println("\nTitular da Conta: "+ conta.getNome()  + "\nSaldo atual: " + conta.getSaldo() + "\nNúmero de operações:"+conta.getOperacoes());
    }
}
