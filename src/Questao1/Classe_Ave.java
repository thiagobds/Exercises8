package Questao1;

    public class Classe_Ave extends Classe_Animal {
        
         private boolean voa;
         
         public Classe_Ave(String n, boolean v) {
         super(n);
         setVoa(v);
         }
         
         public boolean getVoa() {
         return voa;
         }
         
         public void setVoa(boolean v) {
         this.voa = v;
         }
         
         public void talk() {
         System.out.println("piu-piu");
    }
}
