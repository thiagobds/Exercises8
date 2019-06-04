package Questao3;

    public class Classe_Fornecedor extends Classe_Pessoa {
        
        private double valorCredito;
        private double valorDivida;
        
        public Classe_Fornecedor(String nome, String endereco,String telefone, double valorCredito,double valorDivida) {
        super(nome, endereco, telefone);
        setValor_Credito(valorCredito);
        setValor_Divida(valorDivida);
        }
        
        public double getValor_Credito() {
        return valorCredito;
        }
        
        public void setValor_Credito(double valorCredito) {
        this.valorCredito = valorCredito;
        }
        
        public double getValor_Divida() {
        return valorDivida;
        }
        
        public void setValor_Divida(double valorDivida) {
        this.valorDivida = valorDivida;
        }
        
        public double obter_Saldo() {
        return this.valorCredito - this.valorDivida;
    }
}
