package IntroducaoOO;

public class BancoDoPetri {

    public static void main(String[] args) {
        Conta conta = new Conta(1234, "Daniela", 50.0f);
        //conta.saldo = 32.0f;
        Conta conta2 = new Conta(1234, "Ricardo", 50.0f);
        conta.sacar(12.0f);

        System.out.println("O saldo da conta é: " + conta.saldo);
        System.out.println("O nome do titular da conta é: " + conta.nomeTitular);

        System.out.println("O saldo da conta é: " + conta2.saldo);
        System.out.println("O nome do titular da conta é: " + conta2.nomeTitular);
    }

}

----------------------------------------------------------------------
package IntroducaoOO;

public class Conta {
    int numeroConta;
    String nomeTitular;
    float saldo;

    //construtor vazio
    public Conta(){
        System.out.println("O construtor da classe conta foi ativado");
    }

    //Construtor com parametros
    public Conta(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public float sacar(float x) {
        if (saldo >= x){
            System.out.println("Saque efetuado com sucesso");
            saldo -= x;
            return x;
        } else {
            System.out.println("Saldo insuficiente");
            return 0.0f;
        }

    }
}
