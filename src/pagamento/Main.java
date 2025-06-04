package pagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoDeCredito(
                "5547452219665844",
                548,
                "Rodolfo",
                "12/30"
                );

        Pagamento boleto = new Boleto("47845246352965869512365848575103548752146985");

        Pagamento pix = new Pix("NuBank", "Rodolfo", "95348721864");

        realizarPagamento(cartao, 150.00);
        realizarPagamento(boleto, 75.00);
        realizarPagamento(pix, 200.00);

    }

    public static void realizarPagamento(Pagamento pagamento, double valor) {
        System.out.println("Realizando pagamento...");
        pagamento.pagar(valor);
        System.out.println("Pagamento realizado com sucesso!\n");
        
    }
}
