public class Principal {

    public static void main(String[] args) {
        Titular titular1 = new Titular("Julia","1500",null);
        ContaBancaria c1 = new ContaBancaria(titular1,500);

        
        exibir(c1);

        c1.depositar(500);
        c1.depositar(50);
        c1.aplicarPercentual(130);
        c1.aplicarPercentual(50);
        
        exibir(c1);
        
        c1.sacar(750);
        c1.sacar(450);
        c1.aplicarPercentual(-10);
        c1.aplicarPercentual(30);

        titular1.setTitular("Marcos");

        exibir(c1);

        c1.exibirExtrato();
        c1.totalDepositado();
        c1.maiorSaque();

    }

    static void exibir(ContaBancaria conta){
        System.out.println("\nTitular da Conta: "+ conta.getNome()  + "\nSaldo atual: " + conta.getSaldo() + "\nNúmero de operações:"+conta.getOperacoes());
    }
}