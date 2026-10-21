public class PassagemFerroviariaFactory extends FactoryPassagem {
    @Override
    public Passagem criarPassagem(){
        return new PassagemFerroviaria();
    }
}//classe concreta factory