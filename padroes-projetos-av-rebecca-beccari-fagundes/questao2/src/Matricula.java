public class Matricula {
    private MatriculaFactory fabrica;

    // Recebew factory
    public Matricula(MatriculaFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmarMatricula() {
        // Cria os três artefatos
        DocumentoFiscal doc = fabrica.criarDocumentoFiscal();
        Pagamento pag = fabrica.criarPagamento();
        ComprovanteMatricula comp = fabrica.criarComprovante();

        // Imprime o relatório
        System.out.println("--- Confirmando Matrícula ");
        doc.emitir();
        pag.processar();
        comp.gerar();
    }
}
