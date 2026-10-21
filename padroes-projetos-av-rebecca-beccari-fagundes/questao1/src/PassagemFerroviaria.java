public class PassagemFerroviaria implements Passagem {
    @Override 
    public double calcularTaxa(double valorTarifa){
        return valorTarifa * 0.05;
    }
    @Override 
    public String getModal(){
        return "Ferroviário";
    }
    @Override 
    public String getDocumentos(){
        return "É OBRIGATÓRIO documento de identidade com foto e comprovante de reserva";
    }
}
    