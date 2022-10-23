package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category + "Jdbc ile kategori veritabanına eklendi");
	
	}

}
