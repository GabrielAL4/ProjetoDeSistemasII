package Locacao;

import java.util.Date;

public class EmAndamento extends EstadoLocacao{
    public EmAndamento() {
    }
    @Override
    public void realizarReserva(double v, Locacao c1) {
        Date dataRetirada = getData();
        Date dataDeEntrega = getData();
        if(c1.data.compareTo(dataRetirada) >= 0) if(c1.data.compareTo(dataDeEntrega) == 0)c1.estado = new Concluida();
        else{
            System.out.println("A locação está em andamento e o Cliente" +
                    " tem até o dia " + dataDeEntrega + "para entregar o veículo");
        }
    }
}
