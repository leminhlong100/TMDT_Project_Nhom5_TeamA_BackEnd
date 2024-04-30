package site.haloshop.backendtmdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.service.ProductService;

import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping()
    public ResponseEntity<List<ProductDto>> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProduct());
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<ProductDto> findProductById(@PathVariable Long id){
        return ResponseEntity.ok(productService.findProductById(id));
    }
    @GetMapping("/related")
    public ResponseEntity<List<ProductDto>> relatedProducts(@RequestParam Long idProduct, @RequestParam Long subCategoryId){
        return ResponseEntity.ok(productService.findRelatedProducts(idProduct,subCategoryId));
    }
}
