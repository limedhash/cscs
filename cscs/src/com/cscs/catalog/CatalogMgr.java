package com.cscs.catalog;

public class CatalogMgr {

	private static CatalogMgr catalogMgr = null;
	
	private CatalogMgr() {
		
	}
	
	public static CatalogMgr getInstance() {
		if(catalogMgr == null) {
			return 	catalogMgr;
		} else {
			return new CatalogMgr();
		}
	}
	
	public static Catalog getCatalogByID(String catalogID) {
		Catalog catalog = null;
		
		return catalog;
	}
}
