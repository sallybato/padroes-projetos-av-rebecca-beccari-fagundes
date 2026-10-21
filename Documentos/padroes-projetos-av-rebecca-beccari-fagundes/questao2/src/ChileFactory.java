public class ChileFactory extends MatriculaFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(){
         return new BoletaEletronica(); 
    }

    @Override
    public Pagamento criarPagamento(){
         return new WebPay(); 
    }

    @Override
    public ComprovanteMatricula criarComprovante(){
         return new ComprovanteRut(); 
    }
}

