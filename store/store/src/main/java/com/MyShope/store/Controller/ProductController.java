package com.MyShope.store.Controller;
import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;
import com.MyShope.store.Entity.Category;
import com.MyShope.store.Entity.Product;
import com.MyShope.store.Service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController
{
    @Autowired
    ProductService productService;

    @GetMapping("/addProduct")
    public String showAddProductForm(Model model) {
        List<Category> categories = productService.getCategory();
        model.addAttribute("categories", categories);
        model.addAttribute("product", new Product()); // assuming you’re using form binding
        return "addProduct";
    }


}
