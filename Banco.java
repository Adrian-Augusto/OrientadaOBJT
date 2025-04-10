import java.math.BigDecimal;

public class Banco {
    private int numero_conta;
    private String nome;
    private BigDecimal saldo;

    // ✅ Construtor que inicializa o saldo
    public Banco() {
        this.saldo = BigDecimal.ZERO;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public void Depositar(BigDecimal Depositar) {
        this.saldo = this.saldo.add(Depositar);
    }
    public void SacarSaldo(BigDecimal sacar) {
        if (this.saldo.compareTo(sacar) <0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
            this.saldo= this.saldo.subtract(sacar);
        }


    }