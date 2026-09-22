import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private int proximoNumero = 1;
    private ArrayList<ContaBancaria> contas;

    Banco() {
        this.contas = new ArrayList<>();
        this.proximoNumero = 1;
    }

    public void abrirConta(Titular titular, double saldoInicial) {
        ContaBancaria novaConta =
            new ContaBancaria(proximoNumero, titular, saldoInicial);

        contas.add(novaConta);
        proximoNumero++;
    }

    public ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;}
        }
        System.out.println("Conta não encontrada!");
        return null;}
    
    public void consultarSaldo(Scanner scanner) {

        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();

        ContaBancaria conta = buscarConta(numeroConta);

        if (conta != null) {
            System.out.println("""
                Titular: %s
                Saldo atual: R$ %.2f
                Número de operações: %d
                """.formatted(
                    conta.getNome(),
                    conta.getSaldo(),
                    conta.getOperacoes()
                ));
        }
    }

    public void transferir(Scanner scanner) {
        System.out.println("\nInforme o número da conta: ");
        int numeroConta1 = scanner.nextInt();
        ContaBancaria conta1 = buscarConta(numeroConta1);
        if (conta1 != null) {
            System.out.println("\nInforme o número da conta do destinatario: ");
            int numeroConta2 = scanner.nextInt();
            ContaBancaria conta2 = buscarConta(numeroConta2);
            if (conta2 != null) {
                System.out.println("\nInfome o valor da transferencia: ");
                Double valor = scanner.nextDouble();
                if (conta1.sacar(valor+4)){
                    conta2.depositar(valor);}
            }
        }
    }
    
    public void depositar(Scanner scanner) {
        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("\nInfome o valor do deposito: ");
            Double valor = scanner.nextDouble();
            conta.depositar(valor);}
    }
    public void sacar(Scanner scanner){
        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("\nInfome o valor de saque: ");
            Double valor = scanner.nextDouble();
            conta.sacar(valor);}
    }
    public void aplicarPercentual(Scanner scanner) {
        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            System.out.println("\nInfome o valor do percentual: ");
            Double valor = scanner.nextDouble();
            conta.aplicarPercentual(valor);}
    }
    public void exibirExtrato(Scanner scanner) {
        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.exibirExtrato();}
    }
    public void totalDepositado(Scanner scanner) {
        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.totalDepositado();}
    }
    public void maiorSaque(Scanner scanner) {
        System.out.println("\nInforme o número da conta: ");
        int numeroConta = scanner.nextInt();
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.maiorSaque();}
    }
    public void listarContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("\nConta: "+conta.getNumeroConta()
            +"\nTitular: "+conta.getNome()
            +"\nSaldo: "+ conta.getSaldo());
        }
    }
    
