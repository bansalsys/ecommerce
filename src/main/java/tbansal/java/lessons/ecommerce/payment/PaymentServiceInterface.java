package tbansal.java.lessons.ecommerce.payment;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentServiceInterface {
    public boolean debitAccount(String accountNumber, BigDecimal amount);
}
