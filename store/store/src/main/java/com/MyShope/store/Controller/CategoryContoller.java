package com.MyShope.store.Controller;

import ch.qos.logback.core.model.Model;
import com.MyShope.store.Entity.Category;
import com.MyShope.store.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryContoller
{
    @Autowired
    CategoryService categoryService;
    @GetMapping("/categoryIndex")
    public String categoryList()
    {
        return "categoryIndex";
    }
    @GetMapping("/addCategory")
    public String showAddCategoryForm(@ModelAttribute Model model) {
        return "addCategory";
    }
    @PostMapping("/addCategory")
    public String addCategory(@RequestParam String name,
                               @RequestParam String description) {
        Category category = new Category();
        category.Name = name;
        category.Despriction = description;
        categoryService.addCategory(category);
        return "redirect:/categoryIndex";
    }

}
