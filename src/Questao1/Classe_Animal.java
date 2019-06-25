package Questao1;

    public abstract class Classe_Animal {
        
        private String nome;
        
        public Classe_Animal(String n) {
        setNome(n);
        }
        
        public void imprime() {
        System.out.println("Nome : " + getNome());
        }
        
        public void talk() {
        }
        
        public void setNome(String nome) {
        this.nome = nome;
        }
        
        public String getNome() {
        return this.nome;
     }
}