package tbansal.java.lessons.ecommerce.order;

import tbansal.java.lessons.ecommerce.model.CatalogueItem;
import tbansal.java.lessons.ecommerce.model.Order;

import java.util.List;

public interface OrderServiceInterface {

    public boolean placeOrder(final Order order);

}
