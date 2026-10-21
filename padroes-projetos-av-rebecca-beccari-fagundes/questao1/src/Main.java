public class Main {
    public static void main(String[] args) {

        System.out.println("=== AÉREO ===");
        new PassagemAereaFactory().emitir("Bruna", 1000.0);

        System.out.println("\n=== RODOVIÁRIO ===");
        new PassagemRodoviariaFactory().emitir("Rebecca", 1000.0);

        System.out.println("\n=== FERROVIÁRIO ===");
        new PassagemFerroviariaFactory().emitir("Matheus", 1000.0);
    }
}