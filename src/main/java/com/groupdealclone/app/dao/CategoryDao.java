package com.groupdealclone.app.dao;

import java.util.List;

import com.groupdealclone.app.domain.Category;

public interface CategoryDao {

	public List<Category> getCategories();
	
	public void setCategory(Category category);

	public Category getCategory(String name);
	
	public Category getCategory(Long id);

	public void updateCategory(Category category);
	
	
}
