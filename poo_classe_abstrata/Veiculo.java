public abstract class Veiculo {
    private String placa;
    private int combustivelNoTanque;
    private int quilometragem;
    private boolean alugado;
    private double precoDiaria;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCombustivelNoTanque(int combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public String getPlaca() {
        return this.placa;
    }

    public int getCombustivelNoTanque() {
        return this.combustivelNoTanque;
    }

    public int getQuilometragem() {
        return this.quilometragem;
    }

    public boolean getAlugado() {
        return this.alugado;
    }

    public double getPrecoDiaria() {
        return this.precoDiaria;
    }

    public abstract boolean viajar(int distancia);
    public abstract String toString();

    public void abastecer(int combustivel) {
        this.combustivelNoTanque += combustivel;
    }

    public boolean equals(Veiculo veiculo) {
        if (this.placa == veiculo.getPlaca()) {
            return true;
        } else {
            return false;
        }
    }
}