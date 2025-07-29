package com.MyShope.store.Service;

import com.MyShope.store.Entity.Category;
import com.MyShope.store.Repository.CategoryRepository;
import com.MyShope.store.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService
{
    @Autowired private CategoryRepository categoryRepository;

    public void addCategory(Category category)
    {
        categoryRepository.save(category);
    }
}
