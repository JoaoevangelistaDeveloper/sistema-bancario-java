package SistemaBancario.Enum;

public enum TipoConta {
    CORRENTE(0.0), POUPANCA(0.005);
     private final double rendimento;

     TipoConta(double rendimento) {
         this.rendimento = rendimento;
     }

     public double getRendimento() {
         return rendimento;
     }

     public double calcularRendimento(double saldo) {
         return saldo * rendimento;
     }

}
