package com.example.letsgo.controller.market;

import com.example.letsgo.dao.ProductDao;
import com.example.letsgo.domain.market.Product;
import com.example.letsgo.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchProductController {
    private MarketService marketService;

    @Autowired
    public SearchProductController(MarketService marketService) {
        this.marketService = marketService;
    }

    @GetMapping("/market/searchByName")
    public String searchProductByName(@RequestParam("keyword") String productName, Model model) {
        List<Product> productList = marketService.searchProductByName(productName);
        model.addAttribute("productList", productList);
        return "market/SearchView";
    }

    @GetMapping("/market/searchByType")
    public String searchProductByType(@RequestParam("type") int productType, Model model) {
        List<Product> productList = marketService.searchProductByProductType(productType);
        model.addAttribute("productList", productList);
        return "market/SearchView";
    }

}
