public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setTitular("João da Silva");
        cliente.setAgencia(1234);
        cliente.setConta(56789);
        cliente.setCpf(123456789);

        Conta conta = new Conta();
        conta.setTitular(cliente);

        // DEPOSITO
        double valorDeposito = 200;
        conta.deposita(valorDeposito);
        System.out.println("Você realizou um depósito de R$ " + valorDeposito);

        System.out.println("O saldo atual da conta é R$ " + conta.getSaldo());

        System.out.println("----------------------------------------");

        // SAQUE
        double valorSaque = 30;
        conta.saca(valorSaque);
        System.out.println("Você realizou um saque de R$ " + valorSaque);

        System.out.println("O saldo atual da conta é R$ " + conta.getSaldo());

        System.out.println("----------------------------------------");

        // TRANSFERÊNCIA
        Conta contaDestino = new Conta();
        contaDestino.setTitular(new Cliente()); // Conta destino com um cliente fictício
        double valorTransferencia = 75;
        conta.transfere(valorTransferencia, contaDestino);
        System.out.println("Você realizou uma transferência de R$ " + valorTransferencia);

        System.out.println("O saldo atual da conta é R$ " + conta.getSaldo());
        System.out.println("O saldo da conta destino é R$ " + contaDestino.getSaldo());
    }
}
