package Locacao;

public class Locacao {
    double caucao;
    EstadoLocacao estado;

    public Locacao(double caucao) {
        this.caucao = caucao;
        this.estado = new Agendada();
    }
    public Locacao() {

    }
    public void realizarReserva(double c, Locacao c1){
        this.estado.realizarReserva(c, this);
    }
    public double getCaucao() {
        return caucao;
    }
}
