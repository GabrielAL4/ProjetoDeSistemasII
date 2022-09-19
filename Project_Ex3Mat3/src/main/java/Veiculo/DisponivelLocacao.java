package Veiculo;

public class DisponivelLocacao extends EstadoVeiculo{
    public DisponivelLocacao() {
    }
    @Override
    public int verificarEstado(Veiculo v) {
        if (v.estadov == new DisponivelLocacao()) System.out.printf("Veículo disponível para locação");
        return 1;
    }
}
