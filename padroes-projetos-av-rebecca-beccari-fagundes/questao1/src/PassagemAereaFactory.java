public class PassagemAereaFactory extends FactoryPassagem {
    @Override
    public Passagem criarPassagem() {
        return new PassagemAerea();
    }
}// concreta da factory