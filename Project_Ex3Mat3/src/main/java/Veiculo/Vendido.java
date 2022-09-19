package Veiculo;

public class Vendido extends EstadoVeiculo{
    public Vendido() {
    }
    @Override
    public int verificarEstado(Veiculo v) {
        if(v.estadov == new Vendido()) System.out.printf("Veículo vendido");
        return 4;
    }
}
