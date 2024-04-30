package site.haloshop.backendtmdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.haloshop.backendtmdt.dto.CategoryDto;
import site.haloshop.backendtmdt.request.ApiResponse;
import site.haloshop.backendtmdt.service.CategoryService;

import java.sql.SQLDataException;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping()
    public ApiResponse<ResponseEntity<List<CategoryDto>>> getAllProduct() {
        ApiResponse<ResponseEntity<List<CategoryDto>>> apiResponse = new ApiResponse<>();
        apiResponse.setResult(ResponseEntity.ok(categoryService.getAllCategory()));
        return apiResponse;
    }
}
