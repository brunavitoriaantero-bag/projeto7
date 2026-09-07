import Model.*;
import Factory.*;
import Singleton.Configuracao;
import Prototype.Personagem;
public class Main {
    public static void main(String[] args) {

        ProductStore lojaEletronicos = new ConcreteProductStore();
        ProductStore lojaPlaystation = new PlaystationStore();

        lojaEletronicos.orderProduct("Computer");
        lojaEletronicos.orderProduct("Notebook");
        lojaPlaystation.orderProduct("Playstation");
        lojaPlaystation.orderProduct("PlaystationPortable");

        Configuracao c1 = Configuracao.getInstance();
        Configuracao c2 = Configuracao.getInstance();

        System.out.println(c1 == c2);

        Personagem guerreiro = new Personagem();

        guerreiro.setNome("Guerreiro");
        guerreiro.setVida(100);
        guerreiro.setMana(50);
        guerreiro.setForca(80);
        guerreiro.setDefesa(90);

        Personagem guerreiro2 = guerreiro.clone();
        guerreiro2.setForca(85);

        Personagem guerreiro3 = guerreiro.clone();
        guerreiro3.setForca(70);

        Personagem guerreiro4 = guerreiro.clone();
        guerreiro4.setDefesa(100);

        Personagem guerreiro5 = guerreiro.clone();
        Personagem guerreiro6 = guerreiro.clone();
        Personagem guerreiro7 = guerreiro.clone();
        Personagem guerreiro8 = guerreiro.clone();
        Personagem guerreiro9 = guerreiro.clone();
        Personagem guerreiro10 = guerreiro.clone();
        Personagem guerreiro11 = guerreiro.clone();
        Personagem guerreiro12 = guerreiro.clone();
        Personagem guerreiro13 = guerreiro.clone();
        Personagem guerreiro14 = guerreiro.clone();
        Personagem guerreiro15 = guerreiro.clone();
        Personagem guerreiro16 = guerreiro.clone();
        Personagem guerreiro17 = guerreiro.clone();
        Personagem guerreiro18 = guerreiro.clone();
        Personagem guerreiro19 = guerreiro.clone();
        Personagem guerreiro20 = guerreiro.clone();
        Personagem guerreiro21 = guerreiro.clone();

        System.out.println(guerreiro.getForca());
        System.out.println(guerreiro2.getForca());
        System.out.println(guerreiro4.getDefesa());
    }
}
