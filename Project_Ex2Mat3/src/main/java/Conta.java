public class Conta{
    double saldo;
    double valor;
    EstadoConta estado;
    public Conta() {
    }

    public Conta(double s){
        this.saldo = s;
        this.estado = new Positiva();
    }


    public void sacar(double v, Conta conta){
        this.estado.sacar(v, this);
    }

    public void depositar(double v, Conta conta){
        this.estado.depositar(v, this);
    }

    public double getSaldo() {
        return saldo;
    }

}
