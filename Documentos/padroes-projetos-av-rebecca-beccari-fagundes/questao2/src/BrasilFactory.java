public class BrasilFactory extends MatriculaFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(){
         return new Nfse(); 
    }

    @Override
    public Pagamento criarPagamento(){
         return new Pix(); 
    }

    @Override
    public ComprovanteMatricula criarComprovante(){
         return new ComprovanteCpf(); 
    }
}