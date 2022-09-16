package Locacao;

public abstract class EstadoLocacao extends Locacao{
    public EstadoLocacao() {
        super();
    }
    public abstract void realizarReserva(double v, Locacao c1);
}
