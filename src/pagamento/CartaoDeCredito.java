package pagamento;

public class CartaoDeCredito implements Pagamento{
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private int cvv;

    public CartaoDeCredito(String numeroCartao, int cvv, String nomeTitular, String dataValidade) {
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito!");
    }


}
