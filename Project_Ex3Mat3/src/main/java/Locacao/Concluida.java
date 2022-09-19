package Locacao;

import java.util.Date;

public class Concluida extends EstadoLocacao {
    public Concluida() {
    }
    @Override
    public void realizarReserva(double v, Locacao c1) {
        Date dataRetirada = getData();
        Date dataDeEntrega = getData();
        c1.estado = new Concluida();
        System.out.println("Locação Concluída, data de Retirada "
                + dataRetirada + " Data de entrega: " + dataDeEntrega);
    }
}
