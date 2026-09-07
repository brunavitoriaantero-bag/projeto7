package Factory;

import Model.*;

public class PlaystationStore extends ProductStore {

    @Override
    protected Product createProduct(String type) {
        if ("Playstation".equals(type)) {
            return new Playstation();
        }

        if ("PlaystationPortable".equals(type)) {
            return new PlaystationPortable();
        }

        throw new IllegalArgumentException("Produto nao suportado: " + type);
    }
}
