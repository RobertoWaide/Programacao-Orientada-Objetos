import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("""
                1 - Criar conta
                2 - Sacar
                3 - Depositar
                4 - Transferir
                5 - Consultar saldo
                6 - Ver extrato
                7 - Aplicar rendimento
                8 - Listar contas
                0 - Sair
            """);
            int opc = scanner.nextInt();
            scanner.nextLine();
            
            if (opc == 1) {
                System.out.println("\nInforme o nome seu nome:");
                String nome = scanner.nextLine();
                System.out.println("\nInforme seu cpf:");
                String cpf = scanner.nextLine();
                
                Titular titular = new Titular(nome,cpf,null);
                banco.abrirConta(titular, 0);
            }
            else if (opc == 2) {
                banco.sacar(scanner);
            }
            else if (opc == 3) {
                banco.depositar(scanner);
            }
            else if (opc == 4) {
                banco.transferir(scanner);
            }
            else if (opc == 5) {
                banco.consultarSaldo(scanner);
            }
            else if (opc == 6) {
                banco.exibirExtrato(scanner);
            }
            else if (opc == 7) {
                banco.aplicarPercentual(scanner);
            }
            else if (opc == 8) {
                banco.listarContas();
            }
            else if (opc == 0){
                break;
            }
            else {
                System.out.println("Opção invalida!");
            }
        }
        scanner.close();
        

    }

}public class Principal {

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
