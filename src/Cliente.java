/*
Fazer a criação da classe Cliente, com os atributos corretamente associados aos seus respectivos tipos;
Criar os métodos get e set para cada atributo criado.
Lembre-se de utilizar o this para se referir aos atributos da própria classe.
Crie também outros métodos conforme sentir necessidade;
Substitua o atributo nomeTitular por titular e faça a associação da classe Cliente com a classe Conta por meio dele.
Para isso, basta definir uma variável Cliente titular dentro da classe Conta.
*/

public class Cliente {
    private String titular;
    private int agencia;
    private int conta;
    private int cpf;

    // Métodos get e set para titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos get e set para agencia
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    // Métodos get e set para conta
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    // Métodos get e set para cpf
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
