package Questao1;

    public class Classe_Vaca extends Classe_Mamifero {
        
        private boolean temLeite;
        
        public Classe_Vaca(String n, int p, boolean t) {
        super(n, p);
        setTemLeite(t);
        }
        
        public boolean isTemLeite() {
        return this.temLeite;
        }
        
        public void setTemLeite(boolean t) {
        this.temLeite = t;
        }
        
        public void talk() {
        System.out.println("Muuu");
    }
}