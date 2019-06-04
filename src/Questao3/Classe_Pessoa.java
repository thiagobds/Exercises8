package Questao3;

    public class Classe_Pessoa {
        
        private String nome;
        private String endereco;
        private String telefone;
        
        public Classe_Pessoa(String nome, String endereco,String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        }
        
        public String getNome() {
        return nome;
        }
        
        public void setNome(String nome) {
        this.nome = nome;
        }
        
        public String getEndereco() {
        return endereco;
        }
        
        public void setEndereco(String endereco) {
        this.endereco = endereco;
        }
        
        public String getTelefone() {
        return telefone;
        }
        
        public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}