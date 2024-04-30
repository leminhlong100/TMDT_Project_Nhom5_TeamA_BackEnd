package site.haloshop.backendtmdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.service.ProductService;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping()
    public List<ProductDto> getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<ProductDto> findProductById(@PathVariable Long id){
        ProductDto product = productService.findProductById(id);
        return ResponseEntity.ok(product);
    }
    @GetMapping("/related")
    public List<ProductDto> relatedProducts(@RequestParam Long idProduct, @RequestParam Long subCategoryId){
        return productService.findRelatedProducts(idProduct,subCategoryId);
    }
}
