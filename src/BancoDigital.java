public class BancoDigital {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1, 1000.0);
        ContaPoupanca conta2 = new ContaPoupanca(2, 0.05);

        conta1.depositar(2000.0);
        conta2.depositar(500.0);

        conta1.transferir(conta2, 500.0);

        conta1.sacar(1500.0);
        conta2.sacar(200.0);

        conta2.aplicarRendimento();
    }
}
