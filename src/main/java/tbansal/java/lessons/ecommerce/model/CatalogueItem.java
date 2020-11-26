package tbansal.java.lessons.ecommerce.model;

import java.math.BigDecimal;

public class CatalogueItem {
    private String itemName;
    private BigDecimal price;
    private String imagePath;
    private String category;

    public CatalogueItem(String itemName, BigDecimal price, String imagePath, String category) {
        this.itemName = itemName;
        this.price = price;
        this.imagePath = imagePath;
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getCategory() {
        return category;
    }
}
