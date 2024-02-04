public class Main {
    public static void imprimir(Veiculo v) {
        System.out.println(v.toString());
    }

    public static void main(String [] args) {
        Moto moto = new Moto();

        moto.setPlaca("FDJ-853");
        moto.setQuilometragem(5347);
        moto.setCombustivelNoTanque(30);
        moto.setPrecoDiaria(100.00);
        moto.setAlugado(false);
        moto.setCilindradas(5);

        moto.viajar(45);

        Carro carro = new Carro();

        carro.setPlaca("AGL-298");
        carro.setQuilometragem(7482);
        carro.setCombustivelNoTanque(50);
        carro.setPrecoDiaria(300.00);
        carro.setAlugado(true);
        carro.setPotenciaDoMotor(5);

        carro.viajar(45);

        imprimir(moto);
        imprimir(carro);
    }
}
