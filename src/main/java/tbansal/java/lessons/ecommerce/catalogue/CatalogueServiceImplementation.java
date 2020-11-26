package tbansal.java.lessons.ecommerce.catalogue;

import tbansal.java.lessons.ecommerce.model.CatalogueItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CatalogueServiceImplementation implements CatalogueServiceInterface {

    public static final String SHOES = "Shoes";
    public static final String CLOTHES = "Clothes";
    public static final String ACCESSORIES = "Accessories";
    private BigDecimal bigdecimal100 = new BigDecimal(100);

    public List<CatalogueItem> getItems(final String category) {
        final List<CatalogueItem> allCatalogueItems = getAllCatalogueItems();
        List<CatalogueItem> result = new ArrayList<>();
        for (CatalogueItem item : allCatalogueItems) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }

        return result;
    }

    public List<CatalogueItem> getAllClothes() {

        final List<CatalogueItem> allCatalogueItems = getAllCatalogueItems();
        List<CatalogueItem> result = new ArrayList<>();
        for (CatalogueItem item : allCatalogueItems) {
            if (item.getCategory().equals(CLOTHES)) {
                result.add(item);
            }
        }
        return allCatalogueItems;
    }

    private List<CatalogueItem> getAllCatalogueItems() {
        final List<CatalogueItem> result = new ArrayList<CatalogueItem>();
        // Add accessroies to the item list, please keep them in one place
        result.add(new CatalogueItem("Wallet", BigDecimal.TEN, "", ACCESSORIES));
        result.add(new CatalogueItem("Belt", BigDecimal.ONE, "", ACCESSORIES));
        result.add(new CatalogueItem("Bag", bigdecimal100, "", ACCESSORIES));
        result.add(new CatalogueItem("Mask", BigDecimal.ONE, "", ACCESSORIES));
        result.add(new CatalogueItem("Shades", bigdecimal100, "", ACCESSORIES));
        result.add(new CatalogueItem("Wallet", BigDecimal.TEN, "", ACCESSORIES));
        result.add(new CatalogueItem("Belt", BigDecimal.ONE, "", ACCESSORIES));
        //Add clothes,please keep them in one place
        result.add(new CatalogueItem("Shirts", BigDecimal.TEN, "", CLOTHES));
        result.add(new CatalogueItem("Trousers", BigDecimal.ONE, "", CLOTHES));
        result.add(new CatalogueItem("Sweaters", bigdecimal100, "", CLOTHES));
        //Shoes,please keep them in one place
        result.add(new CatalogueItem("Winter Shoes", BigDecimal.TEN, "", SHOES));
        result.add(new CatalogueItem("Summer shoes", BigDecimal.ONE, "", SHOES));
        result.add(new CatalogueItem("Slippers", bigdecimal100, "", SHOES));
        return result;
    }
}
