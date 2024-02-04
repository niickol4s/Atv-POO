public class Moto extends Veiculo {
    private int cilindradas;

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public boolean viajar(int distancia) {
        distancia /= 30;

        if (this.getCombustivelNoTanque() >= distancia) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "\nVeículo: Moto;" +
        "\nPlaca: " + this.getPlaca() +
        "\nQuilometragem: " + this.getQuilometragem() +
        "\nCombustível: " + this.getCombustivelNoTanque() +
        "\nValor Diária: " + this.getPrecoDiaria() + 
        "\nAlugado: " + this.getAlugado() + 
        "\nCilindrada: " + this.getCilindradas();
    }
}
