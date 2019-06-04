package Questao1;

    public class Classe_Cachorro extends Classe_Mamifero {
    
        private boolean lateAlto;
        
        public Classe_Cachorro(String n, int p, boolean l) {
        super(n, p);
        setLateAlto(l);
        }
        
        public boolean isLateAlto() {
        return this.lateAlto;
        }
        
        public void setLateAlto(boolean l) {
        this.lateAlto = l;
        }
        
        public void talk() {
        System.out.println("Au, au");
    }
}
