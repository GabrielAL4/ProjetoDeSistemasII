public class Positiva extends EstadoConta {
    public Positiva() {
    }

    @Override
    public void sacar(double v, Conta c) {
        double valorApos = c.saldo - v;
        if((c.saldo > v) && (valorApos > 0)){
            c.saldo = valorApos;
            System.out.println("Saque realizado no valor de: " + v +
                    " Novo saldo da conta e de: " + c.saldo);
        }
        if((valorApos< 0) && (valorApos >= -100D)){
            c.saldo = valorApos;
            c.estado = new Negativa();
            System.out.println("A conta passou para o estado Negativa" );
        }
        if(valorApos < -100D){
            c.saldo = valorApos;
            c.estado = new Bloqueada();
            System.out.println("A conta passou para o estado Bloqueada");
        }

    }

    @Override
    public void depositar(double v, Conta c) {
        c.saldo += v;
        System.out.println("Depósito realizado saldo atual de: " + c.saldo);
    }

}
