package factory;

import model.Product;

public abstract class ProductStore {

    public Product orderProduct(String type) {
        Product product = createProduct(type);

        product.getName();
        product.getPrice();

        return product;
    }

    protected abstract Product createProduct(String type);
}