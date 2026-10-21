public abstract class FactoryPassagem {

    public abstract Passagem criarPassagem();

    
    public final void emitir(String passageiro, double valorTarifa) {
        Passagem p = criarPassagem();

        System.out.println("Emissão de Passagem ");
        System.out.println("Modal: " + p.getModal());
        System.out.println("Passageiro: " + passageiro);
        System.out.println("Taxa de embarque: R$ " + p.calcularTaxa(valorTarifa));
        System.out.println("Documentos: " + p.getDocumentos());
    }
}// factory method