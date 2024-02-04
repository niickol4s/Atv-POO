public class Carro extends Veiculo {
    private double potenciaDoMotor;

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public double getPotenciaDoMotor() {
        return this.potenciaDoMotor;
    }

    public boolean viajar(int distancia) {
        distancia /= 10;

        if (this.getCombustivelNoTanque() >= distancia) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "\nVeículo: Carro;" +
        "\nPlaca: " + this.getPlaca() +
        "\nQuilometragem: " + this.getQuilometragem() +
        "\nCombustível: " + this.getCombustivelNoTanque() +
        "\nValor Diária: " + this.getPrecoDiaria() + 
        "\nAlugado: " + this.getAlugado() + 
        "\nPotência do Motor: " + this.getPotenciaDoMotor();
    }
}
