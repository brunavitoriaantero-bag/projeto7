import model.*;   // Importa a pasta model
import factory.*; // Importa a pasta factory

public class Main {
    public static void main(String[] args) {
        // Cria a loja
        ProductStore lojaEletronicos = new ConcreteProductStore();
        ProductStore lojaPlaystation = new PlaystationStore();

        // Faz os pedidos
        lojaEletronicos.orderProduct("Computer");
        lojaEletronicos.orderProduct("Notebook");
        lojaPlaystation.orderProduct("Playstation");
        lojaPlaystation.orderProduct("PlaystationPortable");
    }
}
