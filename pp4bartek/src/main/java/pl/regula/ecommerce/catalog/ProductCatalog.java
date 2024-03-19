package pl.regula.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.*;

public class ProductCatalog {
    private ArrayList<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public List<Product> allProducts() {
        return Collections.unmodifiableList(products);
    }

    public String addProduct(String name, String description){
        UUID id = UUID.randomUUID();
        Product newProduct = new Product(id, name, description);

        ArrayList<Product> products = new ArrayList<>();
        products.add(newProduct);
        return name;
    }

    public void changePrice(String id, BigDecimal bigDecimal) {
    Product product = getProductBy(id);

    
    }

    public Product getProductBy(String id) {
        return products.stream().filter(product -> product.getId().equals(id))
                .findFirst().get();
    }
}
