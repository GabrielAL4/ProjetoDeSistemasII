public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(2000);

        c1.depositar(1000D, c1);

        c1.sacar(20, c1);

        c1.sacar(1000, c1);

        c1.sacar(100, c1);

        c1.sacar(10, c1);

        c1.sacar(100, c1);

        c1.depositar(1000, c1);

        c1.sacar(2800, c1);
        System.out.println(c1.getSaldo());
        c1.sacar(300, c1);
        System.out.println(c1.getSaldo());
    }

}


