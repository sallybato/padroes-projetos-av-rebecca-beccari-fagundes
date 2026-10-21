public class Main {
    public static void main(String[] args) {

        System.out.println("=== MATRÍCULA BRASIL ==");
        MatriculaFactory fabricaBrasil = new BrasilFactory();
        Matricula matriculaBrasil = new Matricula(fabricaBrasil);
        matriculaBrasil.confirmarMatricula();

        System.out.println("\n=== MATRÍCULA CHILE ==");
        MatriculaFactory fabricaChile = new ChileFactory();
        Matricula matriculaChile = new Matricula(fabricaChile);
        matriculaChile.confirmarMatricula();
    }
}
