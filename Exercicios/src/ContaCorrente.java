public class ContaCorrente {
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    void credito(int valor){
        saldo = valor + saldo;
    };

    void debito(int valor){
        saldo = valor - saldo;
    };

    void resumo(){
        System.out.println("Número da conta: "+numero);
        System.out.println("Primeiro titular: "+primeiroTitular);
        System.out.println("Segundo titular: "+segundoTitular);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("Limite atual: "+limiteTotal+saldo);
        System.out.println("Limite total: "+limiteTotal);
    }

    boolean estaDevedor(){
        if(saldo < 0){
            System.out.println("Procure o seu gerente!!!");
            return true;
        } else {
            System.out.println("Não está devendo");
            return false;
        }
    }
}
