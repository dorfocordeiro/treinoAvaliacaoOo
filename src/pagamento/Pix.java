package pagamento;

public class Pix implements Pagamento{
    private String chavePix;
    private String nome;
    private String instituicaoFinanceira;


    public Pix(String instituicaoFinanceira, String nome, String chavePix) {
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.nome = nome;
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " para " + nome + " realizado com Pix!");
    }

}
