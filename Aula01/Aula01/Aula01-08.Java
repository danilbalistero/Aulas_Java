package IntroducaoOO;

public class Conta {
    //atributos
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    public Conta() {
    }

    public Conta(int numeroConta, String nomeTitular, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public float sacar(float valor) {
        if (saldo >= valor){
            System.out.println("Saque efetuado com sucesso");
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente");
            return 0.0f;
        }
    }

    public void depositar(float valor){
        if (valor <= 0) {
            System.out.println("Valor de deposito invalido");
        } else {
          this.saldo += valor;
        }
    }

        //SEM RETORNO
   /* public void imprimirNomeConta(){
        System.out.println("O nome do titular da conta é: " + this.nomeTitular);

    }*/
        //COM RETORNO
    public String imprimirNomeContaRetorno(){
        return("O nome do titular da conta é: " + this.nomeTitular);
    }

    public void imprimirSaldo(){
        System.out.println("O saldo da conta cujo titular é: " + this.nomeTitular);
        System.out.println("é igual a: " + this.saldo);
    }

    public void transferir(float valor, Conta contaDestino){
        if(valor <= 0 || valor > this.saldo){
            System.out.println("Valor insuficiente para transferencia");
        }else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Valor transferido com sucesso para o titular " + contaDestino.nomeTitular);

        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
------------------------------------------------
package IntroducaoOO;

public class BancoDoPetri {

    //CLASSE EXECUTORA
    public static void main(String[] args) {
        Conta conta = new Conta(1234, "Daniela", 50.0f);
        //conta.saldo = 32.0f;
        Conta conta2 = new Conta(1274, "Ricardo", 50.0f);
        //conta.sacar(12.0f);

        //System.out.println("O saldo da conta é: " + conta.saldo);
       // System.out.println("O nome do titular da conta é: " + conta.nomeTitular);

        //System.out.println("O saldo da conta é: " + conta2.saldo);
        //System.out.println("O nome do titular da conta é: " + conta2.nomeTitular);
        //conta.depositar(100.0f);
        //System.out.println(conta.saldo);

        //System.out.println(conta.imprimirNomeContaRetorno());
        //conta.imprimirSaldo();
       // conta.transferir(25.0f, conta2);
        //conta.imprimirSaldo();
        //conta2.imprimirSaldo();


        conta.setNomeTitular("José");
        System.out.println(conta.getNomeTitular());


    }

}
-------------------------------------------------------------------

package Tarefa;

public class PessoaBack {
    private int altura;
    private int peso;
    private

}
---------------------
package Tarefa;

public class IntroducaoPessoa {
}
