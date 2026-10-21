public class PassagemAerea implements Passagem {
    @Override
    public double calcularTaxa(double valorTarifa) {
        return valorTarifa * 0.08;
    }

    @Override
    public String getModal() {
        return "Aéreo";
    }

    @Override
    public String getDocumentos() {
        return "RG com foto e e-ticket OBRIGATÓRIOS";
    }
}