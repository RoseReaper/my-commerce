package com.cgi.mycommerce.dao;

import java.util.List;

import com.cgi.mycommerce.entity.Category;

public interface CategoryDao {
	
	void createCategory(Category category);

	Category findCategoryById(Long id);

	void updateCategory(Category category);

	void removeCategory(Long id);

	List<Category> findAllCategories();

}
