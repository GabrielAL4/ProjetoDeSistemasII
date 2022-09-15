public class Negativa extends EstadoConta{

    public Negativa() {
    }

    @Override
    public void sacar(double v, Conta c) {
        c.saldo -= v;
        if(c.saldo <= -100D){
            System.out.println("A conta passou para o estado de Bloqueada");
            c.estado = new Bloqueada();
        }
        else{
            System.out.println("Saque realizado, saldo atual de: " + c.saldo);
        }
    }

    @Override
    public void depositar(double v, Conta c) {
        c.saldo += v;
        if(c.saldo >=0)c.estado = new Positiva();
        else{
            System.out.println("Depósito realizado, conta segue em estado de Negativa");
            System.out.println("Saldo atual: " + c.saldo);
        }
    }
}
