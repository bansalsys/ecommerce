package tbansal.java.lessons.ecommerce.model;

import java.util.List;

public class Order {
    private List<CatalogueItem> items;
    private Address address;
    private String shippingMethod;

    public Order(List<CatalogueItem> items, Address address, String shippingMethod) {
        this.items = items;
        this.address = address;
        this.shippingMethod = shippingMethod;
    }

    public List<CatalogueItem> getItems() {
        return items;
    }

    public Address getAddress() {
        return address;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }
}
