package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManagement {
	private List<Category> categories;
private CategoryDao categoryDao;
private Logger[] loggers;

public CategoryManagement(CategoryDao categoryDao, Logger[] loggers ) {
	super();
	this.categoryDao= categoryDao;
	this.loggers= loggers;
	categories= new ArrayList<>();
}
public void add(Category category) throws Exception{
	for(Category categoryA : categories) {
		if (category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("Kategori ismi aynı olamaz");
		}
	}
categoryDao.add(category);
for(Logger logger : loggers) {
	logger.log(category.getCategoryName());
}



}

}
