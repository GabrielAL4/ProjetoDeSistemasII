package Locacao;

import java.util.Date;
import java.util.Scanner;

public class Agendada extends EstadoLocacao{
    public Agendada() {
    }
    @Override
    public void realizarReserva(double v, Locacao c1) {
        double caucao = 0.20*v;
        Date dataRetirada = getData();
        Date dataDeEntrega = getData();
        if(v1.verificarEstado(v1) == 1) {
            if (c1.data.compareTo(dataRetirada) > 0) {
                if (c1.data.compareTo(dataDeEntrega) < 0) c1.estado = new EmAndamento();
                if (c1.data.compareTo(dataDeEntrega) == 0) c1.estado = new Concluida();
            } else System.out.println("Reserva agendada para: " + c1.data + " garantia de acidentes " + caucao);
        }
    }
}
