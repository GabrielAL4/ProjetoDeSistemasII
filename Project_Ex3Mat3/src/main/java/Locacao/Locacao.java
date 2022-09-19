package Locacao;
import Veiculo.Veiculo;
//1- Disponível locação
//2- Disponível Venda
//3- Em manutenção
//4- Vendido
import java.util.Date;

public class Locacao extends Veiculo {
    double valor;
    Date data;
    Veiculo v1;
    EstadoLocacao estado;
    public Locacao(double valor, Date data) {
        this.data = data;
        this.valor = valor;
        this.estado = new Agendada();
    }
    public Locacao() {
    }
    public void realizarReserva(double v, Locacao c1){
        this.estado.realizarReserva(v, this);
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}
