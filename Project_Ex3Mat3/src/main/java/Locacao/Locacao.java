package Locacao;
import java.util.Date;
import java.util.Scanner;
public class Locacao {
    double valor;
    Date data;
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
