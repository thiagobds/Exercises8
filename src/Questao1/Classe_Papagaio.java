package Questao1;

    public class Classe_Papagaio extends Classe_Ave {
    
        private String frase;
        
        public Classe_Papagaio(String n, boolean v, String f) {
        super(n, v);
        setFrase(f);
        }
        
        public void talk() {
        System.out.println(getFrase());
        }
        
        public String getFrase() {
        return this.frase;
        }
        
        public void setFrase(String f) {
        this.frase = f;
    }
}