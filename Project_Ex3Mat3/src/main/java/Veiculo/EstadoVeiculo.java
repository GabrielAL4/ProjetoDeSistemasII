package Veiculo;

public abstract class EstadoVeiculo extends Veiculo {

    public EstadoVeiculo() {
        super();
    }
    public abstract int verificarEstado(Veiculo v);
}
