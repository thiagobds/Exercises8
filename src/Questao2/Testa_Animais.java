package Questao2;

import Questao1.Classe_Arara;
import Questao1.Classe_Cachorro;
import Questao1.Classe_Papagaio;
import Questao1.Classe_Vaca;

    public abstract class Testa_Animais {
        
        public static void main(String[] args) {
            
        Classe_Papagaio p = new Classe_Papagaio("Loro José", true, "Vem cá loro");
        p.talk();
        p.imprime();
        
        Classe_Arara a = new Classe_Arara("Arara", true);
        a.talk();
        a.imprime();
        
        Classe_Cachorro c = new Classe_Cachorro("Thanos", 6, true);
        c.talk();
        c.imprime();
        
        Classe_Vaca v = new Classe_Vaca("Muzinho", 2, true);
        v.talk();
        v.imprime();
    }
}