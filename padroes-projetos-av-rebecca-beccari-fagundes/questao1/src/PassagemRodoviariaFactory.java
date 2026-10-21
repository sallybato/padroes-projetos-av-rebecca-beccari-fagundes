    public class PassagemRodoviariaFactory extends FactoryPassagem {
    @Override
    public Passagem criarPassagem() {
        return new PassagemRodoviaria();
    }
}
// classe concreta da factory  