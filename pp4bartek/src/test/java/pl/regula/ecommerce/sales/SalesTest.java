package pl.regula.ecommerce.sales;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

public class SalesTest {

    @Test
    void itShowsCurrentOffer(){
        SalesFacade sales = thereIsSalesFacade();
        String customerId = thereIsCustomer("Kuba");

        Offer offer = sales.getCurrentOffer(customerId);

        assertThat(offer.getTotal()).isEqualTo(BigDecimal.valueOf(0));
        assertThat(offer.getItemsCount()).isEqualTo(0);
    }

    private String thereIsCustomer(String name) {
        return name;
    }

    private String thereIsSalesFacade() {
        return name;
    }

    @Test
    void itAllowsToAddProductToCart(){

    }

}
