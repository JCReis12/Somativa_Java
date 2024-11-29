package interFace;

public class CalculaPonto implements TesteFisico {
    @Override
    public void executarTeste() {
        // Não utilizado nesta classe
    }

    @Override
    public int calcularPonto() {
        // Lógica de cálculo simulada
        int pontos = (int) (Math.random() * 100);
        System.out.println("Pontuação calculada: " + pontos);
        return pontos;
    }

    @Override
    public void exibirResultado() {
        // Não utilizado nesta classe
    }
}