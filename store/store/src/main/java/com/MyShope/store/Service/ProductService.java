package com.MyShope.store.Service;

import com.MyShope.store.Entity.Category;
import com.MyShope.store.Entity.Product;
import com.MyShope.store.Repository.CategoryRepository;
import com.MyShope.store.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService
{
    @Autowired private ProductRepository productRepository;
    @Autowired private CategoryRepository categoryRepository;
    public List<Category> getCategory()
    {
        return categoryRepository.findAll();
    }
}
