package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category + "Hibernate ile veritabanına kategori eklendi" );
		
	}

}
