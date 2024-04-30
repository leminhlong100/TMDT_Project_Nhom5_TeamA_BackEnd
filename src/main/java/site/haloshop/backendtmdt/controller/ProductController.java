package site.haloshop.backendtmdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.exception.AppException;
import site.haloshop.backendtmdt.exception.ErrorCode;
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
    public ResponseEntity<ProductDto> findProductById(@PathVariable String id){
        if (id == null || id.isEmpty()) {
            throw new AppException(ErrorCode.INVALID_PARAMETER);
        }
        return ResponseEntity.ok(productService.findProductById(id));
    }
    @GetMapping("/related")
    public ResponseEntity<List<ProductDto>> relatedProducts(@RequestParam String idProduct, @RequestParam String subCategoryId){
        if (idProduct == null || idProduct.isEmpty() || subCategoryId == null || subCategoryId.isEmpty()) {
            throw new AppException(ErrorCode.INVALID_PARAMETER);
        }
        return ResponseEntity.ok(productService.findRelatedProducts(idProduct,subCategoryId));
    }
}
