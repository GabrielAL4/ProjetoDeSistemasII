
public abstract class EstadoConta extends Conta{
    public EstadoConta() {
    }

    public abstract void sacar(double v, Conta c);

    public abstract void depositar(double v, Conta c);
}
