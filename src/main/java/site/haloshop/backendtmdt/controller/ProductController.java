package site.haloshop.backendtmdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.request.ApiResponse;
import site.haloshop.backendtmdt.service.ProductService;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping()
    public ApiResponse<ResponseEntity<List<ProductDto>>> getAllProduct(){
        ApiResponse<ResponseEntity<List<ProductDto>>> apiResponse = new ApiResponse<>();
        apiResponse.setResult(ResponseEntity.ok(productService.getAllProduct()));
        return apiResponse;
    }
    @GetMapping("/detail/{id}")
    public ApiResponse<ResponseEntity<ProductDto>> findProductById(@PathVariable Long id){
        ApiResponse<ResponseEntity<ProductDto>> apiResponse = new ApiResponse<>();
        ProductDto product = productService.findProductById(id);
        apiResponse.setResult(ResponseEntity.ok(product));
        return apiResponse;
    }
    @GetMapping("/related")
    public ApiResponse<ResponseEntity<List<ProductDto>>> relatedProducts(@RequestParam Long idProduct, @RequestParam Long subCategoryId){
        ApiResponse<ResponseEntity<List<ProductDto>>> apiResponse = new ApiResponse<>();
        apiResponse.setResult(ResponseEntity.ok(productService.findRelatedProducts(idProduct,subCategoryId)));
        return apiResponse;
    }
}
