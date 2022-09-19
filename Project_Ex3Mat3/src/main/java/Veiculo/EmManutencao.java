package Veiculo;

public class EmManutencao extends EstadoVeiculo{
    public EmManutencao() {
    }
    @Override
    public int verificarEstado(Veiculo v) {
        if(v.estadov == new EmManutencao()) System.out.printf("O veículo está em manutenção");
        return 3;
    }
}
