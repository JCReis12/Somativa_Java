package interFace;

public class ExecutaTeste implements TesteFisico {
    @Override
    public void executarTeste() {
        System.out.println("Teste em execução...");
    }

    @Override
    public int calcularPonto() {
        return 0; // Não utilizado nesta classe
    }

    @Override
    public void exibirResultado() {
        // Não utilizado nesta classe
    }
}