package Questao1;

    public class Classe_Mamifero extends Classe_Animal {
        
        private int patas;
        
        public Classe_Mamifero(String n, int p) {
        super(n);
        setPatas(p);
        }
        
        public int getPatas() {
        return patas;
        }
        
        public void setPatas(int p) {
        this.patas = p;
    }
}
