public class BoletaEletronica implements DocumentoFiscal{
    @Override 
    public void emitir(){
        System.out.println("Emitindo Boleta Electrónica com IVA de 19% (Chile).");
    }
}
