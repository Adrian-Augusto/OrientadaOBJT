import java.math.BigDecimal;

public class ContaPoupanca extends Banco{



    public void AplicarRendimentos(BigDecimal porcentual) {
        BigDecimal saldo = getSaldo();
        BigDecimal rendimentos = saldo.multiply(porcentual);
        Depositar(rendimentos);
    }


}
