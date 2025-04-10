import java.math.BigDecimal;

public class TestarBancos {
    public static void main(String[] args) {

        // Criando uma ContaPoupanca (herda de Banco)
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNome("João");
        contaPoupanca.setNumero_conta(12345);

        // Mostrando o saldo inicial
        System.out.println("Saldo inicial: R$ " + contaPoupanca.getSaldo());

        // Depositando R$ 2000
        contaPoupanca.Depositar(new BigDecimal("2000"));
        System.out.println("Após depósito: R$ " + contaPoupanca.getSaldo());

        // Aplicando 10% de rendimento
        contaPoupanca.AplicarRendimentos(new BigDecimal("10"));
        System.out.println("Após rendimento de 10%: R$ " + contaPoupanca.getSaldo());

        // Sacando R$ 500
        contaPoupanca.SacarSaldo(new BigDecimal("500"));
        System.out.println("Após saque de R$ 500: R$ " + contaPoupanca.getSaldo());

        // Tentando sacar valor negativo (simulando erro)
        try {
            contaPoupanca.SacarSaldo(new BigDecimal("-10000"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
