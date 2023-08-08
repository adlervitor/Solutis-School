public class ProgramaBanco {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        ContaCorrente conta1 = new ContaCorrente();

        conta1.saldo = 500;
        conta1.numero = "123";
        conta1.tipo = "Corrente";
        conta1.primeiroTitular = cliente1;
        conta1.limiteTotal = 1000;

        conta1.credito(300);
        conta1.debito(200);

        conta1.resumo();

    }
}