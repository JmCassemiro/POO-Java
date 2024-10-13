public class Conta {
    private double saldo = 1000;

    public double getSaldo() {
        return saldo;
    }

    private static int qtdClientes;
    double[] valoresDepositos = new double[100];
    double[] valoresSaques = new double[100];

    public Conta(int cont) {
        qtdClientes = cont;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;

            for (int i = 0; i < valoresSaques.length; i++) {
                if (valoresSaques[i] == 0) {
                    valoresSaques[i] = valor;
                    break;
                }
            }
        } else
            System.out.println("Você não tem esse dinheiro");
    }

    public void deposita(double valor) {
        this.saldo += valor;
        for (int i = 0; i < valoresDepositos.length; i++) {
            if (valoresDepositos[i] == 0) {
                valoresDepositos[i] = valor;
                break;
            }
        }
    }

    public void extrato() {
        System.out.println("***** Extrato da conta *****");
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("\n--------------------");
        System.out.println("Saques");
        for (int i = 0; i < valoresSaques.length; i++) {
            if (valoresSaques[i] != 0) {
                System.out.println(valoresSaques[i]);
            }
        }
        System.out.println("--------------------");
        System.out.println("Depositos");
        for (int i = 0; i < valoresDepositos.length; i++) {
            if (valoresDepositos[i] != 0) {
                System.out.println(valoresDepositos[i]);
            }
        }
        System.out.println("--------------------");
    }
}
