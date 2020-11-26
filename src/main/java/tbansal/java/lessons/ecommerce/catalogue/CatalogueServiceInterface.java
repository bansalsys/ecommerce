package tbansal.java.lessons.ecommerce.catalogue;

import tbansal.java.lessons.ecommerce.model.CatalogueItem;

import java.util.List;

public interface CatalogueServiceInterface {

    List<CatalogueItem> getItems(final String category);

    List<CatalogueItem> getAllClothes();
}
