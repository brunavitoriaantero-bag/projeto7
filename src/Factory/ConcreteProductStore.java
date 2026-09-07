package factory;

import model.*;

public class ConcreteProductStore extends ProductStore {

    @Override
    protected Product createProduct(String type) {
        if ("Computer".equals(type)) {
            return new Computer();
        }

        if ("Notebook".equals(type)) {
            return new Notebook();
        }

        throw new IllegalArgumentException("Produto nao suportado: " + type);
    }
}
