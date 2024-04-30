package site.haloshop.backendtmdt.service;

import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.CategoryDto;
import site.haloshop.backendtmdt.dto.ProductDto;

import java.util.List;


@Service
public interface ProductService {
    public ProductDto findProductById(Long id);
    public List<ProductDto> getAllProduct();
    public List<ProductDto> findRelatedProducts(Long idProduct,Long subCategoryId);

}

