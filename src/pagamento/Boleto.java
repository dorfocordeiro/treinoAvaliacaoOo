package pagamento;

public class Boleto implements Pagamento{
    private String codigoBarras;

    public Boleto(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com boleto!");
    }



}
