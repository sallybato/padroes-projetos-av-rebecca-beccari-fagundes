public class PassagemRodoviaria implements Passagem {
    @Override
    public double calcularTaxa(double valorTarifa){
        return valorTarifa * 0.03; 
    }
    @Override
    public String getModal(){
        return "Rodoviário";
    }
    @Override
    public String getDocumentos(){
        return "Documento de identidade com foto OBRIGATÓRIO";
    }
}
//classes concretas que implementam o produto 