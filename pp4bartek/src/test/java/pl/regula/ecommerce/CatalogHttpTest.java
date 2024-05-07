package pl.regula.ecommerce;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pl.regula.ecommerce.catalog.Product;
import pl.regula.ecommerce.catalog.ProductCatalog;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class CatalogHttpTest {
    @LocalServerPort
    int port;
    @Autowired
    TestRestTemplate http;
    @Autowired
    ProductCatalog catalog;
    @Test
    void itLoadsProductsOverHttp(){
        var url = String.format("http://localhost:%s/api/products",port);
        catalog.addProduct("My Example Product","ex desc");

        ResponseEntity<Product[]> response = http.getForEntity(url, Product[].class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody())
                .hasSizeGreaterThan(1)
                .extracting("name")
                .contains("My Example Product");
    }

}
