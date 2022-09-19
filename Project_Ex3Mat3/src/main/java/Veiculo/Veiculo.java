package Veiculo;

public class Veiculo {
    EstadoVeiculo estadov;
    public Veiculo(EstadoVeiculo estadov) {
        this.estadov = estadov;
    }
    public Veiculo() {
    }
    public int verificarEstado(Veiculo v){
        this.estadov.verificarEstado(v);
        return 0;
    }
}
