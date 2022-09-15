public class Bloqueada extends EstadoConta{

    public Bloqueada() {
    }

    @Override
    public void sacar(double v, Conta c) {
        System.out.println("Saque não é possível pois está bloqueada");
    }

    @Override
    public void depositar(double v, Conta c) {
        c.saldo += v;
        if(c.saldo < -100) System.out.println("Conta segue Bloqueada, saldo de: " + c.saldo);
        else {
            if ((c.saldo >= -100D) && (c.saldo < 0)) {
                c.estado = new Negativa();
                System.out.println("A conta está no estado Negativa, saldo de: " + c.saldo);
            }
            if (c.saldo >= 0) {
                c.estado = new Positiva();
                System.out.println("A conta está no estado Positiva, saldo de: " + c.saldo);
            }
        }
    }
}
