package tbansal.java.lessons.ecommerce.payment;

import tbansal.java.lessons.ecommerce.catalogue.CatalogueServiceInterface;

import java.math.BigDecimal;
import java.util.List;

public class PaymentServiceImplementation implements PaymentServiceInterface {

    public boolean debitAccount(String accountNumber, BigDecimal amount) {
        return false;
    }
}
