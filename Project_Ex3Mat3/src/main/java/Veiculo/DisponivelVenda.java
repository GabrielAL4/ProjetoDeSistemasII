package Veiculo;

public class DisponivelVenda extends EstadoVeiculo{
    public DisponivelVenda() {
    }

    @Override
    public int verificarEstado(Veiculo v) {
        if(v.estadov == new DisponivelVenda()) System.out.printf("Veículo disponível para venda");
        return 2;
    }
}
