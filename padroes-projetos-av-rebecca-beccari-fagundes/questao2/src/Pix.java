public class Pix implements Pagamento {
    @Override
    public void processar(){
        System.out.println("Processando pagamento via Pix (Brasil).");
    }
}
