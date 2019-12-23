package com.cscs.catalog;

import java.util.ArrayList;

import com.cscs.catalog.categories.Category;
import com.cscs.catalog.enums.CatalogType;
import com.cscs.catalog.products.Product;

/**
 * Catalog object
 * 
 * @author limedhash
 *
 */
public class Catalog {
	
	//Catalog namne
	private String name = "Default Catalog";
	//Catalog ID
	private String catalogID = "DefaultStoreID";
	// Catalog Type - Staging or Production
	private CatalogType catalogType;
	// ID of the Store where the catalog belongs
	private String storeID;
	//list of products assigned to this catalog
	private ArrayList<Product> products = new ArrayList<Product>();
	//list of categories assigned to this catalog
	private ArrayList<Category> categories = new ArrayList<Category>();
	
	/**
	 * Catalog name
	 * @return String - name of the catalog
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the catalog
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns he Catalog ID
	 * 
	 * @return String
	 */
	public String getCatalogID() {
		return catalogID;
	}
	
	/**
	 * Sets the catalogID 
	 * 
	 * @param catalogID
	 */
	public void setCatalogID(String catalogID) {
		this.catalogID = catalogID;
	}
	
	/**
	 * Returns the catalog type
	 * 
	 * @return com.cscs.catalog.enums.CatalogType
	 */
	public CatalogType getCatalogType() {
		return catalogType;
	}
	
	/**
	 * Sets the Catalog Type
	 * 
	 * @param catalogType
	 */
	public void setCatalogType(CatalogType catalogType) {
		this.catalogType = catalogType;
	}
	
	/**
	 * Returns the store ID assigned to this catalog
	 * 
	 * @return String
	 */
	public String getStoreID() {
		return storeID;
	}
	
	/**
	 * 
	 * Sets the store ID of the catalog
	 * 
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
}
