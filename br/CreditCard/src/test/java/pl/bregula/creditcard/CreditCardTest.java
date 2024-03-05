package pl.bregula.creditcard;

import org.junit.jupiter.api.Test;
import pl.bregula.CreditCard;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignCredit(){
        //Arrange
        CreditCard card = new CreditCard();
        //Act
        card.assignCreditLimit(BigDecimal.valueOf(1000));
        //Assert
        assert BigDecimal.valueOf(1000).equals(card);
    }

    @Test
    void itDenyCreditBelowThreshold(){
        CreditCard card = new CreditCard();

        try{
            card.assignCreditLimit(BigDecimal.valueOf(50));
            fail("Should throw exception");
        } catch (CredtBelowTresholdException e){
            assertTrue (true);
        }
    }
}
