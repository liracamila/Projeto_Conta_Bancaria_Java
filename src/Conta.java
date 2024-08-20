public class Conta {
    private double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular; // Referência para a classe Cliente

    // Método para depositar dinheiro
    public void deposita(double valor) {
        this.saldo += valor;
    }

    // Método para sacar dinheiro
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    // Método para transferir dinheiro para outra conta
    public boolean transfere(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    // Métodos get e set para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos get e set para agencia
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    // Métodos get e set para numeroConta
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Métodos get e set para titular
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}



/* OBS: A palavra this dentro do método serve para indicar que vamos fazer referência aos
elementos da própria classe. A sua utilização é opcional, mas é uma boa prática adotar a
sua escrita, uma vez que permite identificar mais facilmente o que pertence à classe. */