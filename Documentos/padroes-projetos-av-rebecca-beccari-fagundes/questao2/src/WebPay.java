public class WebPay implements Pagamento{
    @Override
    public void processar(){
        System.out.println("Processando o pagamento via webpay (Chile).");
    }
}
